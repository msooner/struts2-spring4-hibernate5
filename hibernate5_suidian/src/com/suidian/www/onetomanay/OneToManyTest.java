package com.suidian.www.onetomanay;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.suidian.www.utils.hibernateUtils;

public class OneToManyTest {
	@Test
	public void demo() {
		Session session = hibernateUtils.getCurrentSession();
		Transaction tr = session.beginTransaction();
		
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		
		customer1.setCust_name("小三");
		customer2.setCust_name("小四");
		
		Linkman linkman1 = new Linkman();
		Linkman linkman2 = new Linkman();
		Linkman linkman3 = new Linkman();
		
		linkman1.setLkm_name("Jack");
		linkman2.setLkm_name("Tom");
		linkman3.setLkm_name("Marry");
		
		customer1.getLinkmans().add(linkman1);
		customer2.getLinkmans().add(linkman2);
		customer2.getLinkmans().add(linkman3);
		
		
		linkman1.setCustomer(customer1);
		linkman2.setCustomer(customer2);
		linkman3.setCustomer(customer2);
		
		session.save(customer2);
		session.save(customer1);
		session.save(linkman1);
		session.save(linkman2);
		session.save(linkman3);
		
		
		tr.commit();
	}
	
	// 级联保存
	@Test
	public void demo2() {
		Session session = hibernateUtils.getCurrentSession();
		Transaction tr = session.beginTransaction();
		
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		
		customer1.setCust_name("小五");
		customer2.setCust_name("小六");
		
		Linkman linkman1 = new Linkman();
		Linkman linkman2 = new Linkman();
		Linkman linkman3 = new Linkman();
		
		linkman1.setLkm_name("K");
		linkman2.setLkm_name("T");
		linkman3.setLkm_name("M");
		
		customer1.getLinkmans().add(linkman1);
		customer2.getLinkmans().add(linkman2);
		customer2.getLinkmans().add(linkman3);
		
		session.save(customer1);
		session.save(customer2);
		
//		session.save(linkman1);
//		session.save(linkman2);
//		session.save(linkman3);
		tr.commit();
	}
	
	@Test
	public void demo3() {
		Session session = hibernateUtils.getCurrentSession();
		Transaction tr = session.beginTransaction();
		
		Customer customer = session.load(Customer.class, 1l);
		session.delete(customer);
		
		tr.commit();
	}
}
