package com.sathwik.spring.springcoreAdvanced.stereotype.annotations;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/sathwik/spring/springcoreAdvanced/stereotype/annotations/config.xml");
		Instructor instructor = (Instructor) ctx.getBean("instructor");
		System.out.println(instructor);
		
		Instructor instructor2 = (Instructor) ctx.getBean("instructor");
		System.out.println(instructor2);
	}
	
}
