package com.sathwik.spring.springcoreAdvanced.Injecting.interfaces;

import org.springframework.stereotype.Component;

@Component
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside orderDAO createOrder() method");
	}

}
