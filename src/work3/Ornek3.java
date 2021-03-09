package work3;

public class Ornek3 {
	class C1{
		String s="abc";
		C1 obj1=(C1) new C2();
	}
	class C2 extends C1{
		C2 obj2=(C2) new C3();
		C2 obj3=(C2) new C1();
	
	}
	class C3 extends C2{
		C3 obj4=(C3)  obj2;
	}
	

	public static void main(String[] args) {
		
	}

}
