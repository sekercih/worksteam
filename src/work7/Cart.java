package work7;

public class Cart {
Product p;
double totalAmount;
}
class Product{
	String name;
	Double price;


	public static void main(String[] args) {
		Cart c=new Cart();
		System.out.println(c.p+":"+c.totalAmount);
	}
}
