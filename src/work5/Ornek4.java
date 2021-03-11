package work5;

public class Ornek4 {

	public static void main(String[] args) {
		System.out.println("Hello "+new StringBuilder("Java"));
		System.out.println(new MyString("java"));
		MyDoner myDoner=new MyDoner();
		System.out.println();
		System.out.println(myDoner.dana);
		
		//System.out.println(myDoner.dana);
		
		//System.out.println(new MyDoner(4545454));
		
		//MyDoner mydoner2=new MyDoner("kasap", 5);
		//System.out.println(mydoner2.num+" "+mydoner2.str);
		//MyDoner.dana=150;
		//System.out.println(MyDoner.dana);

	}

}
