package com.suidian.www.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DITest {
	@Test
	public void demo1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Object user = context.getBean("user");
		
		Object user2 = context.getBean("user");
		System.out.println(user==user2);
	}
	
	@Test
	public void demo2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Object coll = context.getBean("coll");
		System.out.println(coll);
	}
}
