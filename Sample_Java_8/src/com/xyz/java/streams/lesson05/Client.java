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
		
	}

}
