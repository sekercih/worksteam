package work17;

import java.util.Scanner;

public class Examples03 {

	public static void main(String[] args) {
		/*
		* SORU 3) Kullanicidan 100 den kucuk bir tamsayi isteyip, bu sayinin daha
		* onceden tanimlanmis array’de olup olmadigini kullaniciya donen bir method
		* yaziniz
		*
		* Array={3,5,21,32,34,45,56,57,76,87,95}
		*
		* Input : 5 Output: Girdiginiz sayi Arrayde var
		* Input : 15 Output: Girdiginiz sayi Arrayde yok
		*/
		
	int arr[]= {1,2,55,5,7,99,61,35,14,35,};
	int count=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("aranacak sayi girin");
	int sayi=scan.nextInt();
	int bos[]=new int[110];
	for (int i : arr) {
		if (i==sayi) {
			bos[i]=sayi;
			count++;
		
		}}if (count>0) {
			System.out.println("Girdiginiz sayi Arrayde var ");
		}else {
			System.out.println("Girdiginiz sayi Arrayde yok");
	}
	
	

	}

}
