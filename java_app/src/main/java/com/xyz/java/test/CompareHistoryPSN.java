package com.xyz.java.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;



public class CompareHistoryPSN {

	public static void main(String[] args) {
		String from = "7936,7960,7962,12304";
		String to = "7960,7962";
				
		List<String> fromValList = Arrays.asList(from.split("\\s*,\\s*"));
		List<String> toValList = Arrays.asList(to.split("\\s*,\\s*"));
		List<String> deletePsnList = new LinkedList<String>(fromValList);
		List<String> addPsnList = new LinkedList<String>(toValList);
		for(String fromVal : fromValList){
			for(String toVal : toValList){
				if(fromVal.equals(toVal)){
					addPsnList.remove(fromVal);
					deletePsnList.remove(toVal);
				}
			}
		}
		System.out.println("addPsnList"+addPsnList);
		System.out.println("------------------------------------");
		System.out.println("deletePsnList"+deletePsnList);

	}

}
