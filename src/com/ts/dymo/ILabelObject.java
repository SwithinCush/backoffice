package com.ts.dymo  ;

import com4j.*;

/**
 * IVarObjectList Interface
 */
@IID("{5A2D8040-A8A4-11D2-A5D4-0040054349AF}")
public interface ILabelObject extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ObjType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  int objType();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  void name(
    java.lang.String name);


  /**
   * <p>
   * Getter method for the COM property "X"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(10)
  int x();


  /**
   * <p>
   * Setter method for the COM property "X"
   * </p>
   * @param x Mandatory int parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  void x(
    int x);


  /**
   * <p>
   * Getter method for the COM property "Y"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  int y();


  /**
   * <p>
   * Setter method for the COM property "Y"
   * </p>
   * @param y Mandatory int parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  void y(
    int y);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(14)
  int width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param width Mandatory int parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  void width(
    int width);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  int height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param height Mandatory int parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  void height(
    int height);


  /**
   * <p>
   * Getter method for the COM property "Rotation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(18)
  int rotation();


  /**
   * <p>
   * Setter method for the COM property "Rotation"
   * </p>
   * @param rotation Mandatory int parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(19)
  void rotation(
    int rotation);


  // Properties:
}
