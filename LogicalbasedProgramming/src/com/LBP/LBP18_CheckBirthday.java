package com.LBP;

import java.util.Scanner;

/*LBP18
Check Birth Day

Lisa always forgets her birthday which is on th 5th July. 
So develop a function/method which will be helpful to remember her birthday.

The function/method checkBirthday return an integer 1, if it is her birthday else return 0.
the function/method checkBirthday accepts two arguments.
Month, a string representing the month of her birth and
day, an integer representing the data of her birthday.

input -----------> month & day 
constraints -----> no
output ----------> 1 or 0*/

public class LBP18_CheckBirthday {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter month s string value :");
		String month=scanner.nextLine();
		System.out.println("enter day in int ");
		int day=scanner.nextInt();
		
		
		
		System.out.println(month.equalsIgnoreCase("july")&& day==5 ? 1: 0);
		
		
		
		
	}

}
