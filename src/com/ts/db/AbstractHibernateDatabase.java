
package com.ts.db;

import java.io.IOException;
import java.util.Properties;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public abstract class AbstractHibernateDatabase extends AbstractDatabase {

    public static final String HIBERNATE_DIALECT = "hibernate.dialect";
    public static final String HIBERNATE_URL = "hibernate.connection.url";
    public static final String HIBERNATE_USER = "hibernate.connection.user";
    public static final String HIBERNATE_PASSWORD = "hibernate.connection.password";
    public static final String HIBERNATE_DRIVER_CLASS = "hibernate.connection.driver_class";
    
    private SessionFactory sessionFactory;
    private Configuration configuration;
    private String configFileResource;
    
    public AbstractHibernateDatabase(String configFileResource) {
        this.configFileResource = configFileResource;
    }
    
    public abstract String getHibernateDialect();
    
    public SessionFactory buildSesionFactory() throws IOException, HibernateException {
        if(sessionFactory == null) {
            configuration = new Configuration();
            configuration.configure(this.configFileResource);
            configuration.addProperties(getProperties());
            StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
            sessionFactory = configuration.buildSessionFactory(ssrb.build());
        }
        return sessionFactory;
    }

    @Override
    public Properties getProperties() throws IOException {
        Properties retVal = super.getProperties();
        
        if(!retVal.containsKey(HIBERNATE_DIALECT))
            retVal.setProperty(HIBERNATE_DIALECT, getHibernateDialect());
        
        return retVal;
    }
    
    
    @Override
    public void translateKeysForJDBC(Properties props) {
        super.translateKeysForJDBC(props); 
        
        if(!props.containsKey(HIBERNATE_URL))
            props.setProperty(HIBERNATE_URL, props.getProperty(JDBC_URL));
        if(!props.containsKey(HIBERNATE_USER))
            props.setProperty(HIBERNATE_USER, props.getProperty(JDBC_USER));
        if(!props.containsKey(HIBERNATE_PASSWORD))
            props.setProperty(HIBERNATE_PASSWORD, props.getProperty(JDBC_PASSWORD));
        if(!props.containsKey(HIBERNATE_DRIVER_CLASS))
            props.setProperty(HIBERNATE_DRIVER_CLASS, props.getProperty(JDBC_DRIVER));
    }
    
    
}
