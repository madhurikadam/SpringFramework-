package com.madhuri;

public class GreetingMessage implements GreetInterface {

	public GreetingMessage(String message) {
		super();
		this.message = message;
	}

	 public GreetingMessage(){
		 
	 }
	String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void greetingMessage(){
		
		System.out.println(message);
	}
	
}
