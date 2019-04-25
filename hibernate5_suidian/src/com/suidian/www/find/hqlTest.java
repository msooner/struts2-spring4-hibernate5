package com.suidian.www.find;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.suidian.www.onetomanay.Customer;
import com.suidian.www.onetomanay.Linkman;
import com.suidian.www.utils.hibernateUtils;

public class hqlTest {
	// 数据初始化
	@Test
	public void demo(){
		Session session = hibernateUtils.getCurrentSession();
		Transaction tr = session.beginTransaction();
		
		Random ran = new Random();
		Customer cus = new Customer();
		
		cus.setCust_name("小绿");
		
		for(int i=0;i<30;i++) {
			Linkman lm = new Linkman();
			lm.setLkm_name("CUS" + ran.nextInt(10000000));
			lm.setLkm_phone("" + ran.nextInt(10000000) + ran.nextInt(10000000));
			
			cus.getLinkmans().add(lm);
			lm.setCustomer(cus);
			session.save(lm);
		}	
		//session.save(cus);
		tr.commit();
	}
	
	@Test
	public void demo2() {
		Session session = hibernateUtils.getCurrentSession();
		Transaction tr = session.beginTransaction();
		
		//简单查询
//		List<Linkman> lm = session.createQuery("from Linkman").list();
		
		// 别名查询
//		List<Linkman> lm = session.createQuery("select a from Linkman a").list();
		
		// 排序查询 desc：降序   asc:升序
//		List<Linkman> lm = session.createQuery("select a from Linkman a order by a.lkm_phone desc").list();
		
		// 条件查询
		// 1.占位符方式     ?   
//		 Query query = session.createQuery("select a from Linkman a where lkm_id < ? and lkm_name like ? order by a.lkm_phone desc");
//		 query.setParameter(0, 50l);
//		 query.setParameter(1, "LM%");
//		 List<Linkman> lm = query.list();
		
		// 2.命名方式      :xxx
//		Query query = session.createQuery("select a from Linkman a where lkm_id < :aa and lkm_name like :ac order by a.lkm_phone desc");
//		query.setParameter("aa", 50l);
//		query.setParameter("ac", "LM%");
//		List<Linkman> lm = query.list();
		
		// 投影查询:查询部分字段
//		Query query = session.createQuery("select a.lkm_id,a.lkm_phone from Linkman a order by a.lkm_phone desc");
//		List<Object[]> lm = query.list();
		
		// 将字段封装到对象,需要映射类提供构造方法
//		Query query = session.createQuery("select new Linkman(a.lkm_id,a.lkm_phone) from Linkman a order by a.lkm_phone desc");
//		List<Linkman> lm = query.list();
		
		// 分页查询
//		Query query = session.createQuery("select a from Linkman a order by a.lkm_phone desc");
//		for(int i=0;i<60;i++) {
//			query.setFirstResult(i);
//			query.setMaxResults(10);
//			System.out.println("---------------------------------------------");
//			List<Linkman> lm = query.list();
//			for(Linkman linkman: lm) {
//				System.out.println(linkman);
//			}
//		}
		
		
//		// 分组统计查询 count() max() min() avg() sum()
		
		Query query = session.createQuery("select count(*) from Linkman a order by a.lkm_phone desc");
		Object obj =  query.uniqueResult(); // uniqueResult()取第一个值
		System.out.println(obj);
		
		
		tr.commit();
	}
}
