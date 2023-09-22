package com.LBP;

import java.util.Scanner;

public class SumofdigitsBetweenTwoNumbers {

	public static void main(String[] args) {
		int sum = 0;
		int Destinationnumber = 22;
		int previousnumber = 19;

		for (int i = previousnumber; i <= Destinationnumber; i++)
			sum = sum + sumofIntegersLogic(i);

		System.out.println("sum of digits " + sum);

	}

	private static int sumofIntegersLogic(int input) {
		int sum = 0;

		while (input != 0) {
			int reminder = input % 10;
			sum = sum + reminder;
			input = input / 10;

		}

		return sum;

	}

}
