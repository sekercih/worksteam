package work7;

public class Ornek01 {

	public static void main(String[] args) {
		String ta ="A";
		ta= ta.concat("B ");
		String tb = ("C ");
		ta = ta.concat(tb);
		ta.replace('c','d');
		ta = ta.concat(tb);
		System.out.println(ta);

	}

}
