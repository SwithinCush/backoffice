/*
 * Created by JFormDesigner on Fri Jun 20 23:40:16 PDT 2014
 */

package com.ts.ch.gui;

import java.awt.*;
import javax.swing.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;
import org.scopemvc.view.swing.*;

/**
 * @author David Jordan
 */
public class CertifiedHelperView extends SPanel {
    public CertifiedHelperView() {
        initComponents();
        bindComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner non-commercial license
		dialogPane = new JPanel();
		contentPanel = new JPanel();
		lblTrackingNumber = new JLabel();
		txtTrackingNumber = new STextField();
		sButton1 = new SButton();
		lblAddressFrom = new JLabel();
		scrollPane1 = new JScrollPane();
		txtAddressFrom = new STextArea();
		lblAddressTo = new JLabel();
		scrollPane2 = new JScrollPane();
		txtAddressTo = new STextArea();
		cmdPrint = new SButton();
		lblPrinters = new JLabel();
		cbxPrinters = new SComboBox();
		label5 = new JLabel();
		cbxTray = new SComboBox();
		buttonBar = new JPanel();
		closeButton = new SButton();

		//======== this ========
		setBorder(null);
		setDefaultButton(closeButton);
		setDisplayMode(1);
		setName("this");
		setLayout(new BorderLayout());

		//======== dialogPane ========
		{
			dialogPane.setBorder(Borders.DIALOG_BORDER);
			dialogPane.setName("dialogPane");
			dialogPane.setLayout(new BorderLayout());

			//======== contentPanel ========
			{
				contentPanel.setName("contentPanel");
				contentPanel.setLayout(new FormLayout(
					"default, $lcgap, pref, $lcgap, default",
					"4*(default, $lgap), default"));

				//---- lblTrackingNumber ----
				lblTrackingNumber.setText("Tracking Number:");
				lblTrackingNumber.setHorizontalAlignment(SwingConstants.RIGHT);
				lblTrackingNumber.setName("lblTrackingNumber");
				contentPanel.add(lblTrackingNumber, CC.xy(1, 1));

				//---- txtTrackingNumber ----
				txtTrackingNumber.setControlID("txtTrackingNumber");
				txtTrackingNumber.setColumns(26);
				txtTrackingNumber.setEnabled(true);
				txtTrackingNumber.setName("txtTrackingNumber");
				contentPanel.add(txtTrackingNumber, CC.xy(3, 1));

				//---- sButton1 ----
				sButton1.setText("Search");
				sButton1.setControlID("cmdSearch");
				sButton1.setMnemonic('S');
				sButton1.setName("sButton1");
				contentPanel.add(sButton1, CC.xy(5, 1));

				//---- lblAddressFrom ----
				lblAddressFrom.setText("From:");
				lblAddressFrom.setHorizontalAlignment(SwingConstants.RIGHT);
				lblAddressFrom.setName("lblAddressFrom");
				contentPanel.add(lblAddressFrom, CC.xy(1, 3));

				//======== scrollPane1 ========
				{
					scrollPane1.setName("scrollPane1");

					//---- txtAddressFrom ----
					txtAddressFrom.setRows(5);
					txtAddressFrom.setEditable(false);
					txtAddressFrom.setEnabled(true);
					txtAddressFrom.setName("txtAddressFrom");
					scrollPane1.setViewportView(txtAddressFrom);
				}
				contentPanel.add(scrollPane1, CC.xy(3, 3));

				//---- lblAddressTo ----
				lblAddressTo.setText("To:");
				lblAddressTo.setHorizontalAlignment(SwingConstants.TRAILING);
				lblAddressTo.setName("lblAddressTo");
				contentPanel.add(lblAddressTo, CC.xy(1, 5));

				//======== scrollPane2 ========
				{
					scrollPane2.setName("scrollPane2");

					//---- txtAddressTo ----
					txtAddressTo.setRows(5);
					txtAddressTo.setEditable(false);
					txtAddressTo.setEnabled(true);
					txtAddressTo.setName("txtAddressTo");
					scrollPane2.setViewportView(txtAddressTo);
				}
				contentPanel.add(scrollPane2, CC.xy(3, 5));

				//---- cmdPrint ----
				cmdPrint.setText("Print");
				cmdPrint.setControlID("cmdPrint");
				cmdPrint.setName("cmdPrint");
				contentPanel.add(cmdPrint, CC.xy(5, 5));

				//---- lblPrinters ----
				lblPrinters.setText("Printers:");
				lblPrinters.setHorizontalAlignment(SwingConstants.RIGHT);
				lblPrinters.setName("lblPrinters");
				contentPanel.add(lblPrinters, CC.xy(1, 7));

				//---- cbxPrinters ----
				cbxPrinters.setName("cbxPrinters");
				contentPanel.add(cbxPrinters, CC.xy(3, 7));

				//---- label5 ----
				label5.setText("Trays:");
				label5.setHorizontalAlignment(SwingConstants.RIGHT);
				label5.setName("label5");
				contentPanel.add(label5, CC.xy(1, 9));

				//---- cbxTray ----
				cbxTray.setName("cbxTray");
				contentPanel.add(cbxTray, CC.xy(3, 9));
			}
			dialogPane.add(contentPanel, BorderLayout.CENTER);

			//======== buttonBar ========
			{
				buttonBar.setBorder(Borders.BUTTON_BAR_GAP_BORDER);
				buttonBar.setName("buttonBar");
				buttonBar.setLayout(new FormLayout(
					"$glue, $button",
					"pref"));

				//---- closeButton ----
				closeButton.setText("Close");
				closeButton.setName("closeButton");
				buttonBar.add(closeButton, CC.xy(2, 1));
			}
			dialogPane.add(buttonBar, BorderLayout.SOUTH);
		}
		add(dialogPane, BorderLayout.CENTER);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    private void bindComponents() {
        this.setTitle("Certified Helper");
        closeButton.setControlID("_exit");
        txtTrackingNumber.setSelector("trackingNumber");
        txtAddressTo.setSelector("addressTo");
        txtAddressFrom.setSelector("addressFrom");
        cbxPrinters.setChangeSelectionControlID("PrinterChanged");
        cbxPrinters.setSelector("printers");
        cbxPrinters.setSelectionSelector("selectedPrinter");
    }
    
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner non-commercial license
	private JPanel dialogPane;
	private JPanel contentPanel;
	private JLabel lblTrackingNumber;
	private STextField txtTrackingNumber;
	private SButton sButton1;
	private JLabel lblAddressFrom;
	private JScrollPane scrollPane1;
	private STextArea txtAddressFrom;
	private JLabel lblAddressTo;
	private JScrollPane scrollPane2;
	private STextArea txtAddressTo;
	private SButton cmdPrint;
	private JLabel lblPrinters;
	private SComboBox cbxPrinters;
	private JLabel label5;
	private SComboBox cbxTray;
	private JPanel buttonBar;
	private SButton closeButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
