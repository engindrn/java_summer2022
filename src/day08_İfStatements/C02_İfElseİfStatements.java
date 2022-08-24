package day08_İfStatements;

import java.util.Scanner;

public class C02_İfElseİfStatements {
    public static void main(String[] args) {

        /*Soru= kullanıcıdan 100 üzerinden notunu isteyin ve harf sistemine göre yazdırın
                50'den kucukse D
                50 eşit veya büyük-60'dan küçük C
                60 eşit veya büyük-80'den küçük B
                80 eşit veya üzeri              A
                gecersiz not girilincce uyarı ver
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen notununu giriniz");
        double note=scan.nextDouble();

        if(note<0 || note>100){                                      // 0'dan büyük 100'den küçük değilse
                                                                     // if (!(note>0 || note<100)) bunun dışı dedik
            System.out.println("Lutfen gecerli bir not giriniz");
        } else if (note<50){                //bu satıra geldiysek notumuz 0 ile 100 arasındadır
            System.out.println("notunuz :D");
        }else if(note<60){                  //bu satıra geldiysek notumuz 50 ile 100 arasındadır
            System.out.println("notonuz :C");
        }else if(note<80){                  //not 60 ile 100 arasındadır
            System.out.println("notunuz :B");
        }else{
            System.out.println("notunuz: A");
        }
         // hepsi if olarak girilirse birbirinden bağınsız olarak hepsi çalışır
        //örneğin 20 girilse bütün harleri yazdırır

    }
}
