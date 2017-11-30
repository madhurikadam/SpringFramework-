package com.test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.madhuri.Greeting;


public class Test {

	public static void main(String[] args){
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("GreetingSpring/applicationxml.xml"));
		Greeting g1=(Greeting)factory.getBean("id1");
		g1.greeting();
	//	Greeting prototype=(Greeting)factory.getBean("id1");
//		prototype.greeting();
	//Greeting g2= (Greeting)factory.getBean("madhuri");
		//g2.greeting();
//		Greeting g3=(Greeting) factory.getBean("ArrayGreet");
//		g3.greeting();
//		Greeting g5=(Greeting) factory.getBean("ArrayGreetSet");
//		g5.greeting();
//		
	}
	
	
}
