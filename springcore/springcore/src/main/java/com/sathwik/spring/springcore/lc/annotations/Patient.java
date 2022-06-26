package com.sathwik.spring.springcore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@PostConstruct
	public void start() {
		System.out.println("PostConstruct annotation");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("PreDestroy annotation");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
