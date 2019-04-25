package com.suidian.www.demo1;

public class Car {
	private String name;
	private Integer price;
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
	
	
}
