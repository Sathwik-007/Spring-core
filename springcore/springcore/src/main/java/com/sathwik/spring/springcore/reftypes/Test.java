package com.sathwik.spring.springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	
	public static void main(String []args) {
	
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/sathwik/spring/springcore/reftypes/config.xml");
		Student student = (Student) ctx.getBean("student");
		System.out.println(student);
	}
}

