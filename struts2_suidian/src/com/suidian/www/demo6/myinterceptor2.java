package com.suidian.www.demo6;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class myinterceptor2 extends AbstractInterceptor{
	
	@Override
	public String intercept(ActionInvocation invaocation) throws Exception {
		
		System.out.println("������2ִ���ˡ�����");
		String obj = invaocation.invoke();
		System.out.println("������2ִ�н���������");
		return obj;
	}
}
