package com.ts.dymo  ;

import com4j.*;

/**
 * ICircularTextObj Interface
 */
@IID("{C7FE305D-A385-4491-8100-08541970D37F}")
public interface ICircularTextObj extends com.ts.dymo.ILabelObject {
  // Methods:
  /**
   * @return  Returns a value of type com.ts.dymo.ICircularTextAttributes
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(20)
    com.ts.dymo.ICircularTextAttributes textAttributes();


  /**
   * <p>
   * Getter method for the COM property "IsVariable"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(21)
  boolean isVariable();


  /**
   * <p>
   * Setter method for the COM property "IsVariable"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(22)
  void isVariable(
    boolean value);


  // Properties:
}
