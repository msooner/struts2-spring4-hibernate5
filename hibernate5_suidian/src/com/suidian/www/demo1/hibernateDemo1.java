package com.suidian.www.demo1;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.suidian.www.utils.hibernateUtils;

public class hibernateDemo1 {
	@Test
	public void demo1() {
		// 1.加载hibernate核心配置文件
			Configuration configuration = new Configuration().configure();
		// 2.创建一个sessionFactory对象，类似于JDBC连接池
			SessionFactory sf = configuration.buildSessionFactory();
		// 3.通过sessionFactory获得session对象：类似于JDBC的Connection,与数据库交互的桥梁
			Session session = sf.openSession();
		// 4.手动开启事务 
			Transaction transaction = session.beginTransaction();
		// 5.编写代码
			
			User user = new User();
			user.setAge(18);
			user.setName("Jack");
			user.setPassword("123");
			
			session.save(user);       
			
		// 6.事务提交
			transaction.commit();
//			事务可回滚
//			transaction.rollback();
		// 7.资源释放
			session.close();
	}
	
	@Test
	public void demo2() {
		Session session = hibernateUtils.openSession();
		
		Transaction tr = session.beginTransaction();
		

//		User user = new User();
//		user.setAge(18);
//		user.setName("Jack");
//		user.setPassword("123");
//		session.save(user);
		/**
		 * session
		 * 	保存 方法：Serializable save；
		 * 	查询方法：
		 * 		get：
		 * 			1.执行到这行代码就发送sql语句
		 * 			2.返回的是真实对象
		 * 			3.没有查询到东西会返回null
		 * 		load：
		 * 			1.执行到这行代码时不会发送sql语句，只有实际要用时才会发送
		 * 			2.返回的是代理对象
		 * 			3.没有查询到东西会抛异常
		 * 	更新方法： update
		 * 	删除方法： delete
		 * 	更新或保存方法： updateorsave
		 * 
		 */

		
//		User user1 = session.get(User.class, 1);
//		System.out.println(user1);
//		
//		User user2 = session.load(User.class, 2);
//		System.out.println(user2);
		
		/**
		 * 	1.先创建对象，在更新（会把原来的字段删除再更新）
		 * 	2.先查寻再更新（原来的字段不会被删除）
		 * 
		 */
		
//		User user3 = session.get(User.class,3);
//		user3.setAge(1200);
//		session.update(user3);
		
		/**
		 * 	1.先创建对象再删除（不会级联删除）
		 * 	2.先查询再删除（会级联删除）
		 * 
		 */
		
//		User user4 = session.get(User.class, 1);
//		session.delete(user4);
		
		/**
		 * 	批量查询：
		 * 	SQl方式：返回的是object对象数组集合
		 * 	HQL方式（对象方式）：返回的是User对象集合
		 * 
		 */
		
		
//		SQLQuery sqlquery = session.createSQLQuery("select * from demo1");
//		List<Object[]> list1 = sqlquery.list();
//		for(Object[] obj:list1) {
//			System.out.println(Arrays.toString(obj));
//		}
		
//		用表的映射类查询
//		Query qu = session.createQuery("from User");
//		List<User> list2 = qu.list();
//		for(User u : list2) {
//			System.out.println(u);
//		}
		
		tr.commit();
		session.close();
	}
	
	@Test
	public void demo3() {
		Session session = hibernateUtils.openSession();
		Transaction tr = session.beginTransaction();
		
//		持久化类三种状态
		User user = new User();  // 瞬时态，没有唯一OID，没有被session管理
		
		user.setAge(1289);
		user.setName("Marry");
		user.setPassword("23456");
		
		 // 持有态，有唯一OID，被session管理,持久化对象自动更新数据库
		/**
		 *  原理：hibernate存在一级缓存，当持久态对象生成时会向一级缓存的缓存区和快照区各存存入相同数据
		 *	，修改数据会存入缓存区，当缓存区和快照区数据不相同时自动更新数据库
		 */
		
		Serializable ser = session.save(user);
		
		System.out.println(ser);
		
		tr.commit();
		session.close();
		
		System.out.println(ser + "   " + user); // 托管态，有唯一OID，没有被session管理
		
		/**
		 * 	三种状态转换
		 * 	1.瞬时态获取
		 * 		User user = new User()
		 * 		瞬时->持久
		 * 		save,saveorupdate
		 * 		瞬时->托管
		 * 		user.setId(1)
		 *	2.持久态获取
		 *		get,load,find,iterate
		 *		持久->瞬时
		 *		delete
		 *		持久->托管
		 *		close,clear
		 * 	3.托管态获取
		 * 		User user = new User()   user.setId(1)
		 * 		托管->瞬时
		 * 		user.setId(null)
		 * 		托管->持久
		 * 		save,saveorupdate
		 * 
		 */
	}
}
