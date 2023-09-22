package com.LBP;

import java.util.Scanner;

/*LBP13

Number of digits

Implement a program to calculate number of digits in the given number

input -------------> a number from the user
constraint --------> n>0
output ------------> print number of digits in the number*/

public class LBP13_Numberofdigitsinthegivennumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter input");
		String s=scanner.nextLine();
		System.out.println("lenghth is : "+s.length());
		
		int solution2=solution2(s);
		System.out.println("solution2 :"+solution2);
		
		
	}
	static int solution2(String s) {
		int n=Integer.parseInt(s);
		int count=0;
		while(n!=0) {
			
			n=n/10;
			count++;
			
		}
		return count;
		
	}

}
