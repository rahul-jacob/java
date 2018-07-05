package com.xyz.java.ztest.lesson01;

enum Operation {
	ADD(1), CHANGED(2), DELETE(3);

	private int operation;

	Operation(int i) {
		operation = i;
	}

	public int getOperation() {
		return operation;
	}

	
}



public class substringDemo {

	public static void main(String[] args) {
		
		System.out.println(Operation.ADD.getOperation());
		System.out.println(Operation.DELETE.getOperation());
		
	}

}
