package com.ts.dymo  ;

import com4j.*;

/**
 * IDymoLabels2 Interface
 */
@IID("{C07C156E-123D-415A-9DB6-20E7827044F5}")
public interface IDymoLabels2 extends com.ts.dymo.IDymoLabels {
  // Methods:
  /**
   * @param objectName Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(301) //= 0x12d. The runtime will prefer the VTID if present
  @VTID(15)
  boolean pasteImageFromClipboard(
    java.lang.String objectName);


  // Properties:
}
