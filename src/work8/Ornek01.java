package work8;

public class Ornek01 {

	public static void main(String[] args) {
		int ans = 0;
		try {
			int num=10;
			int div =0;
			 ans=num/div;
		} catch (ArithmeticException e) {
			ans=0;
			System.out.println(ans);
		}catch (Exception e) {
			System.out.println("Invalid calcalution");
		}
		System.out.println("Answer = "+ans);
	}

}
