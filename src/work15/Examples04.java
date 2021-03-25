package work15;

import java.util.*;

public class Examples04 {
	public static void main(String[] args) {
		List colors=new ArrayList();
		//List colors=new ArrayList<>();
		//List<String> colors=new ArrayList();
		colors.add("green");
		colors.add("blu");
		colors.add("red");
		colors.add("yellow");
		colors.remove(2);
		colors.add(3,"cyan");
		System.out.println(colors);
		
	}

}
