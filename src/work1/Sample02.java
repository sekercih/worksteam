package work1;

import java.util.Scanner;

public class Sample02 {

	public static void main(String[] args) {
		  // TODO Auto-generated method stub
        // Kullanicidan iki basamakli uc adet tam sayi aliniz.
        // Alinan sayilardan en az ikisinin birler basamagi ayni ise
        // ekrana true yoksa false yazdiriniz.
        // (Orn 52,72,93 => true 36,57,78 => false)
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen birinci tam sayiyi giriniz");
        int a = scan.nextInt();
        System.out.println("lutfen ikinci tam sayiyi giriniz");
        int b = scan.nextInt();
        System.out.println("lutfen ucuncu tam sayiyi giriniz");
        int c = scan.nextInt();
        if ((a >= 10 && a <= 99) && (b >= 10 && b <= 99) && (c >= 10 && c <= 99)) {
            if (a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("lutfen iki basamakli tam sayi giriniz");
        }
        scan.close();//  return out.substring(0,2)+word+ out.substring(2);


	}

}
