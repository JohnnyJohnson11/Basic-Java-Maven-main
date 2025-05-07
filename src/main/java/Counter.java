package src.main.java;

public class Counter {

	private int count;
	
	public Counter() {
		this.reset();
	}
		
	public void reset() {
		//Test Fail
		count = 1;
		//count=0;
	}
	
	public void increment() {
		//Test Fail
		count=count+2;
		//count++;
	}
	
	public void decrement() {
		//Test Fail
		count=count-2;
		//count--;
	}
	
	public int getCount() {
		return count;
	}
	
}
