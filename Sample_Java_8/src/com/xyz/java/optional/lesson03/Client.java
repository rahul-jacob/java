package com.xyz.java.optional.lesson03;

import java.util.Optional;

public class Client {

	public static void main(String[] args) {

// A) T	get()	the non-null value held by this Optional	
		String name = "Sachin";
		Optional<String> optStr1 = Optional.ofNullable(name);
		if(optStr1.isPresent()){
			System.out.println("---1--- Optional is not null "+optStr1);
			System.out.println("---1--- Name is not null "+optStr1.get());
		}else{
			System.out.println("---2--- Optional is null "+optStr1);
			name = optStr1.orElse("Andrew");
			System.out.println("---2--- Name is null "+optStr1.get());
		}
//Case 1 get() didn't thow NoSuchElementException 
		System.out.println("--------------------  Case1  --------------------");
		String name1 = "";
		Optional<String> optStr2 = Optional.ofNullable(name1);
		if(optStr2.isPresent()){
			System.out.println("---3--- Optional is not null "+optStr2);
			System.out.println("---3--- Name is not null "+optStr2.get());
		}else{
			System.out.println("---4--- Optional is null "+optStr2);
			name1 = optStr2.orElse("Andrew");
			System.out.println("---4--- Name is not null "+optStr2.get());
		}
//Case 2 get() will thow NoSuchElementException 
		Optional<String> optStr3 = Optional.empty();
		try{
			System.out.println("--------------------  Case2  --------------------");
			if(optStr3.isPresent()){
				System.out.println("---4--- Optional is not empty "+optStr3);
				System.out.println("---4--- Name is not empty "+optStr3.get());
			}else{
				System.out.println("---5--- Optional is empty "+optStr3);
				System.out.println("---5--- Name is not empty "+optStr3.get());
			}
		}catch(Exception e){
			System.out.println("---6--- Optional is empty "+optStr3);
			System.out.println("---6--- Exception occured when calling  optStr3.get()");
			System.out.println(e.toString());
		}
		
		
	}
}
