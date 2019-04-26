package com.xx.www.service.imple;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.xx.www.dao.Impl.CustomerDaoImp;
import com.xx.www.domain.Customer;
import com.xx.www.service.CustomerService;


/* 不加Propagation.REQUIRED会产生read only异常
 * 这个异常产生的主要原因是DAO采用了Spring容器的事务管理策略，
 * 如果操作方法的名称和事务策略中指定的被管理的名称不能够匹配上，
 * spring 就会采取默认的事务管理策略(PROPAGATION_REQUIRED,read only).
 * 如果是插入和修改操作，就不被允许的。
 * 
 * */
@Transactional(propagation=Propagation.REQUIRED)
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
