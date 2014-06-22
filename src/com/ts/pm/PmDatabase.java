/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ts.pm;

import com.ts.common.WinRegistry;
import com.ts.db.AbstractHibernateDatabase;
import java.net.InetAddress;
import java.net.UnknownHostException;
import jcifs.netbios.NbtAddress;
import org.apache.commons.lang3.SystemUtils;

/**
 * Class PmDatabase
 *
 * @author daibheid
 */
public class PmDatabase extends AbstractHibernateDatabase
{

    public static final String FB_URL_TEMPLATE = "jdbc:firebirdsql://%s/%s";

    public static final String FB_DB_KEY32 = "SOFTWARE\\PC Synergy\\PostalMate\\FB";

    public static final String FB_DB_KEY64 = "SOFTWARE\\Wow6432Node\\PC Synergy\\PostalMate\\FB";

    public static final String FB_SERVER_KEY = "Server";

    public static final String FB_PATH_KEY = "Path";

    public PmDatabase()
    {
        super("com/ts/pm/pm.db.cfg.xml");
    }

    @Override
    public String getHibernateDialect()
    {
        return "org.hibernate.dialect.FirebirdDialect";
    }

    @Override
    public String getJdbcUrl()
    {
        return String.format(FB_URL_TEMPLATE, resolveServerNameToIp(getServer()), getPath());
    }

    @Override
    public String getJdbcUser()
    {
        return "PCSLIMITED";
    }

    @Override
    public String getJdbcPassword()
    {
        return "t6qtwvuq";
    }

    @Override
    public String getJdbcDriver()
    {
        return "org.firebirdsql.jdbc.FBDriver";
    }

    public String getServer()
    {
        if (SystemUtils.IS_OS_WINDOWS) {
            try {
                String retVal = WinRegistry.readString(WinRegistry.HKEY_LOCAL_MACHINE, FB_DB_KEY32, FB_SERVER_KEY);
                if (retVal == null) {
                    retVal = WinRegistry.readString(WinRegistry.HKEY_LOCAL_MACHINE, FB_DB_KEY64, FB_SERVER_KEY);
                }
                return retVal;
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return "";
    }

    public String getPath()
    {
        if (SystemUtils.IS_OS_WINDOWS) {
            try {
                String retVal = WinRegistry.readString(WinRegistry.HKEY_LOCAL_MACHINE, FB_DB_KEY32, FB_PATH_KEY);
                if (retVal == null) {
                    retVal = WinRegistry.readString(WinRegistry.HKEY_LOCAL_MACHINE, FB_DB_KEY64, FB_PATH_KEY);
                }
                return retVal;
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return "";
    }

    private String resolveServerNameToIp(String server)
    {
        if (SystemUtils.IS_OS_WINDOWS) {
            try {
                String hostAddress = InetAddress.getLocalHost().getHostAddress();
                NbtAddress[] addresses = NbtAddress.getAllByAddress(hostAddress);
                for (NbtAddress nbtAddr : addresses) {
                    if (nbtAddr.firstCalledName().equals(server)) {
                        return "localhost";
                    }
                }
                return NbtAddress.getByName(server).getInetAddress().getHostAddress();
            }
            catch (UnknownHostException e) {
                throw new RuntimeException(e);
            }
        }
        return "";
    }

}
