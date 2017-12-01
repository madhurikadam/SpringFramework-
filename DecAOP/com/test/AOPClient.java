package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.madhuri.FooService;

public final class AOPClient {

    public static void main(final String[] args) throws Exception {
        BeanFactory ctx = new ClassPathXmlApplicationContext("application.xml");
        FooService foo = (FooService) ctx.getBean("fooService");
        foo.setFoo("Pengo", 12);
        System.out.println("Finished Foo");
    }
}