package com.suidian.www.demo5;

public class Customer {
	public Customer(String name, Integer age) {
		this.age = age;
		this.name = name;
	}
	
	public Customer() {}
	
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}
	
}
