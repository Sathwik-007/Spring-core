package com.sathwik.spring.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String []args) {
	
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/sathwik/spring/springcore/map/config.xml");
		Customer customer = (Customer) ctx.getBean("customer");
		System.out.println(customer);
	}
}
