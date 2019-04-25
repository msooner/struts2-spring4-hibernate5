package com.suidian.www.demo1;

public class UserImp{

	private String name;
	private Integer age;
	private Car car;
	
	public void setCar(Car car) {
		this.car = car;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserImp [name=" + name + ", age=" + age + ", car=" + car + "]";
	}

	

}
