package com.xyz.java.streams.lesson03;

import java.util.List;
import java.util.stream.Stream;

import com.xyz.java.lamda.pojo.Person;
import com.xyz.java.lamda.utils.Java8Util;

public class Client {

	public static void main(String[] args) {
/*
 Stream operation can be divided into two categories
 - Intermediate operations : returns a stream
 - Terminal operations : returns a result of a definite type
*/
		List<String> strList = Java8Util.getListOfStrings();
		System.out.println("Total Items in List "+strList.size());
		long distinctStrList = strList.stream().distinct().count();
		System.out.println("Distinct Person Count is "+distinctStrList);
		
		//Since the distinct() method returns a stream we can chain the operations
		System.out.println("--------------------  Chaining operations  --------------------");
		long ctr = strList.stream().distinct().count();
		System.out.println("Output of chaned operation "+ctr);
		
		System.out.println("--------------------  Reusing stream  --------------------");
		Stream<String> streamObj = strList.stream();
		System.out.println("Displaying the count using terminal operation "+streamObj.count());
		System.out.println("Reusing the stream raises an exception");
		try{
			System.out.println(streamObj.distinct().count());
		}catch(Exception e){
			System.out.println(e.toString());
		}
		
		
		

	}

}
