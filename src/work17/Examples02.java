package work17;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Examples02 {

	public static void main(String[] args) {
		/* Kullanicidan sayilar girmesini isteyin
         * ve girdigi sayilari toplayip yazdirin.
         * yeni sayi isteyin
         * girilen sayilarin toplami 100 'u gecerse
         * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
         */
		Scanner scan=new Scanner(System.in);
		
		
	
		
		int toplam=0;
		int sayac=0;
		
		do {
			System.out.println("lütfen sayi giriniz");
			int sayi=scan.nextInt();
			toplam+=sayi;
			sayac++;
		} while (toplam<100);
		System.out.println("toplam sayi ="+toplam+" "+sayac+ " adet kadar sayi girdiniz" );

	}

}
