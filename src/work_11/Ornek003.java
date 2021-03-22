package work_11;

public class Ornek003 {

	
		static int count=0;//5
		int i;
		public void changeCount() {
			while (i<5) {
				i++;
				count++;
				
			}
		}
		public static void main(String[] args) {
			Ornek003 check10 =new Ornek003();
			Ornek003 check20 =new Ornek003();
			check10.changeCount();
			check20.changeCount();
			System.out.println(check10.count+":"+check20.count);
			
			
			
	}

}
