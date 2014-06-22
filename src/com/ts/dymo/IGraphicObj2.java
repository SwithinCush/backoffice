package com.ts.dymo  ;

import com4j.*;

/**
 * IGraphicObj2 Interface
 */
@IID("{CCB7D4BB-0638-4314-96C5-5135C5B369B9}")
public interface IGraphicObj2 extends com.ts.dymo.IGraphicObj {
  // Methods:
  /**
   * @param graphicSource Mandatory int parameter.
   * @param fileName Mandatory java.lang.String parameter.
   * @param bitmapHandle Mandatory int parameter.
   * @param paletteHandle Mandatory int parameter.
   * @param windowHandle Mandatory int parameter.
   * @param imageURL Mandatory java.lang.String parameter.
   * @param imageTypeStr Mandatory java.lang.String parameter.
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(34)
  void setGraphicSource(
    int graphicSource,
    java.lang.String fileName,
    int bitmapHandle,
    int paletteHandle,
    int windowHandle,
    java.lang.String imageURL,
    java.lang.String imageTypeStr);


  // Properties:
}
