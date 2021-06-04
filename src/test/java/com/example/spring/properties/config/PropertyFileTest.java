package com.example.spring.properties.config;

import org.junit.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyFileTest {
	private static ClassPathXmlApplicationContext context;

	@BeforeClass
	public static void before() {
		context = new ClassPathXmlApplicationContext("spring-beans.xml");
	}


	@Test
	public void testInjectionOfPropertiesFromPropertyFiles() {
		JavaPropertyFile bean = context.getBean(JavaPropertyFile.class);
		Assert.assertNotNull(bean);
		Assert.assertEquals("prima valoare",bean.getFirstValue());
		Assert.assertEquals("a doua valoare",bean.getSecondValue());
	}


	@AfterClass
	public static void after() {
		context.close();
	}

}
