package com.LBP;

import java.time.LocalDate;
import java.util.Scanner;

public class LBP3_LeapYear {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the year dynamically");
		int year=scanner.nextInt();
		
		
		LocalDate currentdate=LocalDate.now();
		
		System.out.println("checking current year is leap  : "+currentdate.isLeapYear());
		
		LocalDate date=LocalDate.of(year, 2, 3);
		System.out.println("Leap year :"+date.isLeapYear());
		
		
		//Manually checking Leap year 
		boolean checkleap=leapyearManullyChecking(2004);
		System.out.println("checking leap :"+checkleap);
		
		
	

	}
	static boolean	leapyearManullyChecking(int year){
		
		if((year%4==0 && year%100!=0) || (year%400==0))
			return true;
			else
				return false;
			
	
		
		
		
		
	}

}
