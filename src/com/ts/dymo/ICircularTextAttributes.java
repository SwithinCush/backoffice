package com.ts.dymo  ;

import com4j.*;

/**
 * ICircularTextAttributes Interface
 */
@IID("{46972731-A540-4602-A0F6-8EFB98F5C82B}")
public interface ICircularTextAttributes extends Com4jObject {
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
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String font();


  /**
   * <p>
   * Setter method for the COM property "Font"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  void font(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "Mirrored"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  boolean mirrored();


  /**
   * <p>
   * Setter method for the COM property "Mirrored"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  void mirrored(
    boolean value);


  /**
   * <p>
   * Getter method for the COM property "DisplayMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  int displayMode();


  /**
   * <p>
   * Setter method for the COM property "DisplayMode"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  void displayMode(
    int value);


  /**
   * <p>
   * Getter method for the COM property "TextColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  int textColor();


  /**
   * <p>
   * Setter method for the COM property "TextColor"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  void textColor(
    int value);


  /**
   * <p>
   * Getter method for the COM property "BackGroundColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  int backGroundColor();


  /**
   * <p>
   * Setter method for the COM property "BackGroundColor"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  void backGroundColor(
    int value);


  // Properties:
}
