package com.tech.arvind;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	public Student() {
		System.out.println("Inside Student Constructor");
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("inside Student setName()");
	}

	@PostConstruct
	public void init() {
		System.out.println("init Student method");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy Student method");
	}

}
