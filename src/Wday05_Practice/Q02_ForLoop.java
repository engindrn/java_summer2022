package Wday05_Practice;

import java.util.Scanner;

public class Q02_ForLoop {
    public static void main(String[] args) {/*    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
           ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
           hesaplayan kodu yazınız.

           Örnek Ekran Çıktısı
           Girilen sayı=4
           Kareler toplamı=14
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 1' den büyük bir tam sayı giriniz");
        int sayi= scan.nextInt();
        int toplam=0;

        if (sayi<1){
            System.out.println("birden büuük bir sayı giriniz");
        }else{
            for (int i = 1; i <sayi ; i++) {

                toplam+=i*i;
            }
        }
        System.out.println(toplam);
    }
}



