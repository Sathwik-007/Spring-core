package com.sathwik.spring.springcoreAdvanced.Injecting.interfaces;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sathwik/spring/springcoreAdvanced/Injecting/interfaces/config.xml");
		OrderBO bo = (OrderBO) context.getBean("bo");
		bo.placeOrder();
	}
}
