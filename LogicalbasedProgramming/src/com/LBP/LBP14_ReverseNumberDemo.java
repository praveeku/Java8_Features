package com.LBP;

import java.util.Scanner;

/*
Reverse Integer

Given an integer x, return x with its digits reversed. 

input---------> a number from user
constraint ---> n>=0
output -------> reverse of the given number

123 ===> 321*/
public class LBP14_ReverseNumberDemo {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter input");
		int input=scanner.nextInt(),reverse=0;
		
		
		while(input!=0) {
			
			int reminder=input%10;
			 reverse=(reverse*10)+reminder;
			
			input=input/10;
		}
		
		System.out.println("reverse number is:"+reverse);
	}

}
