package day09_ternary;

import java.util.Scanner;

public class C04_NestedTernary2 {
    public static void main(String[] args) {

        // kullanıcıdan bir sayı isteyin
        //sayi 10 dan küçükse "rakam", 100 den küçükse "iki basakamaklı sayi"
        //değilse "üç basamaklı ve daha büyük sayi " yazdırın


        Scanner scan=new Scanner (System.in);
        System.out.println("bir sayi giriniz");
        int sayi=scan.nextInt();


        String sonuç=sayi<10? "rakam": sayi<100?"iki basamaklı sayi":"üç basamaklı sayi";

        System.out.println(sonuç);
    }
}
