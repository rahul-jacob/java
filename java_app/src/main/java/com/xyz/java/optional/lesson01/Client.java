package com.xyz.java.optional.lesson01;

import java.util.Optional;

public class Client {

	public static void main(String[] args) {
//A) static <T> Optional<T>	of(T value)		
		String name ="John";
		Optional<String> nameStr = Optional.of(name);
		//boolean	isPresent()
		if(nameStr.isPresent()){
			System.out.println("---1--- Name is not null");
		}else{
			System.out.println("---2--- Name is null");
		}
		
		//Optional.of if null returns a Null Pointer Exception
		String name1 =null;
		try{
			Optional<String> nameStr1 = Optional.of(name1);
			if(nameStr1.isPresent()){
				System.out.println("---3--- Name is not null");
			}else{
				System.out.println("---4--- Name is null");
			}
		}catch(Exception e){
			System.out.println("---5--- Name is null Optional.of() if null thows a null pointer exception");
			System.out.println(e.toString());
		}
//B) static <T> Optional<T>	ofNullable(T value)		
		//Assigning name2 to Cherry
		String name2 = "Cherry";
		Optional<String> nameStr2 = Optional.ofNullable(name2);
		if(nameStr2.isPresent()){
			System.out.println("---6--- Optional Value "+nameStr2);
			System.out.println("---6--- Name is not null "+name2);
		}else{
			System.out.println("---7--- Name is null");
		}
		
		//Assigning name3 to null
		//The Optional.ofNullable's parameter if null then it creates an object of Optional.empty() thus prevents a NullPointerException 
		String name3 = null;
		try{
			Optional<String> nameStr3 = Optional.ofNullable(name3);
			if(nameStr3.isPresent()){
				System.out.println("---8--- Optional Value "+nameStr3);
				System.out.println("---8--- Name is not null "+name3);
			}else{
				System.out.println("---9--- Optional Value "+nameStr3);
				System.out.println("---9--- Name is null");
			}
		}catch(Exception e){
			System.out.println("---10--- Name is null Optional.of() if null thows a null pointer exception");
			System.out.println(e.toString());
		}
/*
 	Optional.isPresent() returns true if the given Optional object is non-empty. Otherwise it returns false.
 	Optional.ifPresent() performs given action if the given Optional object is non-empty. Otherwise it returns false.
 */
//C)  Optional.ifPresent()
		Optional<String> nonEmptyOptional = Optional.of("male");
		Optional<String> emptyOptional = Optional.empty();
		
		nonEmptyOptional.ifPresent((optVal) -> System.out.println("11 ifPresent accepts a consumer Value is "+optVal));
		
		emptyOptional.ifPresent((optVal) -> System.out.println("12 ifPresent accepts a consumer Value is "+optVal));
	}
	
	

}
