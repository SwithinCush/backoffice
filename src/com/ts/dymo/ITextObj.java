package com.ts.dymo  ;

import com4j.*;

/**
 * ITextObj Interface
 */
@IID("{5A2D8044-A8A4-11D2-A5D4-0040054349AF}")
public interface ITextObj extends com.ts.dymo.ILabelObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "IsVariable"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(20)
  boolean isVariable();


  /**
   * <p>
   * Setter method for the COM property "IsVariable"
   * </p>
   * @param isVariable Mandatory boolean parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  void isVariable(
    boolean isVariable);


  /**
   * @return  Returns a value of type com.ts.dymo.ITextAttributes
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(22)
    com.ts.dymo.ITextAttributes textAttributes();


  // Properties:
}
