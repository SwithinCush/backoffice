package com.ts.dymo  ;

import com4j.*;

/**
 * IDymoAddIn3 Interface
 */
@IID("{7E449759-5FB0-4CE6-AD4E-D7CD776A995D}")
public interface IDymoAddIn3 extends com.ts.dymo.IDymoAddIn2 {
  // Methods:
  /**
   * @param copies Mandatory int parameter.
   * @param bShowDlg Mandatory boolean parameter.
   * @param tray Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(24)
  boolean print2(
    int copies,
    boolean bShowDlg,
    int tray);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(25)
  int getCurrentPaperTray();


  // Properties:
}
