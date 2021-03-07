package work2;

import java.util.Scanner;

public class Examples01 {

	public static void main(String[] args) {
		/*Kullanicidan iki tam sayi aliniz eger
		 *  tam sayilarin biri 10 veya bu iki tamsayinin toplami 10 ise
	 true degilse ekrana false yazdiriniz. */
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen 2 adet sayi giriniz");
		int say1=scan.nextInt();
		int say2=scan.nextInt();
		boolean sonuc=true;
		if (say1==10||say2==10||say1+say2==10) {
			sonuc=true;
		}else {
			sonuc=false;
		}System.out.println(sonuc);
		
		

	}

}
