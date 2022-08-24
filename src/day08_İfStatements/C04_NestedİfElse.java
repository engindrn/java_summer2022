package day08_İfStatements;

import java.util.Scanner;

public class C04_NestedİfElse {
    public static void main(String[] args) {

        /* kullanıcıdan ekrana dört basamaklı bir sayı girmesini isteyin
           girilen sayı 5'e bölünüyorsa son rakamını kontrol edin
           son rakamı 0 ise ekrana 5'e bölünen çift sayı yazdırın
           son rakamı 0 değilse 5'e bölünen tek sayı yazdırın
           girdiği sayı 5'e bölünmüyorsa ekrana tekrar deneyin yazdırın
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 basamaklı bir tamsayı giriniz");
        int sayi=scan.nextInt();

        // sayının 5'e bölünüp bölünmemesi
        //sayının son basamağının 0 olup olamaması

        if(sayi<1000 || sayi>9999) {
            System.out.println("lutfen dört basamaklı bir sayı giriniz");
        } else if (sayi%5==0) {             //sayı dört basamaklı ve 5' bölünebiliyor
            if (sayi % 10 == 0) {
                System.out.println("5'e bolunen çift sayı");
            } else {
                System.out.println("5'e bölünen tek sayi");


            }
        }
    }
}
