package com.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.madhuri.GreetingMessage;

@Configuration
public class ApplicationConfiguration {


@Bean(name = "gs1")
@Scope(value = "singleton")
public GreetingMessage getGreeting() {
	GreetingMessage gs = new GreetingMessage();
	gs.setMessage("Good Morning");
	return gs;
}

@Bean(name="gs2")
@Scope(value="singleton")
public GreetingMessage getGreet(){
	GreetingMessage gs1 = new GreetingMessage("hello");  
	return gs1;
}

}
