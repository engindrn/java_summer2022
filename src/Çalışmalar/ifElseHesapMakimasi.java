package Çalışmalar;

import java.util.Scanner;

public class ifElseHesapMakimasi {

    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            int sayi1,sayi2;
            int islem;

            System.out.print("1.Sayıyı giriniz: ");
            sayi1 = scan.nextInt();
            System.out.print("2.Sayıyı giriniz: ");
            sayi2 = scan.nextInt();

            System.out.println("1.Toplama");
            System.out.println("2.Çıkarma");
            System.out.println("3.Bölme");
            System.out.println("4.Çarpma");

            System.out.print("İslemi seçiniz: ");
            islem = scan.nextInt();

            if(islem == 1) {
                System.out.println("Toplama işleminin sonucu " + (sayi1 + sayi2));
            }
            else if(islem == 2) {
                System.out.println("Çıkarma işleminin sonucu " + (sayi1 - sayi2));
            }
            else if(islem == 3) {
                System.out.println("Bölme işleminin sonucu " + (sayi1 / sayi2));
            }
            else if(islem == 4) {
                System.out.println("Çarpma işleminin sonucu " + (sayi1 * sayi2));
            }
            else {
                System.out.println("Seçiminiz doğru değil !!");
            }
        }
    }

