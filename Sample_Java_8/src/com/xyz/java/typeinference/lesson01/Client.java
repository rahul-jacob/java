package com.xyz.java.typeinference.lesson01;

public class Client {

	public static void main(String[] args) {
		
		//Now because of Type Inference the compiler has more information when we bind the
		//lambda and interface it understands the signature clearly in such casewe can
		//remove the type of the input parameter in our lamdba expression
		
		//StringLengthLambda myLambdaObj = (String s) -> s.length();
		
		//Also if the input parameter has only one parameter then the parenthesis can be
		//removed
		
		//StringLengthLambda myLambdaObj = (s) -> s.length();
		
		StringLengthLambda myLambdaObj = s -> s.length();
		System.out.println(myLambdaObj.getLength("Hello World"));
	}

}
