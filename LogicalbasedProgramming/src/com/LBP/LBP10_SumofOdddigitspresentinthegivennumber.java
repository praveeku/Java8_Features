package com.LBP;

import java.util.Scanner;

public class LBP10_SumofOdddigitspresentinthegivennumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter input ");
		int n=scanner.nextInt(),sum=0,d,sumofeven=0;
		
		
	
	
		
		
		while(n!=0) {
			
			d=n%10;
			if(d%2!=0)
				sum=sum+d;
			else
				sumofeven=sumofeven+d;
			n=n/10;
			
		}
		System.out.println("sum of odd digits :"+sum+"     sum of even numbers:  "+sumofeven);
	}

}
