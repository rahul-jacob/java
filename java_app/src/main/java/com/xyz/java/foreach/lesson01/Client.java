package com.xyz.java.foreach.lesson01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.xyz.java.lamda.pojo.Developer;
import com.xyz.java.lamda.utils.Java8Util;

public class Client {

	public static void main(String[] args) {
		List<Developer> developerList = Java8Util.getDevelopers();
		Map<String,Developer> devloperMap = new HashMap();
		//Iterating List using foreach
		developerList.forEach((devObj) -> {
			if(devObj.getLevel()==3)
				System.out.println(devObj);
			else
				devloperMap.put(devObj.getName(), devObj);
		});
		
		//Iterating Map using foreach
		devloperMap.forEach((x,y)-> {
			System.out.println("Key "+x);
			System.out.println("Value "+y);
		});
		

	}

}
