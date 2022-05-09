package alıstırmalar;

import java.util.ArrayList;
import java.util.List;

public class A20remowe {
    public static void main(String[] args) {
        List<String> isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler); // [Aykut, Yusuf, Ilker, Oguzhan]
        isimler.remove(2);//

    }
}
