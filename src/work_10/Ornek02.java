package work_10;

import java.util.ArrayList;
import java.util.Arrays;

public class Ornek02 {

	public static void main(String[] args) {
		ArrayList myList=new ArrayList<>();
		String [] myArray;
		try {
			while (myList.size()<2500) {
				myList.add("My String");
			}
		} catch (RuntimeException e) {
			System.out.println("RuntimeRxpection ");
		}catch (Exception e) {
			System.out.println("Expection ");
		}
System.out.println("Ready to use");
System.out.println(myList.toString());
	}

}
