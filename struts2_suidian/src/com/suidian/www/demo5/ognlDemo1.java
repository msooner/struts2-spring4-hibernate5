package com.suidian.www.demo5;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class ognlDemo1 extends ActionSupport{
	
	public Customer cus;
	
	public Customer getCus() {
		return cus;
	}

	public String execute() {
		
		ValueStack vs = ActionContext.getContext().getValueStack();
		
		cus = new Customer("уехЩ", 12);
		
		return SUCCESS;
	}
}
