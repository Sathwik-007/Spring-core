package com.sathwik.spring.springcore.databaseproperties.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/sathwik/spring/springcore/databaseproperties/assignment/config.xml");
		WSclient wsclient = (WSclient) ctx.getBean("wsclient");
		System.out.println(wsclient);
		
	}
}
