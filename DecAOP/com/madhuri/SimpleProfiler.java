package com.madhuri;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class SimpleProfiler {

    public Object profile(ProceedingJoinPoint call, String name, int age) throws Throwable {
    	System.out.println("Welcome to Foo");
    	 StopWatch clock = new StopWatch("Profiling for '" + name + "' and '" + age + "'");
         try {
             clock.start(call.toShortString());
             return call.proceed();
         } finally {
             clock.stop();
             System.out.println(clock.prettyPrint());
         }
     }    
    }

