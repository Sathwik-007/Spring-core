package com.sathwik.spring.springcore.lc.assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	
	@PostConstruct
	public void initialize() {
		System.out.println("Inside Initialize methodx");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Inside Destroy method");
	}
}
