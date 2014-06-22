package com.ts.dymo  ;

import com4j.*;

/**
 * IBarCodeObj Interface
 */
@IID("{247905C2-AA37-11D2-A5D4-0040054349AF}")
public interface IBarCodeObj extends com.ts.dymo.ILabelObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String text();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param text Mandatory java.lang.String parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  void text(
    java.lang.String text);


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String font();


  /**
   * <p>
   * Setter method for the COM property "Font"
   * </p>
   * @param font Mandatory java.lang.String parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(23)
  void font(
    java.lang.String font);


  /**
   * <p>
   * Getter method for the COM property "TextPos"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(24)
  int textPos();


  /**
   * <p>
   * Setter method for the COM property "TextPos"
   * </p>
   * @param textPos Mandatory int parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(25)
  void textPos(
    int textPos);


  /**
   * <p>
   * Getter method for the COM property "BCType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(26)
  int bcType();


  /**
   * <p>
   * Setter method for the COM property "BCType"
   * </p>
   * @param bcType Mandatory int parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(27)
  void bcType(
    int bcType);


  /**
   * <p>
   * Getter method for the COM property "Size"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(28)
  int size();


  /**
   * <p>
   * Setter method for the COM property "Size"
   * </p>
   * @param size Mandatory int parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(29)
  void size(
    int size);


  /**
   * <p>
   * Getter method for the COM property "Justify"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(30)
  int justify();


  /**
   * <p>
   * Setter method for the COM property "Justify"
   * </p>
   * @param justify Mandatory int parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(31)
  void justify(
    int justify);


  /**
   * <p>
   * Getter method for the COM property "Link"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(32)
  int link();


  /**
   * <p>
   * Setter method for the COM property "Link"
   * </p>
   * @param link Mandatory int parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(33)
  void link(
    int link);


  // Properties:
}
