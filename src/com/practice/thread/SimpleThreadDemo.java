package com.practice.thread;

public class SimpleThreadDemo {

	public static void main(String[] args) {
		//creating a new thread
		new SimpleThread();
		
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println("Main  Thread: " +i);
				Thread.sleep(1000);
			}
			
		} catch (InterruptedException ie) {
			System.out.println("Main method interrupted");
		}
		System.out.println("Exiting Main method");

	}

}
