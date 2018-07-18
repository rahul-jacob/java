package com.xyz.java.consumerthen.lesson01;

import java.util.List;
import java.util.function.Consumer;

import com.xyz.java.lamda.utils.Java8Util;

public class Client {

	public static void main(String[] args) {
		List<Integer> integerList = Java8Util.getIntegerList();
		System.out.println("Integer Values "+integerList);
		Consumer<Integer> consumerObj = (n) -> System.out.println(n);
		Consumer<Integer> consumerObj1 = consumerObj.andThen((n) -> System.out.println("(print "+n+" )"));
		
		System.out.println("---- Printing all values ----");
		printIntegerList(integerList,consumerObj1);

	}
	private static void printIntegerList(List<Integer> integerList,	Consumer<Integer> consumerObj) {
		integerList.forEach(val -> consumerObj.accept(val));
		
	}

}
