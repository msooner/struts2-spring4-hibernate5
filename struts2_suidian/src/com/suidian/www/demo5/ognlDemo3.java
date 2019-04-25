package com.suidian.www.demo5;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class ognlDemo3 extends ActionSupport{

	public String execute() {
		// ��ֵջroot�з�������
		ValueStack vs = ActionContext.getContext().getValueStack();
		List<Customer> list = new ArrayList<>();
		
		list.add(new Customer("Jack",12));
		list.add(new Customer("Tom",11));
		list.add(new Customer("Marry",13));
		
		vs.set("list", list);
		
//		��ֵջcontext�з�������
		ServletActionContext.getRequest().setAttribute("name", "req");
		ServletActionContext.getRequest().getSession().setAttribute("name", "ses");
		ServletActionContext.getServletContext().setAttribute("name", "app");
		
		return SUCCESS;
	}
}
