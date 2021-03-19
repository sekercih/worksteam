package work9;

public class Ornek03 {
	
	public static void main(String[] args) {
		Boolean [] bool=new Boolean[2];
		Boolean ad = false;
		Boolean sd=ad.parseBoolean("true");
		System.out.println("döndü "+sd);
		bool[0]=new Boolean("true");
		bool[1]=new Boolean(null);
		System.out.println(bool[0]+" "+bool[1]);
		
		

	}

}
