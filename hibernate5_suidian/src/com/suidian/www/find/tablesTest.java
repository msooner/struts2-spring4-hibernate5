package com.suidian.www.find;

import java.util.Arrays;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.suidian.www.onetomanay.Customer;
import com.suidian.www.utils.hibernateUtils;

public class tablesTest {
	
	@Test
	public void demo() {
		Session session = hibernateUtils.getCurrentSession();
		Transaction tr = session.beginTransaction();
		/*	SQL的多表查询
		 * 	连接查询：
		 * 		交叉连接 select * from A,B  (笛卡尔积)
		 * 		内连接   inner join      inner 可以省略 ，取两表的交集
		 * 			隐式内连接  select * from  A,B where A.id = B.id
		 * 			显式内连接 select * from A inner join B on A.id = B.id
		 * 		外连接 outer join       outer 可以省略，两表的交集加左表或右表的所有
		 * 			左外连接 select * from A left outer join B on A.id = B.id 
		 * 			右外连接 select * from A right outer join B on A.id = B.id 
		 * 	子查询
		 * 
		 * 
		 * HQL多表查询
		 * 	连接查询
		 * 		交叉连接
		 * 		内连接
		 * 			显式内连接
		 * 			隐式内连接
		 * 			*迫切内连接
		 * 		外连接
		 * 			左外连接
		 * 			右外连接
		 * 			*迫切外连接
		 * */	
		
		// 普通内连接
//		List<Object[]> lists = session.createQuery("from Customer c inner join c.linkmans").list();
//		for(Object[] obj:lists) {
//			System.out.println(Arrays.toString(obj));
//		}
		
		
		// 迫切内内连接，就是在普通内连接inner join 后添加一个关键字fetch
		// fetch通知hibernat将另一个对象封装到该对象中
		List<Customer> lists = session.createQuery("select distinct c from Customer c inner join fetch c.linkmans").list();
		for(Customer cus:lists) {
			System.out.println(cus);
		}
		
		tr.commit();
	}
	
	
	// sql查询
	@Test
	public void demo2() {
		Session session = hibernateUtils.getCurrentSession();
		Transaction tr = session.beginTransaction();
		
//		SQLQuery sq = session.createSQLQuery("select * from cst_customer");
//		List<Object[]> lists = sq.list();
//		for(Object[] obj:lists) {
//			System.out.println(Arrays.toString(obj));
//		}
		
		SQLQuery sq = session.createSQLQuery("select * from cst_customer");
		// 封装到Customer
		sq.addEntity(Customer.class);
		List<Customer> lists = sq.list();
		
		for(Customer cus:lists) {
			System.out.println(cus);
		}
		
		tr.commit();
	}
}
