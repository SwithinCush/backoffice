/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ts.application;

import java.io.File;
import java.lang.reflect.Field;
import org.jdesktop.application.Application;
import org.jdesktop.application.ApplicationContext;

/**
 * Class TsApplication
 *
 * @author daibheid
 */
public abstract class TsApplication extends Application {

    protected TsApplication() {
        super();
        try {
            Field f = Application.class.getDeclaredField("context");
            f.setAccessible(true);
            f.set(this, createContext());
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            File f = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI());
            getContext(TsApplicationContext.class).setInstallDirectory(f);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public abstract ApplicationContext createContext();
    
    public TsApplicationContext getTsContext() {
        return getContext(TsApplicationContext.class);
    }
    
    public <T extends TsApplicationContext> T getContext(Class<T> clazz) {
        return clazz.cast(getContext());
    }
    
} 

