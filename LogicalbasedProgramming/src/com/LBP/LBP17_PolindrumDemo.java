package com.LBP;

/*Paliandrome Number

Program to check whether the given number is paliandrome or not

input -----> a number from the user
constraint-> n>0
output ----> Yes or No


123 ----> 321  ====> No
121 ----> 121  ====> Yes*/


import java.util.Scanner;

public class LBP17_PolindrumDemo {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter int value :");
		int n = obj.nextInt();	
		
		String s=String.valueOf(n);
	
		
		System.out.println("polindrum test :"+polindrumValidation(n));
		System.out.println("polindrum test 2 :"+solution2(s));

	}



	private static String polindrumValidation(int n) {
		int rev=0,reminder;
		int temp=n;
		while(n!=0) {
			
			reminder=n%10;
			rev=rev*10+reminder;
			n=n/10;
		}
		
	return temp==rev?"polindrum":"not polindrum";
	}
	
	private static String solution2(String n) {
		
		StringBuffer sb=new StringBuffer(n);
		sb.reverse();
		String temp=new String(sb);
		
		return temp.equals(n)?"plindrum":"Not";
		
		

	}
	

}
