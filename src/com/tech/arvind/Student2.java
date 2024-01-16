package com.tech.arvind;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student2 {
	public Student2() {
		
		System.out.println("inside Student2 constructor");
	}
	
	private String name;
	
	public void setName(String name) {
		System.out.println("inside Student2 setName()");
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@PostConstruct
	public void init1111()
	{
		System.out.println("init Student2 method");
	}
	@PreDestroy
	public void destroy11111()
	{
		System.out.println("destroy Student2 method");
	}
	

}
