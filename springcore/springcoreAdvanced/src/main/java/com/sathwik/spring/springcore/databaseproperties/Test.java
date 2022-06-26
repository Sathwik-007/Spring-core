package com.sathwik.spring.springcore.databaseproperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/sathwik/spring/springcore/databaseproperties/config.xml");
		MyDAO mydao = (MyDAO) ctx.getBean("mydao");
		System.out.println(mydao);
	}
	
}
