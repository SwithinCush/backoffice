package com.ts.dymo  ;

import com4j.*;

/**
 * ILabelEngine Interface
 */
@IID("{1CE3FE81-8EBE-11D2-A3BA-0000E8D57653}")
public interface ILabelEngine extends Com4jObject {
  // Methods:
  /**
   * @return  Returns a value of type com.ts.dymo.ILabelList
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
    com.ts.dymo.ILabelList labelNames();


  @VTID(7)
  @ReturnValue(defaultPropertyThrough={com.ts.dymo.ILabelList.class})
  java.lang.String labelNames(
    int index);

  /**
   * @return  Returns a value of type com.ts.dymo.ILblInfo
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
    com.ts.dymo.ILblInfo labelInfo();


  /**
   * @return  Returns a value of type com.ts.dymo.IPrintObject
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
    com.ts.dymo.IPrintObject printObject();


  /**
   * @param labelType Mandatory java.lang.String parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  void newLabel(
    java.lang.String labelType);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  boolean openFile(
    java.lang.String fileName);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  boolean saveFile(
    java.lang.String fileName);


  /**
   * @param deviceName Mandatory java.lang.String parameter.
   * @param port Mandatory java.lang.String parameter.
   * @param quantity Mandatory int parameter.
   * @param bShowDialog Mandatory boolean parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(13)
  boolean printLabel(
    java.lang.String deviceName,
    java.lang.String port,
    int quantity,
    boolean bShowDialog);


  /**
   * @param dc Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(14)
  boolean output(
    int dc);


  /**
   * @param dc Mandatory int parameter.
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(15)
  boolean outputXY(
    int dc,
    int x,
    int y);


  /**
   * @param dc Mandatory int parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(16)
  void drawLabel(
    int dc);


  /**
   * <p>
   * Setter method for the COM property "Zoom"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(17)
  void zoom(
    int rhs);


  /**
   * <p>
   * Setter method for the COM property "Shadow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(18)
  void shadow(
    boolean rhs);


  /**
   * @param text Mandatory java.lang.String parameter.
   * @param bcType Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(19)
  int validateBarCode(
    java.lang.String text,
    int bcType);


  // Properties:
}
