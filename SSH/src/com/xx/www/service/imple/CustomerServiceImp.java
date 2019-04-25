package com.xx.www.service.imple;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.xx.www.dao.Impl.CustomerDaoImp;
import com.xx.www.domain.Customer;
import com.xx.www.service.CustomerService;


//@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED)
public class CustomerServiceImp implements CustomerService{

	private CustomerDaoImp customerDao;

	public void setCustomerDao(CustomerDaoImp customerDao) {
		this.customerDao = customerDao;
	}


	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("service中的方法执行了。。。" + customer);
		customerDao.save(customer);
	}
	
}
