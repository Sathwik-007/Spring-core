package com.sathwik.HandsOn.HandsOnProblems.dbconfig;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("com/sathwik/HandsOn/HandsOnProblems/dbconfig/config.xml");
		EmployeeDAO empdao = (EmployeeDAO) ctx.getBean("employeedao");
		System.out.println(empdao);
	}
}
