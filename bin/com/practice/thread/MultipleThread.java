package com.practise.thread;

/**
 * Creating Multiple Threads
 * @author dbanerjee
 *
 */
public class MultipleThread implements Runnable {
	String name;
	Thread t;

	public MultipleThread(String threadName) {
		name = threadName;
		t = new Thread(this, name);
		System.out.println("New Thread: " +t);
		t.start();
	}

	@Override
	public void run() {
		try {
			for(int i=5; i>0; i--) {
				System.out.println(name + ": " +i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException ie) {
			System.out.println(name + " Interrupted");
		}
		System.out.println(name + " exiting");
	}
}
