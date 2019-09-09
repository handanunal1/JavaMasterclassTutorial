package main.java.concurrency.sleepyBartender;

import java.util.concurrent.TimeUnit;

public class Bartender implements Runnable {

	@Override
	public void run() {
		System.out.println("Bartender my boss isnt int today");
		while (true) {
			if (Thread.interrupted()) {
				System.out.println(" bartender zz erm is is someone waiting?");
			}

			try {
				TimeUnit.SECONDS.sleep(5);

			} catch (InterruptedException e) {
			}
		}

	}

}
