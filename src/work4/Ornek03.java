package work4;

import java.util.Arrays;

public class Ornek03 {

	public static void main(String[] args) {
		String[][] chs = new String[2][];
		chs[0] = new String[2];
		chs[1] = new String[5];
		int i = 97;
		for (int a = 0; a < chs.length; a++) {
			for (int b = 0; b < chs.length; b++) {
				chs[a][b] = "" + i;
				
				
				i++;
			}
		}System.out.println(Arrays.deepToString(chs)+"  arrayy");//[[97, 98], [99, 100, null, null, null]] 
		for (String[] ca : chs) {
			//System.out.println("ca array "+Arrays.deepToString(ca));
			for (String c : ca) {
				System.out.println(c + " ");
			}
			System.out.println();
		}
	}

}
