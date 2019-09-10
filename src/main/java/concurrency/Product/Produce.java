package main.java.concurrency.Product;

public class Produce {
	enum Color{ Red,Blue,Green,Yellow};
	
	private int instance  = 0;
	private Color color;
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int getInstance() {
		return instance;
	}
	public void setInstance(int instance) {
		this.instance = instance;
	}
	

}
