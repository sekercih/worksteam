package work8;

public class MyField {
	int x=1;
	int y;

	public void doStu(int x, int y) {
		x = x;
		y = this.y;
	}

	public void display() {
		System.out.println(x + " " + y + ":");
	}

	public static void main(String[] args) {
		MyField m1 = new MyField();
		m1.x = 100;
		m1.y = 200;
		MyField m2 = new MyField();
		m2.doStu(m1.x, m2.y);
		m1.display();
		m2.display();

	}

}
