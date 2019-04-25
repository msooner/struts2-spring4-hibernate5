package com.suidian.www.demo2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="customer")
public class Customer {
	@Value("Ð¡Èý")
	private String name;
	@Value("12")
	private String age;
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}
}
