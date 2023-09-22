package com.methodReference;

public class MrthodReference_Thread {
	
	public static void threadMethod() {
		System.out.println("thread is running using method reference");
	}

	public static void main(String[] args) {
		
	Thread thread=new Thread(MrthodReference_Thread::threadMethod);
	thread.start();
		

	}

}
