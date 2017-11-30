package com.madhuri;

import java.util.Set;

public class SetGreeting implements Greeting {

	Set<String> greeting;
	public Set<String> getGreeting() {
		return greeting;
	}

	public void setGreeting(Set<String> greeting) {
		this.greeting = greeting;
	}

	public void greeting(){
		System.out.println(greeting.iterator().next() );
	}
	
}
