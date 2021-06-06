package com.example.spring.properties.xml;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLBeanTest {
    protected static ClassPathXmlApplicationContext context;

    @BeforeClass
    public static void before() {
        context = new ClassPathXmlApplicationContext("spring-beans.xml");
    }

    @Test
    public void testInjectionOfPropertiesFromXML() {
        PropertiesInjectedFromXML bean = context.getBean(PropertiesInjectedFromXML.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("customConstructorProvidedValue", bean.getConstructorProperty());
        Assert.assertEquals(2, bean.getSimpleProperty());
    }

    @AfterClass
    public static void after() {
        context.close();
    }
}
