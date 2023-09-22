package com.lambdaExpressions;

public class With_ReturnLambdaExpression {

	public static void main(String[] args) {
		
		Sayable s2 =name->{
		  
		  return "with return";};
		  
		  
		  Sayable s=(name)->"without return "+"for time pass ";
		  
		  
		  
		  System.out.println( s2.say("praveen")+" \n"+s.say("hello"));
		 	   
	}

	 
}
