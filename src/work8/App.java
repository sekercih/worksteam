package work8;

import java.util.*;

public class App {
	public static void main(String[] args) {
		List<String>arrayList = new ArrayList<>();
		arrayList.add("tech");
		arrayList.add("expert");
		arrayList.set(0,"java");
		arrayList.forEach(a-> a.concat("forum"));
		arrayList.replaceAll(s-> s.concat("group"));
		System.out.println(arrayList);
	}
	}


