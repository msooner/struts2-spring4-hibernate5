package com.suidian.www.onetomanay;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.suidian.www.utils.hibernateUtils;

public class oneToManay {
	@Test
	public void demo() {
		Session session = hibernateUtils.getCurrentSession();
		Transaction tr = session.beginTransaction();
		
		
		
		tr.commit();
	}
}
