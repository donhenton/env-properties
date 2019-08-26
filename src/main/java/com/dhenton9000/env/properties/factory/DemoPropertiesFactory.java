 

package com.dhenton9000.env.properties.factory;

import java.util.Properties;
import org.springframework.beans.factory.config.AbstractFactoryBean;

 
public class DemoPropertiesFactory extends AbstractFactoryBean<Object> {

    
 
    
    
    @Override
    public Class<?> getObjectType() {
        return Properties.class;
    }

    @Override
    protected Object createInstance() throws Exception {
       Properties p = new Properties();
       p.setProperty("alpha", "alpha property");
       return p;
    }

}
