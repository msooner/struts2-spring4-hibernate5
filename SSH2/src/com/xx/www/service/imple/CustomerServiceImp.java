package com.xx.www.service.imple;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.xx.www.dao.Impl.CustomerDaoImp;
import com.xx.www.domain.Customer;
import com.xx.www.service.CustomerService;


/* ����Propagation.REQUIRED�����read only�쳣
 * ����쳣��������Ҫԭ����DAO������Spring���������������ԣ�
 * ����������������ƺ����������ָ���ı���������Ʋ��ܹ�ƥ���ϣ�
 * spring �ͻ��ȡĬ�ϵ�����������(PROPAGATION_REQUIRED,read only).
 * ����ǲ�����޸Ĳ������Ͳ�������ġ�
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
		
		System.out.println("service�еķ���ִ���ˡ�����" + customer);
		customerDao.save(customer);
	}
	
}
