package work14;

import java.util.Scanner;

public class Examples03 {

	public static void main(String[] args) {
		/*
		Bu ��gen sayi Serisi, . S�ran�n ilk 5 numaras� veya noktalar �unlard�r:
		1, 3, 6, 10, 15
	bu serini istenilen elemanini ve istenilen elemana kadar olan seriyi yaziniz
		//(n*(n+1))/2
		*/
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen bir tam sayi giriniz");
		int sayi=scan.nextInt();
		int dizi=0;
		int i=1;
		while (i<=sayi) {
			dizi=(i*(i+1))/2;
			System.out.print(dizi+" ");
			i++;
			
		}
		

	}

}
