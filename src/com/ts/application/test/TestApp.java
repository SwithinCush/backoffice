/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ts.application.test;

import com.ts.application.TsApplication;
import com.ts.application.TsApplicationContext;
import com.ts.ch.gui.CertifiedHelperController;
import org.jdesktop.application.Application;
import org.jdesktop.application.ApplicationContext;

/**
 * Class TestApp
 *
 * @author daibheid
 */
public class TestApp extends TsApplication
{

    @Override
    public ApplicationContext createContext()
    {
        return new TsApplicationContext("pm");
    }

    @Override
    protected void startup()
    {
        CertifiedHelperController c = new CertifiedHelperController(getContext(TsApplicationContext.class).getDatabase());
        c.startup();
    }
    

    public static void main(String[] args)
    {
        Application.launch(TestApp.class, args);
    }

}
