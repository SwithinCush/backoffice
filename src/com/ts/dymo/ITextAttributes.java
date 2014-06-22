package com.ts.dymo  ;

import com4j.*;

/**
 * ITextAttributes Interface
 */
@IID("{5A2D8042-A8A4-11D2-A5D4-0040054349AF}")
public interface ITextAttributes extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String text();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  void text(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "Font_1"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String font_1();


  /**
   * <p>
   * Setter method for the COM property "Font_1"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  void font_1(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "Font_2"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String font_2();


  /**
   * <p>
   * Setter method for the COM property "Font_2"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  void font_2(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "Justify"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  int justify();


  /**
   * <p>
   * Setter method for the COM property "Justify"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  void justify(
    int value);


  /**
   * <p>
   * Getter method for the COM property "VJustify"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  int vJustify();


  /**
   * <p>
   * Setter method for the COM property "VJustify"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  void vJustify(
    int value);


  /**
   * <p>
   * Getter method for the COM property "Mirrored"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  boolean mirrored();


  /**
   * <p>
   * Setter method for the COM property "Mirrored"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  void mirrored(
    boolean value);


  /**
   * <p>
   * Getter method for the COM property "Vertical"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(19)
  boolean vertical();


  /**
   * <p>
   * Setter method for the COM property "Vertical"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(20)
  void vertical(
    boolean value);


  /**
   * <p>
   * Getter method for the COM property "TextColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  int textColor();


  /**
   * <p>
   * Setter method for the COM property "TextColor"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(22)
  void textColor(
    int value);


  /**
   * <p>
   * Getter method for the COM property "BackGroundColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(23)
  int backGroundColor();


  /**
   * <p>
   * Setter method for the COM property "BackGroundColor"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(24)
  void backGroundColor(
    int value);


  // Properties:
}
