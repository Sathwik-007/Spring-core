package com.sathwik.HandsOn.springjdbc.passenger.test;

import org.springframework.context.ApplicationContext;
import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sathwik.HandsOn.springjdbc.passenger.dao.PassengerDao;
import com.sathwik.HandsOn.springjdbc.passenger.dto.Passenger;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/sathwik/HandsOn/springjdbc/passenger/test/config.xml");
		PassengerDao dao = (PassengerDao) ctx.getBean("passengerDao");
		int result = 0;
//		//creating a row
//		int result = dao.create(new Passenger(101, "Captain", "America"));
//		System.out.println("no of rows inserted : " + result);
//		result = dao.create(new Passenger(102, "Wanda", "Vision"));
//		System.out.println("no of rows inserted : " + result);
//		result = dao.create(new Passenger(103, "Black", "Panther"));
//		System.out.println("no of rows inserted : " + result);

//		// updating a record
//		result = dao.update(new Passenger(102, "Wanda", "Witch"));
//		System.out.println("no of rows updated : " + result);
		
//		// deleting a record
//		result = dao.delete(101);
//		System.out.println("no of rows deleted : " + result);
//		
		// reading a list of records
//		List<Passenger> passengers = dao.fetchAll();
//		System.out.println("all records : " + passengers);
		
	}
}