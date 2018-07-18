package com.xyz.java.optional.lesson05;

import java.util.Optional;

public class Client {

	public static void main(String[] args) {
//A) Optional.filter		
/*If a value is present, and the value matches the given predicate, return an Optional describing the value, otherwise return 
  an empty Optional.*/
		Optional<String> nonEmptyOptional = Optional.of("male");
		Optional<String> emptyOptional = Optional.<String>empty();
		
		System.out.println("1 Filter of NonEmptyOptional "+nonEmptyOptional.filter(val -> val.equals("male")));
		System.out.println("2 Filter of EmptyOptional "+emptyOptional.filter(val -> val.equals("male")));

	}

}
