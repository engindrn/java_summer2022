package day08_İfStatements;

import java.util.Scanner;

public class C03_NestedİfElse {
    public static void main(String[] args) {

        /*soru= emeklilik kontrolu yapan bir program yazınız
                cinsiyet olark E (erkek) K (kadın) değişkenlerini kabul etsin
                farklı bir harf veya sembol girilirse hata mesajı versin

                emeklilik için kadınlarda yas sınırı 60 erkeklerde 65 olsun
                negatif yas veya 80'den buyuk yaş girilirse hata mesajı versin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi yazınız" + " "+"kadın icin K erkek icin E harfıne basınız");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("lutfen yasinizi giriniz");
        double yas=scan.nextDouble();

        if(cinsiyet=='E') {
            if (yas < 0 || yas > 80) {
                System.out.println("gecerli yas giriniz");
            } else if (yas < 65) {
                System.out.println("emekli olamazsın");
            } else {
                System.out.println("emekli olabilirsin");
            }

        }else if(cinsiyet=='K') {
            if (yas < 0 || yas > 80) {
                System.out.println("gecerli yas giriniz");
            } else if (yas < 60) {
                System.out.println("emekli olamazsın");
            } else {
                System.out.println("emekli olabilirsin");
            }

        }else {
            System.out.println("lutfen gecerli tercih giriniz");
        }



    }
}
