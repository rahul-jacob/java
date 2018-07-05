package com.xyz.java.comparator.lesson01;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xyz.java.lamda.pojo.Person;
import com.xyz.java.lamda.utils.Java8Util;


public class Client {
	
	
	public static void main(String args[]){
		List<Person> personList = Java8Util.getPersons();
		if(personList!=null && !personList.isEmpty()){
			//Sorting Based on Last Name
			System.out.println("Sorting based on last name using PersonComparator class");
			Collections.sort(personList,new PersonComparator());
			personList.forEach(s->System.out.println(s));
			System.out.println("--------------------------------");
			//Sorting using first name using anonymous block
			System.out.println("Sorting using first name using anonymous block");
			Collections.sort(personList,new Comparator<Person>() {

				@Override
				public int compare(Person p0, Person p1) {
					return p0.getFirstName().compareTo(p1.getFirstName());
				}
				
			});
			personList.forEach(s -> System.out.println(s));
			System.out.println("--------------------------------");
			System.out.println("Sorting using last name using lambda expression");
			Collections.sort(personList,(Person p1,Person p2) -> p1.getLastName().compareTo(p2.getLastName()));
			personList.forEach(s -> System.out.println(s));
		}
	}	
	
}
