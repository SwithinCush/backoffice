package com.ts.dymo  ;

import com4j.*;

/**
 * IDymoLabels Interface
 */
@IID("{3AAD7660-8F83-11D2-8E5D-00A02415E90F}")
public interface IDymoLabels extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Set text of an address object.
   * </p>
   * @param addrIdx Mandatory int parameter.
   * @param address Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  boolean setAddress(
    int addrIdx,
    java.lang.String address);


  /**
   * <p>
   * Sets the text contents of Text, Address, or Bar code objects.
   * </p>
   * @param field Mandatory java.lang.String parameter.
   * @param text Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  boolean setField(
    java.lang.String field,
    java.lang.String text);


  /**
   * <p>
   * Set postnet position on label.
   * </p>
   * @param index Mandatory int parameter.
   * @param position Mandatory java.lang.String parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void postNet(
    int index,
    java.lang.String position);


  /**
   * <p>
   * Get text from Text, Address, or Bar code object.
   * </p>
   * @param field Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String getText(
    java.lang.String field);


  /**
   * <p>
   * Return list of all object names, or variable object names.
   * </p>
   * @param bVariableOnly Mandatory boolean parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String getObjectNames(
    boolean bVariableOnly);


  /**
   * <p>
   * Return number of Address objects on label
   * </p>
   * <p>
   * Getter method for the COM property "AddressFieldCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  int addressFieldCount();


  /**
   * @param objectName Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(13)
  boolean pasteFromClipboard(
    java.lang.String objectName);


  /**
   * @param objectName Mandatory java.lang.String parameter.
   * @param fileName Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(14)
  boolean setImageFile(
    java.lang.String objectName,
    java.lang.String fileName);


  // Properties:
}
