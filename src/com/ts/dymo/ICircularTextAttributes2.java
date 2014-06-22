package com.ts.dymo  ;

import com4j.*;

/**
 * ICircularTextAttributes2 Interface
 */
@IID("{08948F61-3396-42C9-9ACD-1D828D40BB14}")
public interface ICircularTextAttributes2 extends com.ts.dymo.ICircularTextAttributes {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "CenteredOnLabel"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(19)
  boolean centeredOnLabel();


  /**
   * <p>
   * Setter method for the COM property "CenteredOnLabel"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(20)
  void centeredOnLabel(
    boolean value);


  // Properties:
}
