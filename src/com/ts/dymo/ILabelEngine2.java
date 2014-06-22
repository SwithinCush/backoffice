package com.ts.dymo  ;

import com4j.*;

/**
 * ILabelEngine2 Interface
 */
@IID("{C2E3FC96-B51C-49C9-BE36-331A76E20F64}")
public interface ILabelEngine2 extends com.ts.dymo.ILabelEngine {
  // Methods:
  /**
   * @param deviceName Mandatory java.lang.String parameter.
   * @param port Mandatory java.lang.String parameter.
   * @param quantity Mandatory int parameter.
   * @param bShowDlg Mandatory boolean parameter.
   * @param tray Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(301) //= 0x12d. The runtime will prefer the VTID if present
  @VTID(20)
  boolean printLabelEx(
    java.lang.String deviceName,
    java.lang.String port,
    int quantity,
    boolean bShowDlg,
    int tray);


  // Properties:
}
