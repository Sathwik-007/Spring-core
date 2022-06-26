package com.sathwik.spring.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String []args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/sathwik/spring/springcore/list/listconfig.xml");
		Hospital hospital = (Hospital) context.getBean("hospital");
		System.out.println("Hospital name : " + hospital.getName());
		System.out.println("Departments : " + hospital.getDepartments());
	}

}
