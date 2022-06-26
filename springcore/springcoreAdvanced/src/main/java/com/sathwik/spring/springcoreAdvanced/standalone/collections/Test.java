package com.sathwik.spring.springcoreAdvanced.standalone.collections;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/sathwik/spring/springcoreAdvanced/standalone/collections/config.xml");
		ProductList products = (ProductList) ctx.getBean("productlist");
		System.out.println(products);
		Map<String, String> map = products.getProducts();
		System.out.println(7*Integer.parseInt(map.get("Dollar")));
	}
	
}
