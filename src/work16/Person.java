package work16;

public class Person {
	String name;
	String lastName;
	int birthYear;
	public Person() {
		
	}

	public Person(String name, String lastName) {
	
		this.name = name;
		this.lastName = lastName;
		
	}

	int calculetaAge(int sayi) {
		return 2021 - sayi;
	}

	public Person(String name, int birthYear) {
	
		this.name = name;
		this.birthYear = birthYear;
	}

}
