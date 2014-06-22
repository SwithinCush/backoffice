/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ts.ch.gui;

import com.googlecode.genericdao.dao.hibernate.GeneralDAOImpl;
import com.googlecode.genericdao.search.Search;
import com.ts.dymo.ClassFactory;
import com.ts.dymo.IDymoAddin6;
import com.ts.dymo.IDymoLabels;
import com.ts.pm.PmDatabase;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.scopemvc.controller.basic.BasicController;
import org.scopemvc.core.Control;
import org.scopemvc.core.ControlException;
import com.ts.pm.Package;
import java.awt.Cursor;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.jdesktop.application.Application;
import org.jdesktop.application.Task;

/**
 * Class CertifiedHelperController
 *
 * @author daibheid
 */
public class CertifiedHelperController extends BasicController
{

    public static final String LABEL_FILE = "CertifiedHelper.label";

    private PmDatabase database;

    private IDymoAddin6 dymoAddIn;

    private IDymoLabels dymoLabels;

    public CertifiedHelperController(PmDatabase database)
    {
        this.database = database;
        setModelAndView(new CertifiedHelperModel(), new CertifiedHelperView());

        new Task<Void, Void>(Application.getInstance())
        {

            public Void doInBackground()
            {
                CertifiedHelperModel m = (CertifiedHelperModel) CertifiedHelperController.this.getModel();
                CertifiedHelperView v = (CertifiedHelperView) CertifiedHelperController.this.getView();
                v.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

                try {

                    dymoAddIn = ClassFactory.createDymoAddIn();
                    dymoLabels = ClassFactory.createDymoLabels();

                    dymoAddIn.open(LABEL_FILE);

                    // Setup printer list
                    List<String> printerArray = new ArrayList<String>();
                    String prtNames = dymoAddIn.getDymoPrinters();
                    if (prtNames != null) {
                        // parse the result
                        String[] names = prtNames.split("\\|");
                        for (String name : names) {
                            printerArray.add(name);
                        }
                        m.setPrinters(printerArray);

                        prtNames = dymoAddIn.getCurrentPrinterName();
                        if (prtNames != null) {
                            m.setSelectedPrinter(prtNames);
                        } else {
                            m.setSelectedPrinter("");

                        }
                    }
                    
                    // Check if selected/current printer is a twin tubro printer
                    m.setTwinTurboPrinter(dymoAddIn.isTwinTurboPrinter(m.getSelectedPrinter()));
                }
                catch (Exception e) {

                }
                finally {
                    v.setCursor(Cursor.getDefaultCursor());
                }

                return null;
            }

        }.execute();

    }

    @Override
    protected void doHandleControl(Control cntrl) throws ControlException
    {
        switch (cntrl.getID()) {

            case "printers":
                doPrinterChanged();
                cntrl.markMatched();
                break;
                
            case "txtTrackingNumber":
                format();
                cntrl.markMatched();
                break;

            case "cmdSearch":
                doSearch();
                cntrl.markMatched();
                break;

            case "cmdPrint":
                doPrint();
                doReset();
                cntrl.markMatched();
                break;
        }
    }

    private void format()
    {
        CertifiedHelperModel model = (CertifiedHelperModel) getModel();
        String trackingNumber = model.getTrackingNumber();
        if (StringUtils.isNotBlank(trackingNumber) && (trackingNumber.length() > 22)) {
            trackingNumber = trackingNumber.substring(trackingNumber.length() - 22);
            ((CertifiedHelperModel) getModel()).setTrackingNumber(trackingNumber);
        }

    }

    private void doSearch()
    {
        try {
            CertifiedHelperModel model = (CertifiedHelperModel) getModel();
            String trackingNumber = model.getTrackingNumber();

            SessionFactory sf = database.buildSesionFactory();
            Session session = sf.getCurrentSession();
            session.beginTransaction();

            GeneralDAOImpl dao = new GeneralDAOImpl();
            dao.setSessionFactory(sf);

            Search search = new Search(Package.class
            );
            search.addFilterEqual(
                    "trackingNumber", trackingNumber);
            Package p = (Package) dao.searchUnique(search);

            model.setAddressFrom(p.getShipment().getCustomer().getMailingAddress());
            model.setAddressTo(p.getShipment().getShipToMailingAddress());

            session.getTransaction()
                    .commit();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void doPrint()
    {
        System.out.println("Printing...");
    }

    private void doPrinterChanged() {
        System.out.println("Printer changed...");
    }
    
    private void doReset()
    {
        CertifiedHelperModel model = (CertifiedHelperModel) getModel();
        model.setTrackingNumber("");
        model.setAddressFrom("");
        model.setAddressTo("");
    }

}
