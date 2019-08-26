package com.dhenton9000.env.properties.factory;

import java.util.List;
import java.util.Properties;
import org.springframework.beans.factory.config.AbstractFactoryBean;

public class ListPropertiesFactory extends AbstractFactoryBean<Object> {

    private List<String> propertyKeys;

    @Override
    public Class<?> getObjectType() {
        return Properties.class;
    }

    @Override
    protected Object createInstance() throws Exception {

        Properties p = new Properties();
        //TODO use these guys to make an individual sync call to fill
        // the props object with values from a service, eg SSM
        propertyKeys.forEach(k -> {
            p.setProperty(k, k + " property");

        });
        return p;
    }

    /**
     * @return the propertyKeys
     */
    public List<String> getPropertyKeys() {
        return propertyKeys;
    }

    /**
     * @param propertyKeys the propertyKeys to set
     */
    public void setPropertyKeys(List<String> propertyKeys) {
        this.propertyKeys = propertyKeys;
    }
}
