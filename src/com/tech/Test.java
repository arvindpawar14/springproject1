package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/tech/Bean.xml");
		Student s1=ctx.getBean("s1",Student.class);
		System.out.println(s1.getName());
		System.out.println(s1.getAddress());
		System.out.println(s1.getAddress().getCityname());
	}

}
