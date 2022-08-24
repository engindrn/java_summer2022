package RECAP;

import java.util.Scanner;

public class Q04_NotHesaplama {
    public static void main(String[] args) {

        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        Scanner scann = new Scanner(System.in);
        System.out.println("vize1 notunuzu giriniz");
        double vize1 = scann.nextDouble();

        System.out.println("vize2 notunuzu giriniz");
        double vize2 = scann.nextDouble();

        System.out.println("final notunuz giriniz");
        double finalnot = scann.nextDouble() ;         //*0.7; direk burdada yüzde işlemini yapabiliriz

        double ortalama = ((vize1 + vize2) / 2) * 0.3 +finalnot*0.7;
        // System.out.println(ortalama);

        System.out.println(ortalama);



        /* Scanner scann = new Scanner(System.in);
        int vize1;                          //değerleri bilmiyoruz kullanıcıdan gelen değerlere atayacağız
        int vize2;
        int finalnot;                   //yada int vize1,vize2,finalnot

        System.out.println("birinci vize")
        vize1=scann.nexInt();

        System.out.println("ikinci vize")
        vize2=scann.nexInt();

        System.out.println("finalnot")
        finalnot=scann.nexInt();               //önce Initialise yaptık sonra assignment yaptık


         */


    }
}
