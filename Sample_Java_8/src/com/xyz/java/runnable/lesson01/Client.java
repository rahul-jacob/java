package com.xyz.java.runnable.lesson01;

public class Client {

	public static void main(String[] args) {
		
		//AnonymousObj Function
		Thread threadObj = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("Running Object using anonymous block Rahul Jacob");
				
			}
			
		});
		threadObj.start();
		
		//Lambda Expression
		Thread threadObj1 = new Thread( () ->  System.out.println("Running Object using lambda expression Rahul Jacob"));
		threadObj1.start();

	}

}
