package com.sathwik.spring.springcore.dependencycheck.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/sathwik/spring/springcore/dependencycheck/assignment/config.xml");
		University university = (University) ctx.getBean("university");
		System.out.println(university.hashCode());
		
		University university2 = (University) ctx.getBean("university");
		System.out.println(university2.hashCode());
	}

}
