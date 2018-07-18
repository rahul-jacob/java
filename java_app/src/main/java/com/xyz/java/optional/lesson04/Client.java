package com.xyz.java.optional.lesson04;

import java.util.Optional;

public class Client {
	
	public static void main(String args[]){
// A) Optional.map and flatMap
		Optional<String> nonEmptyGender = Optional.of("Male");
		Optional<String> emptyGender = Optional.empty();
		
		System.out.println("1 Non-Empty Optional "+nonEmptyGender.map(String::toUpperCase));
		System.out.println("2 Empty Optional "+emptyGender.map(String::toUpperCase));
		
		Optional<Optional<String>> nonEmptyOptionalGender = Optional.of(Optional.of("male"));
		System.out.println("3 Optional value "+nonEmptyOptionalGender);
		System.out.println("4 Optional.map() "+nonEmptyOptionalGender.map(gender -> gender.map(String::toUpperCase)));
		System.out.println("5 Optional.flatMap"+nonEmptyOptionalGender.flatMap(gender -> gender.map(String :: toUpperCase)));
		
		
		
	}
}
