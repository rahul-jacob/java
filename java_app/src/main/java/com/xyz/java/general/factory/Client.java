package com.xyz.java.general.factory;

public class Client {
	
	public void greetMsg(Greeting obj){
		obj.message();
	}
	// Here we passed the implemented object msgGreetingObj as argument.Here we are passing 
	// the object that has the behavior.
	// But instead of passing the object we need to pass the behaviour.
	public static void main(String[] args) {
		MessageGreeting msgGreetingObj = new MessageGreeting();
		new Client().greetMsg(msgGreetingObj);

	}

}
