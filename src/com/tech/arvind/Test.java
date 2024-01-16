package com.tech.arvind;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("com/tech/arvind/NewFile.xml");
		Student2 std = ctx.getBean("s2", Student2.class);
		System.out.println(std.getName());
		ctx.close();
		System.out.println("-----------------------------------");

	}

}
