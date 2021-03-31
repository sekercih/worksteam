package work17;

public class Examples01 {

	public static void main(String[] args) {
		String str="Ahmet";
		StringBuilder strb=new StringBuilder(str);
		
		System.out.println(str);
		System.out.println("esit mi= "+str.equals(strb));
		strb.reverse();
		System.out.println("tersi yazdir ="+strb);
		
		String str1="Kemal";
		String ters="";
		for (int i =str1.length()-1; i>=0; i--) {
			ters+=str1.charAt(i);
		}System.out.println(ters);

	}

}
