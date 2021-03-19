package work9;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ornek02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);
		System.out.println(dt);
		dt=dt.plusDays(30);
		dt.plusDays(30);
		dt.plusMonths(1);
		System.out.println(dt);
		System.out.println(dt.plusDays(30));
	}
}
