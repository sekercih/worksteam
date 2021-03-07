package work1;

import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {
		/*
		 * /1- Kullanicidan iki basamakli uc adet sayi aliniz. Alinan sayilardan en az
		 * ikisinin birler basamagi ayni ise ekrana true yoksa false yazdiriniz. (Orn
		 * 52,72,93 => true 36,57,78 => false)
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen 1. sayiyi giriniz");
		int say1 = scan.nextInt();
		System.out.println("lütfen 2. sayiyi giriniz");
		int say2 = scan.nextInt();
		System.out.println("lütfen 3. sayiyi giriniz");
		int say3 = scan.nextInt();
		System.out.println(""+say1+say2+say3);
		boolean sonuc=true;
		if (say1%10==say2%10 || say1%10==say3%10||say2%10==say3%10) {
			System.out.println(true);
		} else {
			System.out.println(false);

		}
		
	}

}
