package com.npci.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingsTestCase {
	private static ApplicationContext context;
	private Greetings greetings;
	
	//load the application context before any test case begins
	@BeforeAll
	public static void load() {
		context=new ClassPathXmlApplicationContext("beans.xml");
	}
	@AfterAll
	public static void unload() {
		ClassPathXmlApplicationContext context2=(ClassPathXmlApplicationContext) context;
		context2.close();
	}
	@BeforeEach //runs befores each test case
	public void initializeGreetings() {
		greetings =(Greetings)context.getBean("b1");
	}
	@AfterEach //runs after each test case
	public void deinItializeGreetings() {
		greetings =null;
	}
	
	@Test //test cases
	public void testGreetings() {
		Greetings greetings=(Greetings)context.getBean("b1");
		String actual =greetings.greet("Alex", "Tamil");
		assertEquals("Vanakkam,Alex", actual);
		actual =greetings.greet("Alex", "Hindi");
		assertEquals("Namaskar,Alex", actual);
		
	
	}
	

}
