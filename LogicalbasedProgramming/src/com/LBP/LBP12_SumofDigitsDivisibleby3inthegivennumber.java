package com.LBP;

import java.util.Scanner;

/*LBP12

Sum of Digits  divisible by 3

Implement a program to calculate sum of digits that are divisible by 3 in the given number*/

public class LBP12_SumofDigitsDivisibleby3inthegivennumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter input which is divisible by 3 is : ");
		int n= scanner.nextInt();
		
		int d,sum=0;
		
		
		while(n!=0) {
			d=n%10;
			if(d%3==0)
				sum=sum+d;
			
			n=n/10;
		}
		
		System.out.println("divisible 3 value 12669 : "+sum);
		
	}

}
