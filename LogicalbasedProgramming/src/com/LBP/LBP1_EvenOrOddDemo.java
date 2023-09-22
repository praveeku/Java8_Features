package com.LBP;

import java.util.Scanner;

public class LBP1_EvenOrOddDemo {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter input");
		int input=scanner.nextInt();
		
		if(input%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
		
		//By using Ternary operator
		
		System.out.println(input%2==0?"evennumber":"oddnumber");

	}

}
