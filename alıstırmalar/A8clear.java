package alıstırmalar;

import java.util.ArrayList;
import java.util.List;

public class A8clear {
    public static void main(String[] args) {
        List<String> ogrenci=new ArrayList<>();
        ogrenci.add("ali");
        ogrenci.add("alp");
        ogrenci.add("alpay");
        ogrenci.add("alper");
        ogrenci.add("ayse");
        System.out.println(ogrenci.isEmpty());//falze
        System.out.println(ogrenci.size());//5

        ogrenci.clear();//silindi
        System.out.println(ogrenci.isEmpty());//bos /true
        System.out.println(ogrenci.size());//0

    }
}
