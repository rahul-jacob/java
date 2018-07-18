package com.xyz.java.predicate.lesson02;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.xyz.java.lamda.pojo.Person;
import com.xyz.java.lamda.utils.Java8Util;

public class Client {

	public static void main(String[] args) {
		List<Person> personList = Java8Util.getPersons();
		Predicate<Person> personPredicate = ((n) -> n.getGender().equals("F"));
		Consumer<Person> personConsumer = ((n) -> {
			if(personPredicate.test(n)){
				System.out.println(n);
			}
		}
				);
		printVal(personList,personPredicate);
		
		printVal(personList,personConsumer);

	}

	private static void printVal(List<Person> personList,
			Consumer<Person> personConsumer) {
			personList.forEach(personConsumer);
		
	}

	private static void printVal(List<Person> personList,
			Predicate<Person> personPredicate) {
			personList.forEach((n)-> {
				if(personPredicate.test(n)){
					System.out.println(n);
				}
			});
		
	}

	

}
