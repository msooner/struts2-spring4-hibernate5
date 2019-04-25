package com.suidian.www.demo4;

import com.opensymphony.xwork2.ActionSupport;

public class demo4 extends ActionSupport{
	private String name;
	private String password;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String test(){
		System.out.println(name + "  " + password + "  " + age);
		
		return NONE;
	}
}
