package com.practice.thread;

public class MultipleThreadDemo {

	public static void main(String[] args) {
		//Creating multiple threads
		new MultipleThread("One");
		new MultipleThread("Two");
		new MultipleThread("Three");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException ie) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread exiting.");
	}
}
