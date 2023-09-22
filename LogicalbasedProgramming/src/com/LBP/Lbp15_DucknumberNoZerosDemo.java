package com.LBP;

import java.util.Scanner;

/*Program to read a number and check whether it is duck number or not.
Hint: A duck number is a number which has zeros present in it, 
but no zero present in the begining of the number.
123	     No
1023	Yes
1203	Yes
1230	Yes
*/
public class Lbp15_DucknumberNoZerosDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter input:");

		int n = scanner.nextInt();
		
		String checkduck=solution1(n);
		
		System.out.println(" is this ducknumber : "+checkduck );
		
		
		/*
		 * String str = scanner.next();
		 * 
		 * System.out.println(str.contains("0")?"duck":"notduck");
		 */
	}
	
	
	static String solution1(int n) {
		int flag = 0;

		while (n != 0) {
			int d = n % 10;
			if (d == 0) {
				flag = 1;
				break;
			}
			n = n / 10;
		}
		return flag == 1 ? "duck number" : "notduck number";

	}
	
	
	
	

}
