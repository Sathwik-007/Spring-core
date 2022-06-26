package com.sathwik.spring.springcore.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String []args) {
	
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/sathwik/spring/springcore/assignment/config.xml");
		ShoppingCart shoppingcart = (ShoppingCart) ctx.getBean("shoppingcart");
		System.out.println(shoppingcart);
	}
}

