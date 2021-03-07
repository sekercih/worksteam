package work2;

import java.util.Scanner;

public class Examples02 {

	public static void main(String[] args) {
		/*
		 * //Kullanicidan dikdortgen olusturmak icin iki sayi aliniz. //Eger kenarlardan
		 * herhangi biri 0 (sifir) degilse bu seklin kare mi dikdortgenmi oldugunu
		 * yazdiran bir kod yaziniz.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen dikdörtgen oluşturmak için 2 adet sayi giriniz");
		int kenar1 = scan.nextInt();
		int kenar2 = scan.nextInt();
		String sekil="";

		if (kenar1 > 0 && kenar2 > 0) {
			if (kenar1 == kenar2) {
				sekil="karedir";
			} else {
				sekil="dikdörtgen";
			}
		} else {
			sekil="0 veya negatif sayi";
		}System.out.println(sekil);

	}

}
