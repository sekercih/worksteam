package work16;

public class Runner {
void birinciMethod() {
	Person birinciKisi=new Person();
	birinciKisi.name="ali";
	birinciKisi.lastName="perdeli";
	birinciKisi.birthYear=1950;
	birinciKisi.calculetaAge(birinciKisi.birthYear)
;
	
	
	}
void ikinciMethod() {
	Person ikinciKisi=new Person("Faruk", "Dalga");
	
}
void ucuncuMethod() {
	Person ucuncuKisi=new Person("Deniz", 1992);
	System.out.println(ucuncuKisi.name);
	System.out.println(ucuncuKisi.birthYear);
	
	
}
public static void main(String[] args) {
	Runner obj=new Runner();
	obj.birinciMethod();
	obj.ucuncuMethod();
}
}
