package alıstırmalar;

import java.util.ArrayList;
import java.util.List;

public class A12sizeremove {
    public static void main(String[] args) {
        List<String> bitki = new ArrayList<>();
        bitki.add("gul");
        bitki.add("elma");
        bitki.add("agac");
        bitki.add("cicek");
        System.out.println(bitki);
        System.out.println(bitki.size());
        boolean sonuc = bitki.remove("gul");

        if (sonuc==true){
            System.out.println("istediginiz isim silindi");
        } else {
            System.out.println("istediginiz isim listede olmadigindan silinemedi");
        }

        System.out.println(bitki);


    }
}