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
		/*	SQL�Ķ���ѯ
		 * 	���Ӳ�ѯ��
		 * 		�������� select * from A,B  (�ѿ�����)
		 * 		������   inner join      inner ����ʡ�� ��ȡ����Ľ���
		 * 			��ʽ������  select * from  A,B where A.id = B.id
		 * 			��ʽ������ select * from A inner join B on A.id = B.id
		 * 		������ outer join       outer ����ʡ�ԣ�����Ľ����������ұ������
		 * 			�������� select * from A left outer join B on A.id = B.id 
		 * 			�������� select * from A right outer join B on A.id = B.id 
		 * 	�Ӳ�ѯ
		 * 
		 * 
		 * HQL����ѯ
		 * 	���Ӳ�ѯ
		 * 		��������
		 * 		������
		 * 			��ʽ������
		 * 			��ʽ������
		 * 			*����������
		 * 		������
		 * 			��������
		 * 			��������
		 * 			*����������
		 * */	
		
		// ��ͨ������
//		List<Object[]> lists = session.createQuery("from Customer c inner join c.linkmans").list();
//		for(Object[] obj:lists) {
//			System.out.println(Arrays.toString(obj));
//		}
		
		
		// �����������ӣ���������ͨ������inner join �����һ���ؼ���fetch
		// fetch֪ͨhibernat����һ�������װ���ö�����
		List<Customer> lists = session.createQuery("select distinct c from Customer c inner join fetch c.linkmans").list();
		for(Customer cus:lists) {
			System.out.println(cus);
		}
		
		tr.commit();
	}
	
	
	// sql��ѯ
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
		// ��װ��Customer
		sq.addEntity(Customer.class);
		List<Customer> lists = sq.list();
		
		for(Customer cus:lists) {
			System.out.println(cus);
		}
		
		tr.commit();
	}
}
