package com.sathwik.spring.springcore.lc.assignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/sathwik/spring/springcore/lc/assignment/config.xml");
		TicketReservation tc = (TicketReservation) ctx.getBean("ticketreservation");		
		System.out.println(tc);
		ctx.registerShutdownHook();
		
	}
}
