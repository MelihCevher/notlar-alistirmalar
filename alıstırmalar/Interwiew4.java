package alıstırmalar;

import java.util.Scanner;

public class Interwiew4 {
    /*
   Kullanicidan bir isim ve karakter girmesini isteyin, sonra karakterin kac kez tekrarlandigini kontrol edin.
           char ch= 'e' ;
           String name ="Sevecen"
           => Tekrar Sayisi = 3

    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");
        String kelime = scan.nextLine();
        System.out.print("bir harf giriniz :");
        char harf = scan.next().charAt(0); //tek karakteri alir

        int sayac = 0;
        for (int i = 0; i < kelime.length(); i++) {
            if(kelime.charAt(i) == harf)
                sayac++;
        }
        System.out.print("tekrar sayisi :" +sayac);

    }

}

