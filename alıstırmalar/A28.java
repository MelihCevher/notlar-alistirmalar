package alıstırmalar;
import java.util.ArrayList;
import java.util.List;

public class A28 {
    public static void main(String[] args) {
        int arr[]={2,1,11,6,9,5};
        int toplam=0;

        for (int i=0; i<arr.length; i++) {
            toplam+=arr[i];
            System.out.println(toplam);
        }
    }
}
