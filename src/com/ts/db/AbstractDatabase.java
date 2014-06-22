package com.ts.db;

import com.ts.application.TsApplication;
import com.ts.application.TsApplicationContext;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import org.jdesktop.application.Application;

public abstract class AbstractDatabase {

    public static final String JDBC_URL = "jdbc.url";
    public static final String JDBC_USER = "jdbc.user";
    public static final String JDBC_PASSWORD = "jdbc.password";
    public static final String JDBC_DRIVER = "jdbc.driver";
    public static final String DB_PROPERTIES_FILE_TEMPLATE = "%s.db.properties";

    public abstract String getJdbcUrl();

    public abstract String getJdbcUser();

    public abstract String getJdbcPassword();

    public abstract String getJdbcDriver();

    public Properties getProperties() throws IOException {
        Properties retVal = new Properties();

        retVal.setProperty(JDBC_URL, getJdbcUrl());
        retVal.setProperty(JDBC_USER, getJdbcUser());
        retVal.setProperty(JDBC_PASSWORD, getJdbcPassword());
        retVal.setProperty(JDBC_DRIVER, getJdbcDriver());

        String propFileName = buildPropertyFileName();
        File propertiesFile;

        // TODO: Add code to search Application directory for db.properties file...
        
        // load install directory
        propertiesFile = new File(Application.getInstance(TsApplication.class).getContext(TsApplicationContext.class).getInstallDirectory(), propFileName);
        if (propertiesFile.exists()) {
            retVal.load(new FileInputStream(propertiesFile));
        }
        
        // load user home directory
        propertiesFile = new File(System.getProperty("user.home"), propFileName);
        if(propertiesFile.exists()) 
            retVal.load(new FileInputStream(propertiesFile));

        // load current directory
        propertiesFile = new File(System.getProperty("user.dir"), propFileName);
        if(propertiesFile.exists())
            retVal.load(new FileInputStream(propertiesFile));

        translateKeysForJDBC(retVal);
        
        return retVal;
    }

    public Connection buildJdbcConnection() throws ClassNotFoundException, IOException, SQLException {
        Properties props = getProperties();
        translateKeysForJDBC(props);

        Class.forName(props.getProperty(JDBC_DRIVER));
        return DriverManager.getConnection(props.getProperty(JDBC_URL), props);

    }

    private String buildPropertyFileName() {
        String appId = Application.getInstance(TsApplication.class).getContext(TsApplicationContext.class).getAppId();
        return String.format(DB_PROPERTIES_FILE_TEMPLATE, appId.toLowerCase());
    }

    public void translateKeysForJDBC(Properties props) {
        if (!props.containsKey("user")) {
            props.setProperty("user", props.getProperty(JDBC_USER));
        }
        if (!props.containsKey("password")) {
            props.setProperty("password", props.getProperty(JDBC_PASSWORD));
        }
    }
}
