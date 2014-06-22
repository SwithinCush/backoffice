package com.ts.dymo  ;

import com4j.*;

/**
 * IDymoAddin5 Interface
 */
@IID("{A1CD66DC-6A1F-4FD6-A7EF-57D00E28E00A}")
public interface IDymoAddIn5 extends com.ts.dymo.IDymoAddIn4 {
  // Methods:
  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(601) //= 0x259. The runtime will prefer the VTID if present
  @VTID(30)
  boolean smartPasteFromClipboard();


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(602) //= 0x25a. The runtime will prefer the VTID if present
  @VTID(31)
  boolean smartPasteFromFile(
    java.lang.String fileName);


  /**
   * @param strBuf Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(603) //= 0x25b. The runtime will prefer the VTID if present
  @VTID(32)
  boolean smartPasteFromString(
    java.lang.String strBuf);


  /**
   * @param urlFileName Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(604) //= 0x25c. The runtime will prefer the VTID if present
  @VTID(33)
  boolean openURL(
    java.lang.String urlFileName);


  /**
   * @param buffer Mandatory java.lang.Object parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(605) //= 0x25d. The runtime will prefer the VTID if present
  @VTID(34)
  boolean openStream(
    @MarshalAs(NativeType.VARIANT) java.lang.Object buffer);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(606) //= 0x25e. The runtime will prefer the VTID if present
  @VTID(35)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object saveStream();


  // Properties:
}
