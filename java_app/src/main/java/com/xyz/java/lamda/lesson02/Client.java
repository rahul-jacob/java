package com.xyz.java.lamda.lesson02;

import java.util.Collections;
import java.util.List;

import com.xyz.java.lamda.pojo.Person;
import com.xyz.java.lamda.utils.Java8Util;

public class Client {

	public static void main(String[] args) {
		
		List<Person> personList = Java8Util.getPersons();
		
		System.out.println("printing personList using Lambda");
		printConditionally(personList,p -> true);
		System.out.println("--------------------------------");
		System.out.println("printing personList using Lambda for firstName Containing S");
		printConditionally(personList,p -> p.getFirstName().contains("S"));
		System.out.println("--------------------------------");
		System.out.println("sorting personList using Lambda for firstName");
		Collections.sort(personList, (Person p1,Person p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
		printConditionally(personList,p -> true);

	}

	private static void printConditionally(List<Person> personList,Condition<Person> conditionObj) {
		if(personList!=null && !personList.isEmpty()){
			for(Person pObj : personList){
				if(conditionObj.match(pObj)){
					System.out.println(pObj);
				}
			}
		}
		
		
	}

}
