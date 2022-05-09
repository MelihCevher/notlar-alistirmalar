package alıstırmalar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A9collectionssort {

    public static void main(String[] args) {
        List<String> ogrenci=new ArrayList<>();
        ogrenci.add("ali");
        ogrenci.add("alp");
        ogrenci.add("alpay");
        ogrenci.add("alper");
        ogrenci.add("ayse");
        System.out.println(ogrenci);

        Collections.sort(ogrenci);
        System.out.println(ogrenci);


    }
}
