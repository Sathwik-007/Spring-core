package com.sathwik.spring.springcoreAdvanced.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	// Field/ property autowiring
	@Autowired(required=false)
	@Qualifier("address")
	private Address address;
	
	// constructor autowiring
	// @Autowired
	Employee(Address address){
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}
	
	// Setter method autowiring
	// @Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
