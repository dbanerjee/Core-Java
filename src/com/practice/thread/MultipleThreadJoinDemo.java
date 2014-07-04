package com.practice.thread;

public class MultipleThreadJoinDemo {

	public static void main(String[] args) {
		//Creating multiple threads
		MultipleThread mt1 = new MultipleThread("One");
		MultipleThread mt2 = new MultipleThread("Two");
		MultipleThread mt3 = new MultipleThread("Three");
		
		//wait for threads to finish
		try {
			mt1.t.join();
			mt2.t.join();
			mt3.t.join();
		} catch (InterruptedException ie) {
			System.out.println("Main thread interrupted");
		}
	}
}
