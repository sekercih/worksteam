package work_10;

public class Ornek08 {
	String name;
	int age;

	public static void main(String[] args) {
		Ornek08 s1 = new Ornek08();
		Ornek08 s2 = new Ornek08();
		Ornek08 s3 = new Ornek08();
		s1 = s3;
		s3 = s2;
		//s2 = null;
		s1 = s2;

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
