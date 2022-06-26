package com.sathwik.spring.springcore.ambiguityType;

public class Addition {
	
	Addition(int a, double b) {
		System.out.println("Inside Double");
	}

	Addition(int a, int b) {
		System.out.println("Inside Int");
	}

}
