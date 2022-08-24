package ÇALIŞMA1;

import java.util.Scanner;

public class Array5 {
    /*yazılan değerin array içerisinde arayan Java Kodu yazınız.
    Array: [1551,1223,1443,1267,1789,1023,2020]
    Aranan Değer:2020
    Beklenen Çıktı:**True**
    Aranan Değer:2010
    Beklenen Çıktı :**False**      */


    public static void main(String[] args) {

        int sayilar[] = {1551, 1223, 1443, 1267, 1789, 1023, 2020};

        Scanner scann = new Scanner(System.in);
        System.out.println("deger giriniz");
        int deger = scann.nextInt();

        boolean sonuc=false ;

        for (int i = 0; i < sayilar.length; i++) {
            if (deger == sayilar[i]) {
                sonuc=true;                    //boolen a şartın gerçeklerşmesi durumunda true değerini atadik
            }
        }
        if (sonuc){
            System.out.println("**true**");
        }else {
            System.out.println("**false**");
        }
    }

}


