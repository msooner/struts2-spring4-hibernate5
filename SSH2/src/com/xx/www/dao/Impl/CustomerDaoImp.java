package com.xx.www.dao.Impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.xx.www.dao.CustomerDao;
import com.xx.www.domain.Customer;

public class CustomerDaoImp extends HibernateDaoSupport implements CustomerDao{

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(customer);
		System.out.println("customerDao÷¥––¡À°£°£°£" + customer);
	}

}
