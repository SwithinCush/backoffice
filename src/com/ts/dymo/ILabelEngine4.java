package com.ts.dymo  ;

import com4j.*;

/**
 * ILabelEngine4 Interface
 */
@IID("{B788B612-6C21-4340-9708-284603929008}")
public interface ILabelEngine4 extends com.ts.dymo.ILabelEngine3 {
  // Methods:
  /**
   */

  @DISPID(417) //= 0x1a1. The runtime will prefer the VTID if present
  @VTID(23)
  void startPrintJob();


  /**
   */

  @DISPID(418) //= 0x1a2. The runtime will prefer the VTID if present
  @VTID(24)
  void endPrintJob();


  // Properties:
}
