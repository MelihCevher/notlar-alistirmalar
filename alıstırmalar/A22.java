package alıstırmalar;

public class A22 {
    public static void main(String[] args) {

        for (int i = 10; i < 30; i++) {
            System.out.print(i+",");
        }
        System.out.println(30);
        int baslangic=10;
        int bitis=30;
        for (int i = baslangic; i <= bitis; i++) {

            if(i<bitis){
                System.out.print(i+",");
            }else{
                System.out.print(i);
            }
        }

    }
}
