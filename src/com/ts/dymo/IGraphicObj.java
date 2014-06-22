package com.ts.dymo  ;

import com4j.*;

/**
 * IGraphicObj Interface
 */
@IID("{247905C4-AA37-11D2-A5D4-0040054349AF}")
public interface IGraphicObj extends com.ts.dymo.ILabelObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "GraphicSource"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(20)
  int graphicSource();


  /**
   * <p>
   * Setter method for the COM property "GraphicSource"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  void graphicSource(
    int value);


  /**
   * <p>
   * Getter method for the COM property "FileName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String fileName();


  /**
   * <p>
   * Setter method for the COM property "FileName"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(23)
  void fileName(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "BitmapHandle"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(24)
  int bitmapHandle();


  /**
   * <p>
   * Setter method for the COM property "BitmapHandle"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(25)
  void bitmapHandle(
    int value);


  /**
   * <p>
   * Getter method for the COM property "PaletteHandle"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(26)
  int paletteHandle();


  /**
   * <p>
   * Setter method for the COM property "PaletteHandle"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(27)
  void paletteHandle(
    int value);


  /**
   * <p>
   * Setter method for the COM property "WindowHandle"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(28)
  void windowHandle(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(29)
  int border();


  /**
   * <p>
   * Setter method for the COM property "Border"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(30)
  void border(
    int value);


  /**
   * <p>
   * Getter method for the COM property "BorderColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(31)
  int borderColor();


  /**
   * <p>
   * Setter method for the COM property "BorderColor"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(32)
  void borderColor(
    int value);


  /**
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(33)
  void grabClipboard();


  // Properties:
}
