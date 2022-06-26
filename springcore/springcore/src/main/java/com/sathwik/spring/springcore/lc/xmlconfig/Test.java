package com.sathwik.spring.springcore.lc.xmlconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/sathwik/spring/springcore/lc/xmlconfig/config.xml");
		Patient patient = (Patient) ctx.getBean("patient");
		ctx.registerShutdownHook();
		System.out.println(patient);
		
	}
}
