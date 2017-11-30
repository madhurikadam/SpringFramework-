package com.madhuri;

public class GreetingImpl implements Greeting {
	
	private String greeting;
	public GreetingMessages getGreetMessage() {
		return greetMessage;
	}
	public void setGreetMessage(GreetingMessages greetMessage) {
		this.greetMessage = greetMessage;
	}

	private GreetingMessages greetMessage;

	GreetingImpl(){
		
	}
	public void init(){
		System.out.println(greeting);
		greeting="changes in init";
		System.out.println("Calling the init method");
	}
	GreetingImpl(String greeting){
		this.greeting=greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
   
	public void greeting(){
		System.out.println("hello"+greeting+ greetMessage);
	}
}
