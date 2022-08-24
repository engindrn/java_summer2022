package Wday06_Practice;

import java.util.Scanner;

public class Q01_WhileLoopModulus {
    public static void main(String[] args) {

        //girilen sayının basamaklarındaki rakamların toplamını bulunuz

        Scanner scann=new Scanner(System.in);
        int sayi=scann.nextInt();

       int toplagel= basamakTopla(sayi);

        System.out.println(toplagel);

     //   System.out.println(basamakTopla(sayi)); atama yapmadan return edileni bu şekilde direk yazdırabilirdik

    }

    private static int basamakTopla(int sayi) {

        int toplam=0;

        while (sayi!=0){
            toplam+=sayi%10;
            sayi/=10;

        }
        return toplam;
    }
}
