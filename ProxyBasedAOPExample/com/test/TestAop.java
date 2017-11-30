package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.madhuri.PerformanceException;
import com.madhuri.Performer;
import com.madhuri.conf.ApplicationConf;

public class TestAop {

	//private ApplicationContext context;

	public static void main(String[] args) throws PerformanceException{
		ApplicationContext	context = new AnnotationConfigApplicationContext(ApplicationConf.class);

	//	ApplicationContext	context = new ClassPathXmlApplicationContext("applicationConf.xml");
		Performer pr = (Performer) context.getBean("proxy");
		pr.perform();
		pr.ThankYou();
	}
}
