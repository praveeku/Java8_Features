package com.lambdaExpressions;

public class MultipleStatements_Lambda {

	public static void main(String[] args) {
		
		Sayable s= name->{
		
		String str1= "message";
		String str2=str1+name;
		return str2;
		};
		
		System.out.println(s.say("time is precious"));
		

	}

}
