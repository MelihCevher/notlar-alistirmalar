package alıstırmalar;

import java.util.ArrayList;
import java.util.List;

public class A11contains {
    public static void main(String[] args) {
        List<String> ogrenci=new ArrayList<>();
        ogrenci.add("ali");
        ogrenci.add("alp");
        ogrenci.add("alpay");
        ogrenci.add("alper");
        ogrenci.add("ayse");
        ogrenci.add(2,"asim");

        System.out.println(ogrenci.contains("alp"));

        System.out.println(ogrenci);

    }
}
