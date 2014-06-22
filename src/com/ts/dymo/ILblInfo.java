package com.ts.dymo  ;

import com4j.*;

/**
 * ILblInfo Interface
 */
@IID("{9603C362-8ECB-11D2-A3BA-0000E8D57653}")
public interface ILblInfo extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "LabelName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String labelName();


  /**
   * <p>
   * Getter method for the COM property "PaperName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String paperName();


  /**
   * <p>
   * Getter method for the COM property "PaperWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  int paperWidth();


  /**
   * <p>
   * Getter method for the COM property "PaperHeight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  int paperHeight();


  /**
   * <p>
   * Getter method for the COM property "BitmapWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  int bitmapWidth();


  /**
   * <p>
   * Getter method for the COM property "BitmapHeight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  int bitmapHeight();


  /**
   * <p>
   * Getter method for the COM property "LabelCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(13)
  int labelCount();


  /**
   * <p>
   * Getter method for the COM property "LabelWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(14)
  int labelWidth();


  /**
   * <p>
   * Getter method for the COM property "LabelHeight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(15)
  int labelHeight();


  /**
   * <p>
   * Getter method for the COM property "Modified"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(16)
  boolean modified();


  // Properties:
}
