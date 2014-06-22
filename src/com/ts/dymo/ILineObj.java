package com.ts.dymo  ;

import com4j.*;

/**
 * ILineObj Interface
 */
@IID("{247905C0-AA37-11D2-A5D4-0040054349AF}")
public interface ILineObj extends com.ts.dymo.ILabelObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Length"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(20)
  int length();


  /**
   * <p>
   * Setter method for the COM property "Length"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  void length(
    int value);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(22)
  int orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(23)
  void orientation(
    int value);


  /**
   * <p>
   * Getter method for the COM property "Thickness"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(24)
  int thickness();


  /**
   * <p>
   * Setter method for the COM property "Thickness"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(25)
  void thickness(
    int value);


  /**
   * <p>
   * Getter method for the COM property "LineColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(26)
  int lineColor();


  /**
   * <p>
   * Setter method for the COM property "LineColor"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(27)
  void lineColor(
    int value);


  // Properties:
}
