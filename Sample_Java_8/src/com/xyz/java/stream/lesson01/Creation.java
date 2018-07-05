package com.xyz.java.stream.lesson01;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xyz.java.lamda.pojo.Person;
import com.xyz.java.lamda.utils.Java8Util;

public class Creation {

	public static void main(String[] args) {
		System.out.println("-------------------- Start ------------------");
		// Conversion of Array to Stream
		// Method 1 using Stream.of()
		String[] alphabets = new String[] { "A", "B", "C", "D" };
		Stream<String> alphabetStream = Stream.of(alphabets);
		alphabetStream.forEach(System.out::println);

		System.out.println("-------------------- 1 ------------------");

		// Method 2 using Arrays.stream()
		String[] numbers = new String[] { "1", "2", "3", "4" };
		Stream<String> numberStream = Arrays.stream(numbers);
		numberStream.forEach(System.out::println);

		System.out.println("-------------------- 2 ------------------");
		// Conversion of List to Stream
		List<Person> persons = Java8Util.getPersons();
		Stream<Person> personStream = persons.stream();
		personStream.forEach(System.out::println);

		System.out.println("-------------------- 3 ------------------");
		// Creating infinite streams
		Stream<Integer> infiniteNumberStream = Stream.iterate(40, i -> i + 2);
		List<Integer> inFiniteIntegerList = infiniteNumberStream.skip(5)
				.limit(5).collect(Collectors.toList());
		inFiniteIntegerList.forEach(System.out::println);

	}

	

}
