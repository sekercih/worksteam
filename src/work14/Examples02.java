package work14;

import java.util.Scanner;

public class Examples02 {

	public static void main(String[] args) {
		//  //kullanicidan alinan 
		//bir sayinin kullanicinin istedigi kuvvetini bulma
		Scanner scan =new Scanner (System.in);
		System.out.println("L�tfen istde�iniz tam say� giriniz");
		int sayi=scan.nextInt();
		System.out.println("L�tfen istde�iniz say�n�n kuvvetini giriniz");
		int sayi1=scan.nextInt();
		int count=1;
		while (sayi1>0) {
			count=sayi*count;
			sayi1--;
		}System.out.println(count);
	}

}
