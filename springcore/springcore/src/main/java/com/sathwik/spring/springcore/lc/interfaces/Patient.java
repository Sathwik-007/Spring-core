package com.sathwik.spring.springcore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {
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

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() method from InitializingBean Interface");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy overriden method from DisposableBean Interface");
	}
}
