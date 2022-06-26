package com.sathwik.HandsOn.HandsOnProblems.customerAddressScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/sathwik/HandsOn/HandsOnProblems/customerAddressScope/beans.xml");
		Customer custObj1 = (Customer) ctx.getBean("custObj");
		
		custObj1.getAddress().setCity("GreenVille");
		System.out.println("Customer city of customer 1 : " + custObj1.getAddress().getCity());
		System.out.println(custObj1.hashCode());
		
		Customer custObj2 = (Customer) ctx.getBean("custObj");
		
		custObj2.getAddress().setCity("Kancharapalem");
		System.out.println("Customer city of customer 2 : " + custObj2.getAddress().getCity());
		System.out.println(custObj2.hashCode());
		
		Customer custObj3 = (Customer) ctx.getBean("custObj");
		
		custObj3.getAddress().setCity("NAD");
		System.out.println("Customer city of customer 3 : " + custObj3.getAddress().getCity());
		System.out.println(custObj3.hashCode());
	}

}
