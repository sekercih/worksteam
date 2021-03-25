package work15;

import java.util.function.Predicate;

public class Examples02 {

	public static void main(String[] args) {
		Predicate<Integer> p = (n) -> n % 2 == 0;
		Boolean s = p.test(100);
		System.out.println(s);
	}

}
