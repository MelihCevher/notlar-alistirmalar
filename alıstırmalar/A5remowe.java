package alıstırmalar;

import java.util.ArrayList;
import java.util.List;

public class A5remowe {

    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler);

        isimler.remove("Aykut");// aykut silindi
        boolean sonuc=isimler.remove("Ayse");
        if (sonuc == true) {
            System.out.println("istediginiz isim silindi");
        } else {
            System.out.println("isim listede olmadigi icin silinemedi");


        }

    }
}
