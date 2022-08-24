package RECAP01;

import java.util.Scanner;

public class Q05_Scanner {
    public static void main(String[] args) {

/*  Problem Tanımı
    Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
    a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

    Örnek Ekran Çıktısı
    a sayısını giriniz: 5
    b sayısını giriniz: 3
    c sayısını giriniz: 1
    sonuç : 5.333333333333333
    */
        Scanner scann=new Scanner(System.in);

        double sayi1;
        double sayi2;
        double sayi3;
        
        System.out.print("lutfen sayı giriniz :");
        sayi1= scann.nextDouble();

        System.out.print("lutfen sayı giriniz :");
        sayi2= scann.nextDouble();

        System.out.print("lutfen sayi giriniz :");
        sayi3= scann.nextDouble();
         
        double islem= ((sayi1*sayi1)-(sayi2*sayi2))/(sayi3*3);

        System.out.println("islem = " + islem);

        
    }
}
