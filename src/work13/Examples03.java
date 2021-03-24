package work13;

import java.time.LocalDate;

public class Examples03 {

	public static void main(String[] args) {
		LocalDate lcl=LocalDate.of(2020, 3, 10);
		System.out.println(lcl);
		lcl.plusDays(10);
		System.out.println(lcl);

	}

}
