package com.xx.www.demo1;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ApplicationContext.xml") // º”‘ÿ≈‰÷√Œƒº˛
public class DemoTest {
	@Resource(name="userDao")
	private UserDao userDao;
	
	@Test
	public void test() {
		userDao.save();
		userDao.delete();
		userDao.find();
		userDao.update();
	}
}
