package com.LBP;

import java.util.Scanner;

/*LBP78

Removing Duplicate Characters from a string

Given a string S, the task is to remove all the duplicates in the given string. 

input --------> a string from the user
con ----------> remove all duplicates
output -------> a string without duplicates*/

public class LBP78_RemoveAllDuplicates {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("enter string value :");
		String s = obj.nextLine().toLowerCase();
		System.out.println("enter big String");
		String s2 = obj.nextLine().toLowerCase();

		duplcateCharacter(s);
		
		System.out.println("duplicateCharacter method ==="+duplcateCharacter(s));
		duplicateWord(s2);

	}

	static String duplcateCharacter(String s) {
		String rs = "";
		//String duplicate="";
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (rs.indexOf(ch) < 0) {
				rs = rs + ch;
			}
			else
				System.out.println("Duplicate letter ## "+ch);
			
		}
	//	System.out.println("post remove duplicate Character ==="+rs);
//		System.out.println(duplicate);
		return rs;

	}

	static String duplicateWord(String s2) {
		int count=0;		
		String s[] = s2.split(" ");
		String rs = "";
		String duplicate = "";
		for (int i = 0; i < s.length; i++) {
			String s3 = s[i];
			if (rs.indexOf(s3) < 0) {
				
				rs = rs + s3+ " ";
			}
			else {
				count++;
				duplicate=duplicate+s3+" ";
			}
		}
		System.out.println("post remove Duplication word :" + rs);
		System.out.println("Duplicate word count:" + count);
		System.out.println("duplicate words :"+duplicate);
		return rs;

	}
}
