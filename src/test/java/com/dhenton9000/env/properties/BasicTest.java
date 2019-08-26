package com.dhenton9000.env.properties;

import com.dhenton9000.env.properties.sample.PropertiesSample;
import com.dhenton9000.env.properties.sample.ReportService;
import com.dhenton9000.env.properties.sample.SpringSample;
import java.util.Properties;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@RunWith(MockitoJUnitRunner.class)
public class BasicTest {

    private SpringSample sample = new SpringSample();
    @Mock
    ReportService reportService;

    private static final Logger LOG = LoggerFactory.getLogger(BasicTest.class);
    private static final String MESSAGE = "get a job";
 
  

    @Test
    public void testMe() {
        LOG.debug("get a job");
        assertTrue(true);
    }

    @Test
    public void TestInject() {

        Mockito.when(reportService.report()).thenReturn(MESSAGE);
        sample.setReportService(reportService);
        assertNotNull(sample);
        assertEquals(MESSAGE, sample.report());
        Mockito.verify(reportService, Mockito.atMost(1)).report();
    }

    @Test
    public void testApplicationContext() {
        ApplicationContext context  =        
           new ClassPathXmlApplicationContext("applicationContext.xml");
        PropertiesSample p = context.getBean("test-prop-reader",PropertiesSample.class);
        String test = p.getMessage();
        assertEquals(test,"alpha property");
        
    }
   
}
