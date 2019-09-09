package main.java.concurrency.sleepyBartender;

import java.util.concurrent.TimeUnit;

public class Customer implements Runnable {

    private Thread bartenderThread;
    private String name;
    private int waitTime;
  
	
	
	public Customer(Thread bartenderThread, String name, int waitTime) {
		super();
		this.bartenderThread = bartenderThread;
		this.name = name;
		this.waitTime = waitTime;
	}



	public void run() {
		System.out.println(name + ": Doesnt seem to be anywone");
		
		try {
			TimeUnit.SECONDS.sleep(waitTime);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println(name +"oh there is a bell" );
		bartenderThread.interrupt();
	}
}
