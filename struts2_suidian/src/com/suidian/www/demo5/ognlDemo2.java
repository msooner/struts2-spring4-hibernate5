package com.suidian.www.demo5;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class ognlDemo2 extends ActionSupport{
	
	public String execute() {
		
//		获取值栈
		ValueStack vs = ActionContext.getContext().getValueStack();
		Customer cus = new Customer("Jack", 25);
		// 压栈
		// 直接压入对象
		vs.push(cus);
		// 压入键值对
		vs.set("password", 123);
		return SUCCESS;
	}
}
