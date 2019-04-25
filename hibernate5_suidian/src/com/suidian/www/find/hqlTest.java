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
	// ���ݳ�ʼ��
	@Test
	public void demo(){
		Session session = hibernateUtils.getCurrentSession();
		Transaction tr = session.beginTransaction();
		
		Random ran = new Random();
		Customer cus = new Customer();
		
		cus.setCust_name("С��");
		
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
		
		//�򵥲�ѯ
//		List<Linkman> lm = session.createQuery("from Linkman").list();
		
		// ������ѯ
//		List<Linkman> lm = session.createQuery("select a from Linkman a").list();
		
		// �����ѯ desc������   asc:����
//		List<Linkman> lm = session.createQuery("select a from Linkman a order by a.lkm_phone desc").list();
		
		// ������ѯ
		// 1.ռλ����ʽ     ?   
//		 Query query = session.createQuery("select a from Linkman a where lkm_id < ? and lkm_name like ? order by a.lkm_phone desc");
//		 query.setParameter(0, 50l);
//		 query.setParameter(1, "LM%");
//		 List<Linkman> lm = query.list();
		
		// 2.������ʽ      :xxx
//		Query query = session.createQuery("select a from Linkman a where lkm_id < :aa and lkm_name like :ac order by a.lkm_phone desc");
//		query.setParameter("aa", 50l);
//		query.setParameter("ac", "LM%");
//		List<Linkman> lm = query.list();
		
		// ͶӰ��ѯ:��ѯ�����ֶ�
//		Query query = session.createQuery("select a.lkm_id,a.lkm_phone from Linkman a order by a.lkm_phone desc");
//		List<Object[]> lm = query.list();
		
		// ���ֶη�װ������,��Ҫӳ�����ṩ���췽��
//		Query query = session.createQuery("select new Linkman(a.lkm_id,a.lkm_phone) from Linkman a order by a.lkm_phone desc");
//		List<Linkman> lm = query.list();
		
		// ��ҳ��ѯ
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
		
		
//		// ����ͳ�Ʋ�ѯ count() max() min() avg() sum()
		
		Query query = session.createQuery("select count(*) from Linkman a order by a.lkm_phone desc");
		Object obj =  query.uniqueResult(); // uniqueResult()ȡ��һ��ֵ
		System.out.println(obj);
		
		
		tr.commit();
	}
}
