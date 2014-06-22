package com.ts.dymo  ;

import com4j.*;

/**
 * IRectObj Interface
 */
@IID("{708E2FC0-A975-11D2-A5D4-0040054349AF}")
public interface IRectObj extends com.ts.dymo.ILabelObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "bFilled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(20)
  boolean bFilled();


  /**
   * <p>
   * Setter method for the COM property "bFilled"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  void bFilled(
    boolean value);


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(22)
  int border();


  /**
   * <p>
   * Setter method for the COM property "Border"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(23)
  void border(
    int value);


  /**
   * <p>
   * Getter method for the COM property "BorderColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(24)
  int borderColor();


  /**
   * <p>
   * Setter method for the COM property "BorderColor"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(25)
  void borderColor(
    int value);


  /**
   * <p>
   * Getter method for the COM property "FillColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(26)
  int fillColor();


  /**
   * <p>
   * Setter method for the COM property "FillColor"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(27)
  void fillColor(
    int value);


  // Properties:
}
