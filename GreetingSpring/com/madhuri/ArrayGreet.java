package com.madhuri;

public class ArrayGreet implements  Greeting {

	public String[] getGreeting() {
		return greeting;
	}

	public void setGreeting(String[] greeting) {
		this.greeting = greeting;
	}

	public ArrayGreet(String[] greeting) {
		super();
		this.greeting = greeting;
	}

	public ArrayGreet(){
		
	}
	String [] greeting;
	
	public void greeting(){
		System.out.println(greeting[0] );
		System.out.println(greeting[1]);
	}
}
