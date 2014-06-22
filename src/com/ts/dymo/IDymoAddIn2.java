package com.ts.dymo  ;

import com4j.*;

/**
 * IDymoAddIn2 Interface
 */
@IID("{BCABF570-E1B4-4D4A-B8B8-C46E632CF0B3}")
public interface IDymoAddIn2 extends com.ts.dymo.IDymoAddIn {
  // Methods:
  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(301) //= 0x12d. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String getMRULabelFiles();


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(302) //= 0x12e. The runtime will prefer the VTID if present
  @VTID(19)
  boolean open2(
    java.lang.String fileName);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(303) //= 0x12f. The runtime will prefer the VTID if present
  @VTID(20)
  int getMRULabelFileCount();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(304) //= 0x130. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String getMRULabelFileName(
    int index);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(305) //= 0x131. The runtime will prefer the VTID if present
  @VTID(22)
  boolean openMRULabelFile(
    int index);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(306) //= 0x132. The runtime will prefer the VTID if present
  @VTID(23)
  boolean openMRULabelFileByName(
    java.lang.String fileName);


  // Properties:
}
