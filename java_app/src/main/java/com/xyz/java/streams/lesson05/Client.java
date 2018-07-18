package com.xyz.java.streams.lesson05;

import java.util.List;

import com.xyz.java.lamda.pojo.Developer;
import com.xyz.java.lamda.pojo.Person;
import com.xyz.java.lamda.utils.Java8Util;

public class Client {

	public static void main(String[] args) {
		//System.out.println("--------------------  Stream operations  --------------------");
		List<Developer> developerList = Java8Util.getDevelopers();
		List<Person> playerList = Java8Util.getPersons();
		
		System.out.println("--------------------  Stream Iteration  --------------------");
		//Stream API helps you to substitute for, forEach and while loop. It allows you to concentrate on operation logic but
		//not on iteration over the sequence of elements.
		//Traditional way
		boolean isExist = false;
		for(Person p : playerList){
			if(p.getGender().equals("F")){
				isExist = true;
			}
		}
		System.out.println("is there any female player in the team "+isExist);
		
		//Using stream api
		boolean flag = playerList.stream().allMatch(p -> p.getGender().equals("F"));
		System.out.println("Using stream API is there any female player in the team "+flag);
		
		//Finding Match Any
		System.out.println("--------------------  1. Stream Iteration anyMatch --------------------");
		List<Developer> devList = Java8Util.getDevelopersInfo();
		boolean matchAny = devList.stream().anyMatch(developer -> developer.getTechnology().equalsIgnoreCase("java"));
		System.out.println("Is Java present in any technology "+matchAny);
		
		System.out.println("--------------------  2. Stream Iteration matchAll --------------------");
		boolean matchAll = devList.stream().allMatch(p->p.getLevel() > -1);
		System.out.println("All the members in the team are experienced  "+matchAll);
		
		System.out.println("--------------------  3. Stream Iteration noneMatch1 --------------------");
		boolean javaDev = devList.stream().noneMatch(d->d.getTechnology().equals("Java"));
		System.out.println("Do we have a java developer in out team "+javaDev);

		System.out.println("--------------------  4. Stream Iteration noneMatch2 --------------------");
		boolean hadoopDev = devList.stream().noneMatch(d->d.getTechnology().equals("Hadoop"));
		System.out.println("Do we have a Hadoop developer in out team "+hadoopDev);
	}
		
}
