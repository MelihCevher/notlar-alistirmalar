package alıstırmalar;

import java.util.ArrayList;
import java.util.List;

public class A7equals {
    public static void main(String[] args) {
        List<String> hayvan=new ArrayList<>();//baklavadan sonra boşluk olmalı
        List<String> bitki=new ArrayList<>();//baklavadan sonra boşluk olmalı
        System.out.println(hayvan.equals(bitki));//true
        hayvan.add("a");//[a]
        System.out.println(hayvan.equals(bitki));//false

        hayvan.add("b");//[a,b]
        bitki.add(0,"b");//[b,a]//false

    }
}
