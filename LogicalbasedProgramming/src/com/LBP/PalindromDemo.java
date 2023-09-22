package com.LBP;

import java.util.Scanner;

public class PalindromDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter input");
		int n = scanner.nextInt(), flag = 0;

		for (int i = 1; i <= n; i++)

			if (n % i == 0)
				flag++;

	//	System.out.println(flag == 2 ? "prime" : "non prime");
		System.out.println(flag == 2);
	}

}
