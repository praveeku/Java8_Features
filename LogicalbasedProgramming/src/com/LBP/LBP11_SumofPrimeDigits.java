package com.LBP;

import java.util.Scanner;

public class LBP11_SumofPrimeDigits {
	

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter input1: ");
		int n1=scanner.nextInt(),d,sum=0;
		System.out.println("enter input2: ");
		int n2=scanner.nextInt();
		
	
		for (int i=n1;n1<=n2;n1++)
			//System.out.println("method:"+prime(n1));
			sum=sum+prime2(n1);
		System.out.println("sum :"+sum);		
		
	}
	
static	int prime (int n) {
		if(n==2||n==3||n==5||n==7)		
		return n;
		else
			return 0;
		
	
	

}

static int prime2(int n) {
	int flag=0;
	for(int i=1;i<=n;i++) {
		if(n%i==0)
			flag++;}
	return flag==2?n:0;
	//return n;
	
}
}
