package Çalışmalar;

import java.util.Scanner;

public class ArrayDEGER {
    public static void main(String[] args) {

        //Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.


        int[] sayilar = {12, 15, 43, 23, 56, 76, 78, 90, 77, 43};

        Scanner scann=new Scanner(System.in);
        System.out.println("bir değer giriniz");
        int deger=scann.nextInt();
        int count=0;

        for (int i = 0; i <sayilar.length ; i++) {
            count++;
            if (sayilar[i]==deger){
                System.out.println("girilen " + deger+ " sayisi "+count+"."+" elemanı");
            }
        }

    }
}