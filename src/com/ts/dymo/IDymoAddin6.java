package com.ts.dymo  ;

import com4j.*;

/**
 * IDymoAddin6 Interface
 */
@IID("{0C7AADEF-16FC-400D-A827-3F7A93A94DF7}")
public interface IDymoAddin6 extends com.ts.dymo.IDymoAddIn5 {
  // Methods:
  /**
   * @param protocol Mandatory java.lang.String parameter.
   * @param serverName Mandatory java.lang.String parameter.
   * @param port Mandatory int parameter.
   * @param proxyBypass Mandatory java.lang.String parameter.
   * @param userName Mandatory java.lang.String parameter.
   * @param password Mandatory java.lang.String parameter.
   */

  @DISPID(701) //= 0x2bd. The runtime will prefer the VTID if present
  @VTID(36)
  void setupProxySettings(
    java.lang.String protocol,
    java.lang.String serverName,
    int port,
    java.lang.String proxyBypass,
    java.lang.String userName,
    java.lang.String password);


  /**
   */

  @DISPID(702) //= 0x2be. The runtime will prefer the VTID if present
  @VTID(37)
  void clearProxySettings();


  /**
   * <p>
   * Getter method for the COM property "proxyBypass"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(703) //= 0x2bf. The runtime will prefer the VTID if present
  @VTID(38)
  boolean proxyBypass();


  /**
   * <p>
   * Setter method for the COM property "proxyBypass"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(703) //= 0x2bf. The runtime will prefer the VTID if present
  @VTID(39)
  void proxyBypass(
    boolean value);


  /**
   * @param printerName Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(704) //= 0x2c0. The runtime will prefer the VTID if present
  @VTID(40)
  boolean isPrinterOnline(
    java.lang.String printerName);


  /**
   * @param isModeOn Mandatory boolean parameter.
   */

  @DISPID(705) //= 0x2c1. The runtime will prefer the VTID if present
  @VTID(41)
  void setGraphicsAndBarcodePrintMode(
    boolean isModeOn);


  // Properties:
}
