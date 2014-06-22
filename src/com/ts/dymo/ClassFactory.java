package com.ts.dymo  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * DymoAddIn Class
   */
  public static com.ts.dymo.IDymoAddin6 createDymoAddIn() {
    return COM4J.createInstance( com.ts.dymo.IDymoAddin6.class, "{09DAFAE2-8EB0-11D2-8E5D-00A02415E90F}" );
  }

  /**
   * DymoLabels Class
   */
  public static com.ts.dymo.IDymoLabels3 createDymoLabels() {
    return COM4J.createInstance( com.ts.dymo.IDymoLabels3.class, "{3AAD7661-8F83-11D2-8E5D-00A02415E90F}" );
  }

  /**
   * LabelEngine Class
   */
  public static com.ts.dymo.ILabelEngine4 createLabelEngine() {
    return COM4J.createInstance( com.ts.dymo.ILabelEngine4.class, "{1CE3FE82-8EBE-11D2-A3BA-0000E8D57653}" );
  }
}
