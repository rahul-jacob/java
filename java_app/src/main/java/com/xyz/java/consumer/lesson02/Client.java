package com.xyz.java.consumer.lesson02;

import java.util.List;
import java.util.function.Consumer;

import com.xyz.java.lamda.pojo.Person;
import com.xyz.java.lamda.utils.Java8Util;

public class Client {

	public static void main(String[] args) {
		
		List<Person> persons = Java8Util.getPersons();
		
		System.out.println("1");
		Consumer<Person> conObj1 = (n) -> System.out.println(n);
		
		printPerson(persons,conObj1);
		
		System.out.println("2");
		Consumer<Person> conObj2 = (n -> {
			if(n.getGender().equals("F")){
				System.out.println(n);
			}
		});
		
		printPerson(persons,conObj2);
		

	}

	private static void printPerson(List<Person> persons, Consumer<Person> conObj1) {
		persons.forEach((n -> conObj1.accept(n)));
	}
	

}
