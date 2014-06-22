package com.ts.dymo  ;

import com4j.*;

/**
 * ILabelEngine3 Interface
 */
@IID("{06C47CBC-616C-4CDE-BE2A-5D39C47DA704}")
public interface ILabelEngine3 extends com.ts.dymo.ILabelEngine2 {
  // Methods:
  /**
   * @param buffer Mandatory java.lang.Object parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(21)
  boolean openStream(
    @MarshalAs(NativeType.VARIANT) java.lang.Object buffer);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(22)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object saveStream();


  // Properties:
}
