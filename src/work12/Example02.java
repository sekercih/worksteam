package work12;

public class Example02 {

	protected void display(int x) {
		System.out.println("parent"+x); 
	}
	

class S2 extends Example02{
	public void display(int x ,int y) {
		this.display(x);
		display(y);
		super.display(y);
		
	}
	public void display(int x) {
		System.out.println("Child"+x);
	}
}}