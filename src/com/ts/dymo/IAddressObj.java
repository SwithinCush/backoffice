package com.ts.dymo  ;

import com4j.*;

/**
 * IAddressObj Interface
 */
@IID("{247905C6-AA37-11D2-A5D4-0040054349AF}")
public interface IAddressObj extends com.ts.dymo.ILabelObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "BarCodePosition"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(20)
  int barCodePosition();


  /**
   * <p>
   * Setter method for the COM property "BarCodePosition"
   * </p>
   * @param barCodePosition Mandatory int parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  void barCodePosition(
    int barCodePosition);


  /**
   * <p>
   * Getter method for the COM property "b9DigitOnly"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(22)
  boolean b9DigitOnly();


  /**
   * <p>
   * Setter method for the COM property "b9DigitOnly"
   * </p>
   * @param b9DigitOnly Mandatory boolean parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(23)
  void b9DigitOnly(
    boolean b9DigitOnly);


  /**
   * @return  Returns a value of type com.ts.dymo.ITextAttributes
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(24)
    com.ts.dymo.ITextAttributes textAttributes();


  // Properties:
}
