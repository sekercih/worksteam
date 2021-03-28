package work16;

public class Child {
	String name;
	String lastName;
	int childBirthYear;
	
	boolean isMature(int sayi) {
		if (2021-sayi>17) {
			return true;
		}else {
			return false;
		}
	}
}
