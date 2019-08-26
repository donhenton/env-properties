 

package com.dhenton9000.env.properties.factory;

import java.util.Properties;
import org.springframework.beans.factory.config.AbstractFactoryBean;

 
public class PropertiesFactory extends AbstractFactoryBean<Object> {

    private PropertyFinder finder;

    public PropertyFinder getPropertyFinder() {
        return finder;
    }
    
    public void setPropertyFinder(PropertyFinder finder) {
        this.finder = finder;
    }
    
    
    @Override
    public Class<?> getObjectType() {
        return Properties.class;
    }

    @Override
    protected Object createInstance() throws Exception {
       return finder.loadProperties();
    }

}
