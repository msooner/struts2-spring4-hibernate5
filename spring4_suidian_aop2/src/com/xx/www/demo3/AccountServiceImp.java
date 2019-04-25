package com.xx.www.demo3;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/*	@Transactional：配置事务管理注解
 * isolation: 隔离级别
 * propagation： 传播行为
 * */
@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED)
public class AccountServiceImp implements AccountService {
	
	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public void tranferMoney(String from, String to, Double money) {
		// TODO Auto-generated method stub
		accountDao.outMoney(from, money);
//		int i = 1/0;
		accountDao.inMoney(to, money);
	}

}
