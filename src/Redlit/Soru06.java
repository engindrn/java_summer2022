package Redlit;

import java.util.Scanner;

public class Soru06 {

   /* Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

            Array: [12,15,43,23,56,76,78,90,77,43]

    Aranan değer:56
    Beklenen Çıktı:
            56 sayısı arrayin 4. elemanı*/

    public static void main(String[] args) {


        int [] sayilar ={12,15,43,23,56,76,78,90,77,43};

        Scanner scann=new Scanner(System.in);
        System.out.println("Aradiginiz degeri giriniz");
        int sayi=scann.nextInt();

        int count=0;

        for (int i = 0; i <sayilar.length ; i++) {

            if (sayi==sayilar[i]){
                count++;


            }

        }
    }
}
