package com.suidian.www.manytomany;

import java.util.Arrays;
import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.suidian.www.utils.hibernateUtils;

public class ManyToMantTest {
	@Test
	public void demo() {
		Session session = hibernateUtils.getCurrentSession();
		Transaction tr = session.beginTransaction();
		
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		
		user1.setUser_name("u1");
		user2.setUser_name("u2");
		user3.setUser_name("u3");
		
		Role role1 = new Role();
		Role role2 = new Role();
		
		role1.setRole_name("r1");
		role2.setRole_name("r2");
		
		user1.getRoles().add(role1);
		user2.getRoles().add(role1);
		user2.getRoles().add(role2);
		
		role1.getUsers().add(user1);
		role1.getUsers().add(user2);
		role2.getUsers().add(user2);
		
		session.save(role1);
		session.save(role2);
		session.save(user3);
		session.save(user2);
		session.save(user1);
		
		tr.commit();
	}
	
	// 级联保存
	@Test
	public void demo2() {
		Session session = hibernateUtils.getCurrentSession();
		Transaction tr = session.beginTransaction();
		
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		
		user1.setUser_name("u1");
		user2.setUser_name("u2");
		user3.setUser_name("u3");
		
		Role role1 = new Role();
		Role role2 = new Role();
		
		role1.setRole_name("r1");
		role2.setRole_name("r2");
		
		user1.getRoles().add(role1);
		user2.getRoles().add(role1);
		user2.getRoles().add(role2);
		
		role1.getUsers().add(user1);
		role1.getUsers().add(user2);
		role2.getUsers().add(user2);
		
		session.save(user1);
		session.save(user2);
		session.save(user3);
		
		tr.commit();
	}
	
	// 添加和删除
	@Test
	public void demo3() {
		Session session = hibernateUtils.getCurrentSession();
		Transaction tr = session.beginTransaction();
		
		Role role = session.get(Role.class, 2l);
		User user = session.get(User.class, 3l);
		User user2 = session.get(User.class, 2l);
		user.getRoles().add(role);
		user2.getRoles().remove(role);
		
		session.save(user);
		session.save(user2);
		
		tr.commit();
	}
}
