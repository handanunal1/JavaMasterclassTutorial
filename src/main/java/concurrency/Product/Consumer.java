package main.java.concurrency.Product;

public class Consumer implements Runnable {

	
	private Producer producer ;
	
	
	public Consumer(Producer producer) {
		super();
		this.producer = producer;
	}


	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
	
		
			 Produce produce = producer.getLatersProduce();
			 
			 if(produce != null) {
				 int produceInstance = produce.getInstance();
				 Produce.Color color = produce.getColor();
				 System.out.println("Last produce instance "+produceInstance);
				 System.out.println("Last produce color "+color.name());
				 
				 if(produceInstance == 10) {
					 break;
				 }
			 }
		}
		
	
	}

}
