package work3;

public class Ornek2 {

	public static void main(String[] args) {
		String str="Ali ata bak.";
		System.out.println("string "+ str);
		StringBuilder strb=new StringBuilder();
		strb.append(str);
		System.out.println("StringBuilder "+strb);
		strb.reverse();
		System.out.println("StringBuilder "+strb);
		strb.reverse();
		
		String yenistr=strb.toString();
		System.out.println(yenistr);
		System.out.println(yenistr.charAt(5));
		System.out.println(yenistr);

	}

}
