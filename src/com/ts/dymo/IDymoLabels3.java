package com.ts.dymo  ;

import com4j.*;

/**
 * IDymoLabels3 Interface
 */
@IID("{5852B223-B74A-49E5-AC25-A6E1B1353E41}")
public interface IDymoLabels3 extends com.ts.dymo.IDymoLabels2 {
  // Methods:
  /**
   * @param objectName Mandatory java.lang.String parameter.
   * @param imageURL Mandatory java.lang.String parameter.
   * @param imageTypeStr Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(16)
  boolean setImageURL(
    java.lang.String objectName,
    java.lang.String imageURL,
    java.lang.String imageTypeStr);


  // Properties:
}
