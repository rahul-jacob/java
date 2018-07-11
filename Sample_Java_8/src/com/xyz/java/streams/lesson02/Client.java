package com.xyz.java.streams.lesson02;

import java.util.List;
import java.util.function.Consumer;

import com.xyz.java.lamda.pojo.Student;
import com.xyz.java.lamda.utils.Java8Util;

public class Client {

	public static void main(String[] args) {
// Parallel Stream Creation
		//Streams are sequential i.e you will get the o/p in a sequential manner but parallel streams are not sequential
		System.out.println("--------------------  Stream output in sequential manner  --------------------");
		List<Student> studentList = Java8Util.getStudents();
		Consumer<Student> displayData = (s) -> System.out.println(s.getName());
		studentList.stream().forEach(displayData);
		System.out.println("--------------------  Parallel Stream output not in sequential manner order is shuffled  --------------------");
		studentList.parallelStream().forEach(displayData);
		

	}

}
