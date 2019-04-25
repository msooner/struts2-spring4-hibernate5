package com.suidian.www.demo4;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class demo7 extends ActionSupport{
	
	private List<User> list;
	
	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}
	
	@Override
	public String execute() {
		
		for(User user:list) {
			System.out.println(user);
		}
		
		return NONE;
	}
}
