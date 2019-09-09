package main.java.concurrency.threadPs;

public class CreatingThreads {

	public static class Greeter implements Runnable {
		private String country;

		public Greeter(String country) {
		//	super(country + "thread");
			this.country = country;
		}

		public void run() {
			long id = Thread.currentThread().getId();
			System.out.println(id+"  Hello " + country + "!");
			
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			
		}
	}

	public static void main(String[] args) {
		String countries[] = { "Serbia", "Russia", "China", "Greece", "Ukraine" };
		for (String country : countries) {
			//System.out.println("Hello " + country);
			//new Greeter(country).run();
            Greeter greeter = new Greeter(country);
            new Thread(greeter,country + " thread").start();
		}

	}

}
