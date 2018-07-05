package com.xyz.java.consumer.lesson01;

import java.util.List;
import java.util.function.Consumer;

import com.xyz.java.lamda.utils.Java8Util;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integerList = Java8Util.getIntegerList();
		Consumer<Integer> consumerObj = (i) -> System.out.println("Value in List "+i);
		
		System.out.println("---- Printing all values ----");
		printIntegerList(integerList,consumerObj);
		
		System.out.println("---- Printing even values ----");
		
		printIntegerList(integerList,(val) -> {
			if(val%2==0){
				System.out.println(val);
			}
		});
		
		System.out.println("---- Printing odd values ----");
		printIntegerList(integerList, (n) ->{
			if(n%2!=0){
				System.out.println(n);
			}
		});

	}

	private static void printIntegerList(List<Integer> integerList,	Consumer<Integer> consumerObj) {
		integerList.forEach(val -> consumerObj.accept(val));
		
	}

}
