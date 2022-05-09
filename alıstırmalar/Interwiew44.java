package alıstırmalar;

public class Interwiew44 {
    public static void main(String[] args) {
        String metin = "artik demir almak vakti gelmisse zamandan";
        char karakter = 'm';
        int tane = 0;

        for(int i = 0; i < metin.length(); i++) {
            if(karakter == metin.charAt(i)) {
                ++tane;
            }
        }

        System.out.println( karakter + " yazı içinde  " + tane +" tanedir");
    }
}


