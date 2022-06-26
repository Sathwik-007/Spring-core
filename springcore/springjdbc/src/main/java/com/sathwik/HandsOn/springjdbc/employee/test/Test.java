package com.sathwik.HandsOn.springjdbc.employee.test;

import org.springframework.context.ApplicationContext;
import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sathwik.HandsOn.springjdbc.employee.dao.EmployeeDao;
import com.sathwik.HandsOn.springjdbc.employee.dto.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/sathwik/HandsOn/springjdbc/employee/test/config.xml");
		EmployeeDao dao = (EmployeeDao)ctx.getBean("employeeDao");
		Employee employee = new Employee(456, "Alex", "Mercer");
		Employee employee2 = new Employee(123, "John", "Ferguson");
		
//		// create query
//		int result = dao.create(employee);
//		System.out.println("No of records inserted are : " + result);
//		result = dao.create(employee2);
//		System.out.println("No of records inserted are : " + result);
		
		// update query
//		int result = dao.update(employee2);
//		System.out.println("no of records updated are : " + result);
//		
//		// display query
//		dao.display("employee");
		
		//delete query
//		
//		int result = dao.delete(123);
//		System.out.println("no of rows deleted are : " + result);
		
		// display results
//		Employee employee3 = dao.read(456);
//		System.out.println("results fetched successfully : " + employee3);
		
		List<Employee> res = dao.fetch();
		System.out.println("all records : " + res);
	}
}