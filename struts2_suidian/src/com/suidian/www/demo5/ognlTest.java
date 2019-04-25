package com.suidian.www.demo5;

import org.junit.Test;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

public class ognlTest {
	
//	ognl���ö��󷽷�
	@Test
	public void test1() throws OgnlException {
		OgnlContext context = new OgnlContext();
		Object root = context.getRoot();
		
		Object len = Ognl.getValue("'1234567890'.length()", context, root);
		System.out.println(len);
	}
	
//	ognl���þ�̬����@��@��̬����
	@Test
	public void test2() throws OgnlException {
		OgnlContext context = new OgnlContext();
		Object root = context.getRoot();
		Object obj = Ognl.getValue("@java.lang.Math@random()", context, root);
		System.out.println(obj);
	}
	
//	����root������
	@Test
	public void test3() throws OgnlException {
		OgnlContext context = new OgnlContext();
		
		Customer cus = new Customer("Jack",123);
//		��root�д洢����
		context.setRoot(cus);
		// ��ȡroot
		Object root = context.getRoot();
		
		Object cusname = Ognl.getValue("name", context, root);
		Object cusage = Ognl.getValue("age", context, root);
		System.out.println(cusname + "   " + cusage);
	}
	
//	����context�е�����
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
