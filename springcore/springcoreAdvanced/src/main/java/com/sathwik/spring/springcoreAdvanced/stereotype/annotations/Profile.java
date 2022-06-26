package com.sathwik.spring.springcoreAdvanced.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Profile {

	@Value("Student")
	private String title;
	@Value("Raghu Institute of Technology")
	private String college;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Profile [title=" + title + ", college=" + college + "]";
	}

}
