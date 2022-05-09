package alıstırmalar;

public class A1_sonelementlerincarpimi {
    public static void main(String[] args) {


   int arr[][]={ {1,2,3}, {4,5}, {6,0,2} };
        int carpim=1;

        for (int i = 0; i <arr.length ; i++) {

            carpim *= arr[i][arr[i].length-1];
        }

        System.out.println("son elementlerin carpimi : " + carpim);
    }
}

