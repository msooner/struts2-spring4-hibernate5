package com.xx.www.demo1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspectJ {
	
	// ����ǰ��֪ͨ
	@Before(value="execution(* com.xx.www.demo1.UserDao.save(..))")
	public void toBefore() {
		System.out.println("ǰ����ǿ������");
	}
	
	// ����֪ͨ
	@AfterReturning(value="execution(* com.xx.www.demo1.UserDao.delete(..))",returning="result")
	public void back(Object result) {
		System.out.println("������ǿ������" + result);
	}
	
	// ����֪ͨ
	@Around(value="execution(* com.xx.www.demo1.UserDao.update(..))")
	public Object round(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("������ǿǰ������");
		Object obj = joinPoint.proceed(); // ���б���ǿ�ķ���
		System.out.println("������ǿ�󡣡���");
		return obj;
	}
	
	// �쳣�׳�֪ͨ
	@AfterThrowing(value="execution(* com.xx.www.demo1.UserDao.find(..))",throwing="e")
	public void throwException(Throwable e) {
		System.out.println("�쳣��ǿ�󡣡���" + e.getMessage());
	}
	
	// ����֪ͨ
	@After(value="MyAspectJ.pointcut1()")
	public void fin() {
		System.out.println("����֪ͨ");
	}
	
	// �����ע��
	@Pointcut(value="execution(* com.xx.www.demo1.UserDao.find(..))")
	private void pointcut1() {}
	
}
