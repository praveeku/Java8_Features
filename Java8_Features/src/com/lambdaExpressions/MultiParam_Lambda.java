package com.lambdaExpressions;

public class MultiParam_Lambda {

	public static void main(String[] args) {
		
		Addable addable= (a,b)->a+b;
		
		System.out.println(addable.add(20,10));

	}

}
