package work15;

public class Example03 {
	public static void doSum(Integer x,Integer y) {
		System.out.println("Integer sum "+(x+y));
	}
	public static void doSum(double x,double y) {
		System.out.println("double sum "+(x+y));
		
	}public static void doSum(float x,float y) {
		System.out.println("float sum "+(x+y));
	}public static void main(String[] args) {
		doSum(10, 20);
		doSum(10.0, 20.0);
		//byte short int long float double
	}

}
