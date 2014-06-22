package com.ts.dymo  ;

import com4j.*;

/**
 * IPrintObject Interface
 */
@IID("{B0ADDB03-943F-11D2-A3BA-0000E8D57653}")
public interface IPrintObject extends Com4jObject {
  // Methods:
  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @return  Returns a value of type com.ts.dymo.IObjectsAtEnum
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
    com.ts.dymo.IObjectsAtEnum objectsAt(
    int x,
    int y);


  /**
   * @return  Returns a value of type com.ts.dymo.IObjectList
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
    com.ts.dymo.IObjectList objects();


  @VTID(8)
  @ReturnValue(defaultPropertyThrough={com.ts.dymo.IObjectList.class})
  int objects(
    int index);

  /**
   * @param obj Mandatory int parameter.
   * @return  Returns a value of type com.ts.dymo.ILabelObject
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
    com.ts.dymo.ILabelObject labelObject(
    int obj);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  int objectAt(
    int x,
    int y);


  /**
   * @return  Returns a value of type com.ts.dymo.IVarObjectList
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
    com.ts.dymo.IVarObjectList varObjects();


  @VTID(11)
  @ReturnValue(defaultPropertyThrough={com.ts.dymo.IVarObjectList.class})
  int varObjects(
    int index);

  /**
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  int findObj(
    java.lang.String name);


  /**
   * @param obj Mandatory int parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(13)
  void bringToFront(
    int obj);


  /**
   * @param obj Mandatory int parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(14)
  void sendToBack(
    int obj);


  /**
   * @param obj Mandatory int parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(15)
  void delete(
    int obj);


  /**
   * @param objType Mandatory int parameter.
   * @param name Mandatory java.lang.String parameter.
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @param width Mandatory int parameter.
   * @param height Mandatory int parameter.
   * @param rotation Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(16)
  int addObject(
    int objType,
    java.lang.String name,
    int x,
    int y,
    int width,
    int height,
    int rotation);


  /**
   * @param buf Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(17)
  boolean copyToClipboard(
    Holder<Integer> buf);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(18)
  boolean pasteFromClipboard();


  // Properties:
}
