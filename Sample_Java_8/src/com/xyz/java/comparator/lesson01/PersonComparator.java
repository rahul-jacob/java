package com.xyz.java.comparator.lesson01;

import java.util.Comparator;

import com.xyz.java.lamda.pojo.Person;


public class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person p0, Person p1) {
		return p0.getLastName().compareTo(p1.getLastName());
	}

}
