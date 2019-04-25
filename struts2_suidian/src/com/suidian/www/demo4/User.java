package com.suidian.www.demo4;

public class User {
	private String name;
	private String password;
	private int age;
	
	public void setAge(int age) {
		this.age = age;
	}
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

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", age=" + age + "]";
	}
	
}
