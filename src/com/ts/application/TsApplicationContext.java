/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ts.application;

import com.ts.pm.PmDatabase;
import java.io.File;
import org.jdesktop.application.ApplicationContext;

/**
 * Class TsApplicationContext
 *
 * @author daibheid
 */
public class TsApplicationContext extends ApplicationContext {

    private String appId;
    private File installDirectory;
    private PmDatabase pmDatabase;
    
    public TsApplicationContext(String appId) {
        this.appId = appId;
        pmDatabase = new PmDatabase();
    }
    
    void setInstallDirectory(File installDirectory) {
        this.installDirectory = installDirectory;
    }
    
    public File getInstallDirectory() {
        return installDirectory;
    }
    
    public String getAppId() {
        return appId;
    }
    
    public PmDatabase getDatabase() {
        return pmDatabase;
    }
} 

