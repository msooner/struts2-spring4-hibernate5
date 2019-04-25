package com.suidian.www.demo4;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class demo6 extends ActionSupport implements ModelDriven<User>{

	private User user = new User();
    
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	public String test() {
		System.out.println(user);
		return NONE;
	}


}
