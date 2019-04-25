package com.suidian.www.demo3;

import org.springframework.beans.factory.annotation.Value;

public class Customer {
	@Value("Ð¡½é")
	private String name;

	public String getName() {
		return name;
	}
}
