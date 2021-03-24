package work14;

import java.util.Scanner;

public class Examples01 {

	public static void main(String[] args) {
		//Bir string verildiðinde, 0,1, 4,5, 8,9 dizinlerindeki 
				//karakterlerden oluþan bir string yazdiralim
				// ornegin java =>> ja
				//hayat=>> hat
				// harita=>> hata 
				//
				Scanner scan =new Scanner (System.in);
				System.out.println("lutfen bir string giriniz");
				String str=scan.nextLine();
				String sonHal="";
				int ikiKar=0;
				for(int i=0;i<str.length();i+=4) {
					ikiKar=i+2;
					if(ikiKar>str.length()) {
						ikiKar=str.length();
					}sonHal=sonHal+str.substring(i,ikiKar);
				}System.out.println(sonHal);
				

	}

}
