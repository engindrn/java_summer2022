package Çalışmalar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

          /*
        Verilen bir sayidan kucuk tum Fibonacci sayilarini bir liste olarak olusturup yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen pozitif bir tamsayi giriniz : ");
        int sayi= scan.nextInt();
        int sayi1=0;
        int sayi2=1;
        int sayi3=1;
        List<Integer> fibo=new ArrayList<>();
        while(sayi>sayi3){
            sayi3=sayi1+sayi2;
            sayi1=sayi2;
            sayi2=sayi3;
            fibo.add(sayi1);
        }
        System.out.println(fibo);


    }
    }

