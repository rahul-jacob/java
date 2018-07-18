package com.xyz.java.streams.lesson01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.xyz.java.lamda.pojo.Developer;
import com.xyz.java.lamda.pojo.Person;
import com.xyz.java.lamda.utils.Java8Util;

public class Client {

	public static void main(String[] args) {
//Stream Creation
		System.out.println("--------------------  Different sources of Stream Generation  --------------------");
// A) Using arrays (Arrays.stream)
		System.out.println("--------------------  1 Arrays.stream()  --------------------");
		String[] strArr = new String[5];
		strArr[0] = "Bob";
		strArr[1] = "Ken";
		strArr[2] = "John";
		strArr[3] = "William";
		strArr[4] = "Susan";
		
		Stream<String> arrayStream = Arrays.stream(strArr); 
		arrayStream.forEach(System.out::println);
		
// B) Stream creation using Static.of() method
		System.out.println("--------------------  2 Stream.of()  --------------------");
		Stream<String> stream = Stream.of("Anju","Alex","Bobby","Sam","Sandy");
		stream.forEach(System.out::println);
		
// C) Stream creation using List
		System.out.println("--------------------  3 List.stream()  --------------------");
		List<Developer> developerList = Java8Util.getDevelopers();
		Stream<Developer> devStream = developerList.stream();
		devStream.forEach(e -> System.out.println(e.getName()));
		
// D) Parallel Stream
		System.out.println("--------------------  4 List.parallelStream()  --------------------");
		List<Person> personList = Java8Util.getPersons();
		Stream<Person> personStream = personList.parallelStream();
		personStream.forEach(p -> System.out.println(p.getLastName()));
		
	}

}
