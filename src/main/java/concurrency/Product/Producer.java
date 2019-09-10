package main.java.concurrency.Product;

public class Producer implements Runnable {

	private Produce latersProduce = null;

	public Produce getLatersProduce() {
		return latersProduce;
	}

	public void setLatersProduce(Produce latersProduce) {
		this.latersProduce = latersProduce;
	}

	@Override
	public void run() {
		System.out.println("Producer starting");

		Produce produce = new Produce();
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}

			produce.setInstance(i);
			produce.setColor(Produce.Color.values()[i % Produce.Color.values().length]);
			latersProduce = produce;

		}
		System.out.println("Producer terminating");
	}

}
