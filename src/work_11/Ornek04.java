package work_11;

public class Ornek04 {
public static String mask(String credicart) {
	String x="XXXX-XXXX-XXXX-";
	return x;
}
	public static void main(String[] args) {
		
		StringBuilder str=new StringBuilder("bala");
		
		//str.append(str, 4, 7);
		str.append(str, 0, 3); //al -balaal
		System.out.println(str);

	}

}
