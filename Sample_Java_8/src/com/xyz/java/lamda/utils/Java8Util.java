package com.xyz.java.lamda.utils;

import java.util.ArrayList;
import java.util.List;

import com.xyz.java.lamda.pojo.Developer;
import com.xyz.java.lamda.pojo.Person;



public final class Java8Util {
	
	public static List<Person> getPersons(){
		List<Person> personList = new ArrayList<Person>();
		Person p = new Person(1001,"Sachin","Tendulkar","M");
		Person p1 = new Person(1002,"","Kohli","M");
		Person p2 = new Person(1003,"M.S","Dhoni","M");
		Person p3 = new Person(1004,"Mithali","Raj","F");
		Person p4 = new Person(1005,"Rohit","Sharma","M");
		personList.add(p);
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		return personList;
	}
	
	
	public static List<Integer> getIntegerList(){
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(10);
		integerList.add(28);
		integerList.add(0);
		integerList.add(-4);
		integerList.add(199);
		return integerList;
	}
	
	public static List<Developer> getDevelopers(){
		List<Developer> devList = new ArrayList<Developer>();
		devList.add(new Developer("Lee","Python","53000",3));
		devList.add(new Developer("James","Ruby","33000",1));
		devList.add(new Developer("Susan","DevOps","53000",2));
		devList.add(new Developer("Sean","Java","93000",5));
		devList.add(new Developer("Charles","VB","23000",1));
		devList.add(new Developer("Tom","Java","23000",2));
		devList.add(new Developer("Mark","Python","13000",1));
		devList.add(new Developer("John","Ruby","3000",1));
		return devList;
	}

}