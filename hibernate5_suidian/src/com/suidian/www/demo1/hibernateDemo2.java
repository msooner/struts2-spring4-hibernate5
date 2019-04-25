package com.suidian.www.demo1;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.suidian.www.utils.hibernateUtils;

public class hibernateDemo2 {
	@Test
	public void demo2(){
		Session session = hibernateUtils.openSession();
		Transaction tr = session.beginTransaction();
		
		User user = new User();
		
		user.setAge(12);
		user.setName("Tom");
		user.setPassword("123");
		
		session.save(user);
		
		tr.commit();
		session.close();
	}
}
