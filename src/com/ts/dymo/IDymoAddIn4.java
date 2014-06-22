package com.ts.dymo  ;

import com4j.*;

/**
 * IDymoAddIn4 Interface
 */
@IID("{BAEE49F8-741A-4D5F-B807-CD60F938C427}")
public interface IDymoAddIn4 extends com.ts.dymo.IDymoAddIn3 {
  // Methods:
  /**
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(26)
  void startPrintJob();


  /**
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(27)
  void endPrintJob();


  /**
   * @param printerName Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(28)
  boolean isTwinTurboPrinter(
    java.lang.String printerName);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(29)
  java.lang.String getCurrentPrinterName();


  // Properties:
}
