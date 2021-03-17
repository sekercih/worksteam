package work7;

public class Ornek04 {
	static String myStr="9009";
	
	public void doStof(String str) {
	int myNum=0;
	try {
		String myStr=str;
		myNum=Integer.parseInt(myStr);
	} catch (NumberFormatException ne) {
		System.err.println("Error");
	}
	System.out.println("myStr : "+myStr +", myNum:"+myNum);
	}
	public static void main(String[] args) {
		Ornek04 obj=new Ornek04();
		obj.doStof("7007");
	}

}
