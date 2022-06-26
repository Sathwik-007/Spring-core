package com.sathwik.HandsOn.HandsOnProblems.eezeeTransport;

import java.text.ParseException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) throws ParseException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/sathwik/HandsOn/HandsOnProblems/eezeeTransport/bean.xml");
		TransportService ts = (TransportService) ctx.getBean("transportService");
		Booking booking = (Booking) ctx.getBean("booking");
		
		ts.registerBooking(booking);
	}
}
