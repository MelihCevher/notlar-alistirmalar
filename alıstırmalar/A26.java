package alıstırmalar;

import java.util.Scanner;

public class A26 {
    public static void main(String[] args) {
        //Kullanıcıdan bir sayı alın ve sayının küpünün yarısını
        // konsola yazdıran bir program yazın.

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = scan.nextInt();

        int sonuc=(sayi*sayi*sayi)/2;
        System.out.println("Girilen sayinin kupunun yarisi:"+sonuc);
    }
}
