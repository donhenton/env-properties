 

package com.dhenton9000.env.properties.factory.impl;

import com.dhenton9000.env.properties.factory.PropertyFinder;
import java.util.Properties;

 
public class DemoPropertyFinder implements PropertyFinder{

    @Override
    public Properties loadProperties() {
       Properties t =  new Properties();
       t.setProperty("alpha","alpha property");
       return t;
    }

}
