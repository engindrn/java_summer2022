package Çalışmalar;

import java.util.Scanner;

public class Modulus10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bes basamakli bir tamsayi giriniz");

        int sayi=scan.nextInt();

        int sayilarToplamı=0;
        int birlerBasamağı=0;
        int sayiniİlkHali=sayi;

        birlerBasamağı=sayi%10;
        sayilarToplamı+= birlerBasamağı;
        sayi/=10;

        birlerBasamağı=sayi%10;
        sayilarToplamı+=birlerBasamağı;
        sayi/=10;

        birlerBasamağı=sayi%10;
        sayilarToplamı+=birlerBasamağı;
        sayi/=10;

        birlerBasamağı=sayi%10;
        sayilarToplamı+=birlerBasamağı;
        sayi/=10;

        birlerBasamağı=sayi%10;
        sayilarToplamı+=birlerBasamağı;
        sayi/=10;

        System.out.println(sayiniİlkHali+" "+"sayisinin toplami"+" "+sayilarToplamı);

       // System.out.println(birlerBasamağı); 8






    }
}
