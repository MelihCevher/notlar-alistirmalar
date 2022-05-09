package alıstırmalar;

import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {

                Scanner scan=new Scanner(System.in);
                double yazili1,yazili2,ortalama=0;
                System.out.print("1. Yazılı : ");
                yazili1=scan.nextDouble();
                System.out.print("2. Yazılı : ");
                yazili2=scan.nextDouble();
                ortalama=(yazili1+yazili2)/2;
                System.out.println("Ortalamanız : "+ortalama);
            }

        }

