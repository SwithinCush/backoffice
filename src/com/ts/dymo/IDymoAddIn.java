package com.ts.dymo  ;

import com4j.*;

/**
 * IDymoAddIn Interface
 */
@IID("{09DAFAE1-8EB0-11D2-8E5D-00A02415E90F}")
public interface IDymoAddIn extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Open a label file.
   * </p>
   * @param fileName Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  boolean open(
    java.lang.String fileName);


  /**
   * <p>
   * Save current label file.
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  boolean save();


  /**
   * <p>
   * Save current label file using new name.
   * </p>
   * @param fileName Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  boolean saveAs(
    java.lang.String fileName);


  /**
   * <p>
   * Print current label.
   * </p>
   * @param copies Mandatory int parameter.
   * @param bShowDialog Mandatory boolean parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  boolean print(
    int copies,
    boolean bShowDialog);


  /**
   * <p>
   * Hide application.
   * </p>
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  void hide();


  /**
   * <p>
   * Show application.
   * </p>
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  void show();


  /**
   * <p>
   * Add/remove icon from System tray.
   * </p>
   * @param state Mandatory boolean parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(13)
  void sysTray(
    boolean state);


  /**
   * <p>
   * Quit program.
   * </p>
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(14)
  void quit();


  /**
   * <p>
   * Returns current file name.
   * </p>
   * <p>
   * Getter method for the COM property "FileName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String fileName();


  /**
   * <p>
   * Change Printer
   * </p>
   * @param printer Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(16)
  boolean selectPrinter(
    java.lang.String printer);


  /**
   * <p>
   * Return list of all DYMO printers
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String getDymoPrinters();


  // Properties:
}
