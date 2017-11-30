package com.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.conf.ApplicationConfiguration;
import com.madhuri.GreetingMessage;

public class HelloClien {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

		GreetingMessage gs1 = (GreetingMessage) context.getBean("gs1");
		GreetingMessage gs2 = (GreetingMessage) context.getBean("gs2");

		gs1.greetingMessage();
		gs2.greetingMessage();
	}
}