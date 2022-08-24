package ÇALIŞMA1;

import java.util.Scanner;

public class SwitchHesapmakinesi {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("1.Sayiyi giriniz: ");
        int sayi1 = scan.nextInt();

        System.out.print("2.Sayiyi giriniz: ");
        int sayi2 = scan.nextInt();

        System.out.println("1.Toplama");
        System.out.println("2.Cikarma");
        System.out.println("3.Bolme");
        System.out.println("4.Carpma");

        System.out.print("Islemi seciniz: ");
        int islem = scan.nextInt();


        switch(islem) {
            case 1:
                System.out.println("Toplama işleminin sonucu = " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Çıkarma işleminin sonucu = " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Bölme işleminin sonucu = " + ((float)sayi1 / sayi2));
                break;
            case 4:
                System.out.println("Çarpma işleminin sonucu = " + (sayi1 * sayi2));
                break;
            default:
                System.out.println("Yanlış seçim yaptınız !!");
        }
    }
}