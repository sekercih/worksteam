package work3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ornek4 {

	public static void main(String[] args) {
		String[] arr={"Himen","How","Are","You"};
		List<String> arrList=new ArrayList<>(Arrays.asList(arr));
		//if (arrList.removeIf((String s)->(return s.length()<=2;))) {
			
		//}
		System.out.println(arrList.toString());
		System.out.println(arr[0]);
		for (String string : arrList) {
			System.out.print(string+" ");
			
		}
		System.out.println();
		System.out.println(arr[0].charAt(1));
		
		

	}

}
