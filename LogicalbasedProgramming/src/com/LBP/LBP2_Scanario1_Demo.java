/**
 * 
 */
package com.LBP;

import java.util.Scanner;

/**
 * @author prave
 *
 */

/*
 * LBP002 : Weird or Not Weird. 
 * Given an integer n,
 * perform the following conditional actions, 
 * 
 * If n is odd, print weird, 
 * If n is even and in the inclusive range of 2 to 5print not weird, 
 * If n is even and  in the inclusive range 6 to 20,print weird,
 * If n is even and greater than 20, print not weird.
 */

public class LBP2_Scanario1_Demo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter input");
		int input =scanner.nextInt();
		
		//If n is odd, print weird,
		if(input%2!=0)   //if  input value is odd because not equal to 0
			System.out.println("Weird");
		else {
			if(input>=2 &&  input <=5)  //If n is even and in the inclusive range of 2 to 5print not weird, 
				System.out.println("not weird");
			else if(input>=6 &&  input <=20)
				System.out.println("weird");
			else 
				System.out.println("not weird");
		}

	}

}
