package com.lambdaExpressions;

public class SingleParameter_Lambda {

	public static void main(String[] args) {
		
		Sayable s=name ->  "hello : "+name;
		
		System.out.println(s.say("world"));
	}

}
