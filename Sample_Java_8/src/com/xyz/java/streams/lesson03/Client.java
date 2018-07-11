package com.xyz.java.streams.lesson03;

import java.util.List;

import com.xyz.java.lamda.pojo.Person;
import com.xyz.java.lamda.utils.Java8Util;

public class Client {

	public static void main(String[] args) {
/*
 Stream operation can be divided into two categories
 - Intermediate operations : returns a stream
 - Terminal operations : returns a result of a definite type
*/
		List<Person> studList = Java8Util.getDuplicateEntryPersons();
		System.out.println(studList);
		long distinctPersonCount = studList.stream().distinct().count();
		System.out.println("Distinct Person Count is "+distinctPersonCount);
		
		

	}

}
