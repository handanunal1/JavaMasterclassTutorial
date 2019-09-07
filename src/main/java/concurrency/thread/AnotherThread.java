package main.java.concurrency.thread;

import static main.java.concurrency.thread.ThreadColor.ANSI_GREEN;

/**
 * Created by Handan Unal
 */
public class AnotherThread extends Thread {

	@Override
	public void run() {
		System.out.println(ANSI_GREEN + "Hello from " + currentThread().getName());

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			System.out.println(ANSI_GREEN + "Another thread woke me up");
			return; // Terminate
		}

		System.out.println(ANSI_GREEN + "Four seconds have passed and I'm awake");
	}
}
