package com.practice.thread;

public class SimpleThread implements Runnable{
	Thread t;
	
	public SimpleThread() {
		// Create a new, second thread
		t = new Thread(this, "Demo Thread");
		System.out.println("Child Thread: " +t);
		t.start();
	}
	
	public void run() {
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " +i);
				Thread.sleep(500);
			}
		} catch (InterruptedException ie) {
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}
}
