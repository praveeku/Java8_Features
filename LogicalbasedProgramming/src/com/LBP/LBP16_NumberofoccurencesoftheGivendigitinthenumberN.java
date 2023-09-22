package com.LBP;

import java.util.Scanner;


/*LBP16

Number of Occurrences

Program to find number of occurences of the given digit in the number n

input ------> two numbers n and d
constraints-> no constraints
output -----> number of occurrences

Example : 12134  --- 1*/


public class LBP16_NumberofoccurencesoftheGivendigitinthenumberN {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter digit");
		int n=scanner.nextInt();
		
		System.out.println("enter digit");
		int d=scanner.nextInt();
		int reminder,count=0;
		
		
		while(n!=0) {
			
			reminder=n%10;	
			
			if(reminder==d)
				count++;
			
			n=n/10;
				
			
		}
		
		System.out.println("entered digit "+d+"  is ocuurences  "+count +"   times");
		
		
	


	}

}
