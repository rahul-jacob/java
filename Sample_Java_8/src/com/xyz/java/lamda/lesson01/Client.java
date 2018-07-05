package com.xyz.java.lamda.lesson01;

import com.xyz.java.general.factory.Greeting;

public class Client {

	public static void main(String[] args) {
		
		//AnonymousObj Function
		LambdaMain anonymousObj = new LambdaMain() {
			
			@Override
			public void perform() {
				System.out.println("            Today i wrote my first lambda from AnonymousObj");
				
			}
		};
		System.out.println("Output from AnonymousObj");
		anonymousObj.perform();
		
		//Lambda Expression
		LambdaMain lambdaObj = () -> System.out.println("           Today i wrote my first lambda");
		System.out.println(" Output from Lambda Expression from lambdaObj");
		lambdaObj.perform();
		
		
		//So when writing a lambda expression the Interface name and method name is
		//irrelavent. All that matters in the number of input arguments and the return
		//value. So we have defined a Greeting i/f earlier with the same method signatures
		//lets try reusing it in the above example
		System.out.println("Output from greetObj reusing same method signature");
		Greeting greetObj = () -> System.out.println("           Today i wrote my first lambda using Greeting Interface");
		greetObj.message();
		
		

	}

}
