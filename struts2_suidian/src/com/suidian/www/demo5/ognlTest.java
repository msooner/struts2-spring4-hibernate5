package com.suidian.www.demo5;

import org.junit.Test;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

public class ognlTest {
	
//	ognl调用对象方法
	@Test
	public void test1() throws OgnlException {
		OgnlContext context = new OgnlContext();
		Object root = context.getRoot();
		
		Object len = Ognl.getValue("'1234567890'.length()", context, root);
		System.out.println(len);
	}
	
//	ognl调用静态方法@类@静态方法
	@Test
	public void test2() throws OgnlException {
		OgnlContext context = new OgnlContext();
		Object root = context.getRoot();
		Object obj = Ognl.getValue("@java.lang.Math@random()", context, root);
		System.out.println(obj);
	}
	
//	访问root中数据
	@Test
	public void test3() throws OgnlException {
		OgnlContext context = new OgnlContext();
		
		Customer cus = new Customer("Jack",123);
//		向root中存储数据
		context.setRoot(cus);
		// 获取root
		Object root = context.getRoot();
		
		Object cusname = Ognl.getValue("name", context, root);
		Object cusage = Ognl.getValue("age", context, root);
		System.out.println(cusname + "   " + cusage);
	}
	
//	访问context中的数据
	@Test
	public void test4() throws OgnlException {
		OgnlContext context = new OgnlContext();
		Object root = context.getRoot();
		
		context.put("name", "Tom");
		context.put("age", 123);
		Object name = Ognl.getValue("#name", context, root);
		Object age = Ognl.getValue("#age", context, root);
		System.out.println(name + "  " + age);
	}
}
