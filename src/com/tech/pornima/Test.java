package com.tech.pornima;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/tech/pornima/Beans.xml");
		Student std = ctx.getBean("s1", Student.class);
		System.out.println(std.toString());
		
		System.out.println("after load");
		System.out.println("-----beans s1 loaded-----");
		Student std1 = ctx.getBean("s1", Student.class);
		Student std2 = ctx.getBean("s1", Student.class);
		
		System.out.println("-----beans s2 loaded-----");
		Student s3 = ctx.getBean("s2", Student.class);
		Student s4 = ctx.getBean("s2", Student.class);
	
	}

}
