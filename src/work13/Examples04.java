package work13;

import java.util.Arrays;

public class Examples04 {
	public static void main(String[] args) {
		int[][] arr = new int[2][4];
		arr[0] = new int[] { 1, 3, 5, 7 };
		arr[1] = new int[] { 1, 3 };
		for (int[] a : arr) {
			System.out.println(Arrays.toString(a));
			for (int i = 0; i < arr.length; i++) {
				System.out.println(a[i] + " ");
			}
			System.out.println();
		}
	}
}
