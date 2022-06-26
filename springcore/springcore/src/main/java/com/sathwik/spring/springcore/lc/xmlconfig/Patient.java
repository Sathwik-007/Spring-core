package com.sathwik.spring.springcore.lc.xmlconfig;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void start() {
		System.out.println("Inside constructor");
	}
	
	public void end() {
		System.out.println("Inside destructor");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
}
