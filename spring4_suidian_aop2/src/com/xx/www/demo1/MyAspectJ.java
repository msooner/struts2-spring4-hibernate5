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
	
	// 配置前置通知
	@Before(value="execution(* com.xx.www.demo1.UserDao.save(..))")
	public void toBefore() {
		System.out.println("前置增强。。。");
	}
	
	// 后置通知
	@AfterReturning(value="execution(* com.xx.www.demo1.UserDao.delete(..))",returning="result")
	public void back(Object result) {
		System.out.println("后置增强。。。" + result);
	}
	
	// 环绕通知
	@Around(value="execution(* com.xx.www.demo1.UserDao.update(..))")
	public Object round(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("环绕增强前。。。");
		Object obj = joinPoint.proceed(); // 运行被增强的方法
		System.out.println("环绕增强后。。。");
		return obj;
	}
	
	// 异常抛出通知
	@AfterThrowing(value="execution(* com.xx.www.demo1.UserDao.find(..))",throwing="e")
	public void throwException(Throwable e) {
		System.out.println("异常增强后。。。" + e.getMessage());
	}
	
	// 最终通知
	@After(value="MyAspectJ.pointcut1()")
	public void fin() {
		System.out.println("最终通知");
	}
	
	// 切入点注解
	@Pointcut(value="execution(* com.xx.www.demo1.UserDao.find(..))")
	private void pointcut1() {}
	
}
