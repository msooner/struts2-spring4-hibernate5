package com.suidian.www.demo3;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;

public class User {
	@Value("Tom")
	private String name;
	@Resource(name="customer")
	private Customer customer;
	
	public void save() {
		System.out.println(name + " 的客户是：" + customer.getName());
	}
}
