/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ts.ch.gui;

import java.util.List;
import org.scopemvc.core.Selector;
import org.scopemvc.model.basic.BasicModel;

/**
 * Class CertifiedHelperModel
 *
 * @author daibheid
 */
public class CertifiedHelperModel extends BasicModel {

    public static final Selector TRACKING_NUMBER = Selector.fromString("trackingNumber");
    public static final Selector ADDRESS_TO = Selector.fromString("addressTo");
    public static final Selector ADDRESS_FROM = Selector.fromString("addressFrom");
    public static final Selector PRINTERS = Selector.fromString("printers");
    public static final Selector SELECTED_PRINTER = Selector.fromString("selectedPrinter");
    public static final Selector TWIN_TURBO_PRINTER = Selector.fromString("twinTurboPrinter");
    
    private String trackingNumber;
    private String addressTo;
    private String addressFrom;
    private List<String> printers;
    private String selectedPrinter;
    private int selectedTray;
    private boolean twinTurboPrinter;

    public String getTrackingNumber()
    {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber)
    {
        this.trackingNumber = trackingNumber;
        fireModelChange(VALUE_CHANGED, TRACKING_NUMBER);
    }

    public String getAddressTo()
    {
        return addressTo;
    }

    public void setAddressTo(String addressTo)
    {
        this.addressTo = addressTo;
        fireModelChange(VALUE_CHANGED, ADDRESS_TO);
    }

    public String getAddressFrom()
    {
        return addressFrom;
    }

    public void setAddressFrom(String addressFrom)
    {
        this.addressFrom = addressFrom;
        fireModelChange(VALUE_CHANGED, ADDRESS_FROM);
    }

    public List<String> getPrinters()
    {
        return printers;
    }

    public void setPrinters(List<String> printers)
    {
        this.printers = printers;
    }

    public String getSelectedPrinter()
    {
        return selectedPrinter;
    }

    public void setSelectedPrinter(String selectedPrinter)
    {
        this.selectedPrinter = selectedPrinter;
    }

    public int getSelectedTray()
    {
        return selectedTray;
    }

    public void setSelectedTray(int selectedTray)
    {
        this.selectedTray = selectedTray;
    }

    public boolean isTwinTurboPrinter()
    {
        return twinTurboPrinter;
    }

    public void setTwinTurboPrinter(boolean twinTurboPrinter)
    {
        this.twinTurboPrinter = twinTurboPrinter;
    }
    
    
} 

