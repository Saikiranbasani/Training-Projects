package com.npci.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestGreetings {
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		
		Greetings greetings = (Greetings)context.getBean("b1");
		String result = greetings.greet("Sai", "Spanish");
		System.out.println(result);
		ClassPathXmlApplicationContext cpxtx=(ClassPathXmlApplicationContext)context;
		cpxtx.close();
	}

}