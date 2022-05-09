package alıstırmalar;

import java.util.ArrayList;
import java.util.List;

public class EachLoop {
    public static void main(String[] args) {
        int arr[] = {2, 8, 9, 45, 1, 2, 61, 6};
        List<Integer> sayilar = new ArrayList<>();
        for (int each : arr
        ) {
            sayilar.add(each);
        }

        System.out.println(sayilar);



            }
        }


