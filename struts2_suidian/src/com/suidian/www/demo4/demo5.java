package com.suidian.www.demo4;

import com.opensymphony.xwork2.ActionSupport;

public class demo5 extends ActionSupport{
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String test() {
		System.out.println(user);
		return NONE;
	}
	
}
