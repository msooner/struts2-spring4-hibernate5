package com.suidian.www.demo5;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class ognlDemo2 extends ActionSupport{
	
	public String execute() {
		
//		��ȡֵջ
		ValueStack vs = ActionContext.getContext().getValueStack();
		Customer cus = new Customer("Jack", 25);
		// ѹջ
		// ֱ��ѹ�����
		vs.push(cus);
		// ѹ���ֵ��
		vs.set("password", 123);
		return SUCCESS;
	}
}
