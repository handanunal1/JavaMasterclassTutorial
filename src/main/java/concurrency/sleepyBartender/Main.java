package main.java.concurrency.sleepyBartender;

import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {

		Bartender bartender = new Bartender();
		Thread bartenderThread = new Thread(bartender, "Bartender");
		bartenderThread.start();
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {

		}

	
		int numCustomers = 5;

		
		for(int i =0;i<=numCustomers;i++) {
			String customerName = "Customer "+ i;
			Customer customer = new Customer(bartenderThread,customerName,(int)(Math.random()*10));
			
			new Thread(customer,customerName).start();
			
		}
	}


}
