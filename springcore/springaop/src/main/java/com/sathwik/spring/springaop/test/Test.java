package com.sathwik.spring.springaop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sathwik.spring.springaop.ProductService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/sathwik/spring/springaop/test/config.xml");
		ProductService productService = (ProductService) ctx.getBean("productService");
		System.out.println(productService.multiply(2, 5));
	}

}
