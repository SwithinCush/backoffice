package com.ts.dymo  ;

import com4j.*;

/**
 * ITextAttributes2 Interface
 */
@IID("{5FCCEB09-361D-42A4-B692-A657961E294A}")
public interface ITextAttributes2 extends com.ts.dymo.ITextAttributes {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "RichText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String richText();


  /**
   * <p>
   * Setter method for the COM property "RichText"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(26)
  void richText(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "ShadowEffect"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(27)
  boolean shadowEffect();


  /**
   * <p>
   * Setter method for the COM property "ShadowEffect"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(28)
  void shadowEffect(
    boolean value);


  /**
   * <p>
   * Getter method for the COM property "OutlineEffect"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(29)
  boolean outlineEffect();


  /**
   * <p>
   * Setter method for the COM property "OutlineEffect"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(30)
  void outlineEffect(
    boolean value);


  // Properties:
}
