package src.main.java;

public class Counter {

	private int count;
	
	public Counter() {
		this.reset();
	}
		
	public void reset() {
		count = 1;
	}
	
	public void increment() {
		count=count+2;
	}
	
	public void decrement() {
		count=count-2;
	}
	
	public int getCount() {
		return count;
	}
	
}
