package com.madhuri;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class Audience implements MethodBeforeAdvice,  ThrowsAdvice ,MethodInterceptor {

//	@Override
//	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
//		System.out.println("The audience is clapping.");
//		
//	}

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("The audience is taking their seats.");
		
	}
	public void afterThrowing(Method method, Object[] data, Object target, PerformanceException e) {
		System.out.println("Boo! We want our money back!");
	}

	@Override
	public Object invoke(MethodInvocation joinpoint) throws Throwable {
		// TODO Auto-generated method stub
		Object obj = null;
		System.out.println("Start of Performance");
		long start = System.currentTimeMillis();

		obj = joinpoint.proceed();

		long end = System.currentTimeMillis();
		System.out.println("***The performance took***:" + (end - start) + " milliseconds");
		return obj;	}

	

}
