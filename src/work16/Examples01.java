package work16;

public class Examples01 {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5},{7,8,9,6}};
		System.out.println(toplamaFor(arr));
		
		System.out.println(toplamaForeach(arr));

	}
	public static int toplamaFor(int arr [][]) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum+=arr[i][j];
			}
		}return sum;
		
		
		
	}
	public static int toplamaForeach(int arr[][]) {
		int sumForeach=0;
		
		for (int[] is : arr) {
			for (int is2 : is) {
				sumForeach+=is2;
			}
		}
		
		return sumForeach;
	}
	
	
	}

