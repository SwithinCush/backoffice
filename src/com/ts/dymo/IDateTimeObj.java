package com.ts.dymo  ;

import com4j.*;

/**
 * IDateTimeObj Interface
 */
@IID("{247905CA-AA37-11D2-A5D4-0040054349AF}")
public interface IDateTimeObj extends com.ts.dymo.ILabelObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "PreText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String preText();


  /**
   * <p>
   * Setter method for the COM property "PreText"
   * </p>
   * @param preText Mandatory java.lang.String parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  void preText(
    java.lang.String preText);


  /**
   * <p>
   * Getter method for the COM property "PostText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String postText();


  /**
   * <p>
   * Setter method for the COM property "PostText"
   * </p>
   * @param postText Mandatory java.lang.String parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(23)
  void postText(
    java.lang.String postText);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(24)
  int format();


  /**
   * <p>
   * Setter method for the COM property "Format"
   * </p>
   * @param format Mandatory int parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(25)
  void format(
    int format);


  /**
   * <p>
   * Getter method for the COM property "IncludeTime"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(26)
  boolean includeTime();


  /**
   * <p>
   * Setter method for the COM property "IncludeTime"
   * </p>
   * @param includeTime Mandatory boolean parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(27)
  void includeTime(
    boolean includeTime);


  /**
   * <p>
   * Getter method for the COM property "b24Hour"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(28)
  boolean b24Hour();


  /**
   * <p>
   * Setter method for the COM property "b24Hour"
   * </p>
   * @param b24Hour Mandatory boolean parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(29)
  void b24Hour(
    boolean b24Hour);


  /**
   * @return  Returns a value of type com.ts.dymo.ITextAttributes
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(30)
    com.ts.dymo.ITextAttributes textAttributes();


  // Properties:
}
