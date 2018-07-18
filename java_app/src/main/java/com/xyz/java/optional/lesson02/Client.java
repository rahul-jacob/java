package com.xyz.java.optional.lesson02;

import java.util.Optional;

public class Client {

	public static void main(String[] args) {
//A) T	orElse(T other)
		String name = "Menon";
		Optional<String> optStr1 = Optional.ofNullable(name);
		if(optStr1.isPresent()){
			System.out.println("---1--- Name is not null "+name);
			name = optStr1.orElse("Andrew");
			System.out.println("---1--- Name is not null "+name);
		}else{
			System.out.println("---2--- Name is null "+name);
			name = optStr1.orElse("Andrew");
			System.out.println("---2--- Name is not null "+name);
		}
//So if the instance of Optional is empty then we can assign another value using orElse() method.
//Case 1		
		System.out.println("--------------------  Case1  --------------------");
		Optional<String> myOpt = Optional.empty();
		String value = myOpt.orElse("Kannan");
		myOpt = Optional.ofNullable(value);
		if(myOpt.isPresent()){
			System.out.println("---3--- Value is not null "+value);
			System.out.println("---3--- myOpt is not null "+myOpt);
		}
//Case 2
		System.out.println("--------------------  Case2  --------------------");
		String myvalue = null;
		Optional<String> myOpt1 = Optional.ofNullable(myvalue);
		myvalue = myOpt1.orElse("Sharon");
		myOpt1 = Optional.ofNullable(myvalue);
		if(myOpt.isPresent()){
			System.out.println("---4--- Value is not null "+myvalue);
			System.out.println("---4--- myOpt is not null "+myOpt1);
		}
		

	}

}
