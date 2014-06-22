package com.ts.dymo  ;

import com4j.*;

/**
 * ICounterObj Interface
 */
@IID("{247905C8-AA37-11D2-A5D4-0040054349AF}")
public interface ICounterObj extends com.ts.dymo.ILabelObject {
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
   * Getter method for the COM property "Start"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(24)
  int start();


  /**
   * <p>
   * Setter method for the COM property "Start"
   * </p>
   * @param start Mandatory int parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(25)
  void start(
    int start);


  /**
   * <p>
   * Getter method for the COM property "Current"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(26)
  int current();


  /**
   * <p>
   * Setter method for the COM property "Current"
   * </p>
   * @param current Mandatory int parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(27)
  void current(
    int current);


  /**
   * <p>
   * Getter method for the COM property "MinWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(28)
  int minWidth();


  /**
   * <p>
   * Setter method for the COM property "MinWidth"
   * </p>
   * @param minWidth Mandatory int parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(29)
  void minWidth(
    int minWidth);


  /**
   * <p>
   * Getter method for the COM property "Increment"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(30)
  int increment();


  /**
   * <p>
   * Setter method for the COM property "Increment"
   * </p>
   * @param increment Mandatory int parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(31)
  void increment(
    int increment);


  /**
   * <p>
   * Getter method for the COM property "UseLeadingZeros"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(32)
  boolean useLeadingZeros();


  /**
   * <p>
   * Setter method for the COM property "UseLeadingZeros"
   * </p>
   * @param useLeadingZeros Mandatory boolean parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(33)
  void useLeadingZeros(
    boolean useLeadingZeros);


  /**
   * @return  Returns a value of type com.ts.dymo.ITextAttributes
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(34)
    com.ts.dymo.ITextAttributes textAttributes();


  // Properties:
}
