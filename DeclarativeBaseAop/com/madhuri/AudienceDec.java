package com.madhuri;

import java.lang.reflect.Method;

//import org.springframework.aop.AfterReturningAdvice;
//import org.springframework.aop.MethodBeforeAdvice;
//import org.springframework.aop.ThrowsAdvice;
//import org.aopalliance.intercept.MethodInterceptor;
//import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.ProceedingJoinPoint;


public class AudienceDec   {

//	@Override
//	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
//		System.out.println("The audience is clapping.");
//		
//	}

	public void takeSeats() throws Throwable {
		System.out.println("The audience is taking their seats.");
		
	}
	public void turnOffCellPhones() {
		System.out.println("The audience is turning off their cellphones");
	}
	public void applaud() {
		System.out.println("CLAP CLAP CLAP CLAP CLAP");
	}

	public void demandRefund() {
		System.out.println("Boo! We want our money back!");
	}

	public void watchPerformance(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("The audience is taking their seats. around");
			System.out.println("The audience is turning off their cellphones around");
			long start = System.currentTimeMillis();

			joinpoint.proceed();

			long end = System.currentTimeMillis();
			System.out.println("CLAP CLAP CLAP CLAP CLAP !!!");
			System.out.println("The performance duration is :" + (end - start) + " milliseconds");
		} catch (Throwable e) {
			System.out.println("Boo! We want our money back!!!");
		}
	}

	

}
