package com.xx.www.dao.Impl;

import org.hibernate.FlushMode;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.xx.www.dao.CustomerDao;
import com.xx.www.domain.Customer;

public class CustomerDaoImp extends HibernateDaoSupport implements CustomerDao{

	@Override
	public void demo(Customer customer) {
		// TODO Auto-generated method stub
		getSessionFactory().getCurrentSession().setFlushMode(FlushMode.COMMIT);
		System.out.println("customerDao÷¥––¡À°£°£°£" + customer);
		this.getHibernateTemplate().save(customer);
		
	}

}
