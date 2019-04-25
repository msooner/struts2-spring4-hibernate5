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
		// 1.����hibernate���������ļ�
			Configuration configuration = new Configuration().configure();
		// 2.����һ��sessionFactory����������JDBC���ӳ�
			SessionFactory sf = configuration.buildSessionFactory();
		// 3.ͨ��sessionFactory���session����������JDBC��Connection,�����ݿ⽻��������
			Session session = sf.openSession();
		// 4.�ֶ��������� 
			Transaction transaction = session.beginTransaction();
		// 5.��д����
			
			User user = new User();
			user.setAge(18);
			user.setName("Jack");
			user.setPassword("123");
			
			session.save(user);       
			
		// 6.�����ύ
			transaction.commit();
//			����ɻع�
//			transaction.rollback();
		// 7.��Դ�ͷ�
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
		 * 	���� ������Serializable save��
		 * 	��ѯ������
		 * 		get��
		 * 			1.ִ�е����д���ͷ���sql���
		 * 			2.���ص�����ʵ����
		 * 			3.û�в�ѯ�������᷵��null
		 * 		load��
		 * 			1.ִ�е����д���ʱ���ᷢ��sql��䣬ֻ��ʵ��Ҫ��ʱ�Żᷢ��
		 * 			2.���ص��Ǵ������
		 * 			3.û�в�ѯ�����������쳣
		 * 	���·����� update
		 * 	ɾ�������� delete
		 * 	���»򱣴淽���� updateorsave
		 * 
		 */

		
//		User user1 = session.get(User.class, 1);
//		System.out.println(user1);
//		
//		User user2 = session.load(User.class, 2);
//		System.out.println(user2);
		
		/**
		 * 	1.�ȴ��������ڸ��£����ԭ�����ֶ�ɾ���ٸ��£�
		 * 	2.�Ȳ�Ѱ�ٸ��£�ԭ�����ֶβ��ᱻɾ����
		 * 
		 */
		
//		User user3 = session.get(User.class,3);
//		user3.setAge(1200);
//		session.update(user3);
		
		/**
		 * 	1.�ȴ���������ɾ�������ἶ��ɾ����
		 * 	2.�Ȳ�ѯ��ɾ�����ἶ��ɾ����
		 * 
		 */
		
//		User user4 = session.get(User.class, 1);
//		session.delete(user4);
		
		/**
		 * 	������ѯ��
		 * 	SQl��ʽ�����ص���object�������鼯��
		 * 	HQL��ʽ������ʽ�������ص���User���󼯺�
		 * 
		 */
		
		
//		SQLQuery sqlquery = session.createSQLQuery("select * from demo1");
//		List<Object[]> list1 = sqlquery.list();
//		for(Object[] obj:list1) {
//			System.out.println(Arrays.toString(obj));
//		}
		
//		�ñ��ӳ�����ѯ
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
		
//		�־û�������״̬
		User user = new User();  // ˲ʱ̬��û��ΨһOID��û�б�session����
		
		user.setAge(1289);
		user.setName("Marry");
		user.setPassword("23456");
		
		 // ����̬����ΨһOID����session����,�־û������Զ��������ݿ�
		/**
		 *  ԭ��hibernate����һ�����棬���־�̬��������ʱ����һ������Ļ������Ϳ��������������ͬ����
		 *	���޸����ݻ���뻺���������������Ϳ��������ݲ���ͬʱ�Զ��������ݿ�
		 */
		
		Serializable ser = session.save(user);
		
		System.out.println(ser);
		
		tr.commit();
		session.close();
		
		System.out.println(ser + "   " + user); // �й�̬����ΨһOID��û�б�session����
		
		/**
		 * 	����״̬ת��
		 * 	1.˲ʱ̬��ȡ
		 * 		User user = new User()
		 * 		˲ʱ->�־�
		 * 		save,saveorupdate
		 * 		˲ʱ->�й�
		 * 		user.setId(1)
		 *	2.�־�̬��ȡ
		 *		get,load,find,iterate
		 *		�־�->˲ʱ
		 *		delete
		 *		�־�->�й�
		 *		close,clear
		 * 	3.�й�̬��ȡ
		 * 		User user = new User()   user.setId(1)
		 * 		�й�->˲ʱ
		 * 		user.setId(null)
		 * 		�й�->�־�
		 * 		save,saveorupdate
		 * 
		 */
	}
}
