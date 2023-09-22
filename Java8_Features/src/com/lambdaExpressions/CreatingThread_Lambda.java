package com.lambdaExpressions;

public class CreatingThread_Lambda {

	public static void main(String[] args) {
		
		Runnable r1=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("thread is running");
				
			}
		};
		
		
		Runnable r2= ()->System.out.println("Lambda thread running ");
		Thread t=new Thread(r1);
		//Thread t=new Thread(r2);
		t.start();
	}

}
