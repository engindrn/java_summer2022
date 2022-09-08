package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan iki sayı alıp bu sayıların çarpımını yazdırın

     Scanner scan=new Scanner(System.in);
        System.out.println("lutfen birinci sayiyi giriniz");
        double sayi1=scan.nextDouble();

        //ikinci sayı için yeniden object oluşturmaya gerek yoktur

        System.out.println("lutfen ikinci sayiyi giriniz");
        double sayi2= scan.nextDouble();

        System.out.println("girilen sayilarin çarpimi ="+" "+ sayi1*sayi2 );

        System.out.println("sayıların toplamı :"+" "+ (sayi1+sayi2));

        System.out.println("sayıların farkı :"+" "+( sayi1-sayi2));

    }
}
