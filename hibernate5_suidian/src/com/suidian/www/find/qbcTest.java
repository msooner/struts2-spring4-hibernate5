package com.suidian.www.find;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.suidian.www.onetomanay.Linkman;
import com.suidian.www.utils.hibernateUtils;

public class qbcTest {
	
	@Test
	public void demo() {
		Session session = hibernateUtils.getCurrentSession();
		Transaction tr = session.beginTransaction();
		
		// �򵥲�ѯ
		Criteria cri = session.createCriteria(Linkman.class);
		

		/*	add:��ͨ������where���������
		 *  addOrder������
		 *  setProjection���ۺϺ�����group by having
		 * 
		 * */
		
		// �����ѯ
		cri.addOrder(Order.desc("lkm_id"));
//		// ��ҳ��ѯ
//		cri.setFirstResult(0);
//		cri.setMaxResults(5);
		/* ������ѯ
		 * 	= eq
		 *  > gt
		 *  >= ge
		 *  < lt
		 * 	< le
		 * 	<> ne
		 * 	like
		 *  in 
		 *  and
		 *  or
		 * */
		cri.add(Restrictions.gt("lkm_id",50l));
		cri.add(Restrictions.like("lkm_name", "CUS%"));
		// ͳ�Ʋ�ѯ
		cri.setProjection(Projections.rowCount());
		Long num = (Long)cri.uniqueResult();
		System.out.println(num);
		
		
//		List<Linkman> list = cri.list();
//		
//		for(Linkman lm:list) {
//			System.out.println(lm);
//		}
//		
		
		tr.commit();
		
	}
	
	// ����������ѯ
	@Test
	public void demo2() {
		DetachedCriteria dc = DetachedCriteria.forClass(Linkman.class);
		dc.add(Restrictions.like("lkm_name", "CUS%"));
		
		Session session = hibernateUtils.getCurrentSession();
		Transaction tr = session.beginTransaction();
		
		// ���߲�ѯ��session
		 Criteria cri = dc.getExecutableCriteria(session);
		List<Linkman> lists = cri.list();
		
		for(Linkman lm:lists) {
			System.out.println(lm);
		}
		tr.commit();
	}
}
