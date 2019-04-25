package com.suidian.www.demo1;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.suidian.www.utils.hibernateUtils;

public class hibernateDemo3 {
	
	@Test
	public void demo() {
		Session session = hibernateUtils.getCurrentSession();
		Transaction tr = session.beginTransaction();
		
		User user = new User();
		user.setAge(12);
		user.setName("小三");
		user.setPassword("567890");
		
		session.save(user);
		
		tr.commit();
		// session不用close，线程结束自动关闭
	}
	
	// hql查询
	@Test
	public void demo2() {
		Session session = hibernateUtils.getCurrentSession();
		Transaction tr = session.beginTransaction();
		
//		String hql = "from User";
//		Query query = session.createQuery(hql);
//		List<User> list = query.list();
//		for(User u : list) {
//			System.out.println(u);
//		}
		
		
		System.out.println("------------------------------------------------------------");
		
		String hql1 = "from User where name like ?";
		Query query1 = session.createQuery(hql1);
		query1.setParameter(0, "J%");
		List<User> list1 = query1.list();
		for(User u1:list1) {
			System.out.println(u1);
		}
		
		tr.commit();
	}
	
	// Criteria
	@Test
	public void demo3() {
		Session session = hibernateUtils.getCurrentSession();
		Transaction tr = session.beginTransaction();
		
		Criteria cri = session.createCriteria(User.class);
		
		cri.add(Restrictions.like("name", "小%"));
		
		List<User> list = cri.list();
		for(User u : list) {
			System.out.println(u);
		}
		
		tr.commit();
	}
}
