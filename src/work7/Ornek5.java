package work7;

public class Ornek5 {
	public static void main(String[] args) {
		int []arr= {10,20,30,40,50};
		int x=arr.length;
		System.out.println(x);
	/*while(x>0) {
		--x;
		System.out.print(arr[x]);
	}
		do {
			x--;
			System.out.println(arr[x]);
		} while (x>=0);
		
		while (x>=0) {
			System.out.print(arr[x]+" ");
			x--; 
		}
		do {
			System.out.print(arr[x]+" ");
			--x;
		} while (x>=0);*/
		
		while (x>0) {
			System.out.print(arr[--x]);
		}
	}

}
