package com.sathwik.HandsOn.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/sathwik/HandsOn/springjdbc/config.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate)ctx.getBean("jdbcTemplate");
		String sql = "delete from employee where id=?";
		
		int result = jdbcTemplate.update(sql, 123);
		System.out.println("No of records deleted are : " + result);
	}
}