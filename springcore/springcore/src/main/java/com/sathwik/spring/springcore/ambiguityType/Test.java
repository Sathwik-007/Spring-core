package com.sathwik.spring.springcore.ambiguityType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String []args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sathwik/spring/springcore/ambiguityType/config.xml");
		Addition emp = (Addition) context.getBean("addition");
		System.out.println(emp);
	}
}
