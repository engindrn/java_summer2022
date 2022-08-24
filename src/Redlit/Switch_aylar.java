package Redlit;

import java.util.Scanner;

public class Switch_aylar {
    public static void main(String[] args) {
      /*  Write a Java program to find the number of days in a month.(Use Switch Case) (Interview Question / Leak Year)
      Bir aydaki gün sayısını bulan bir Java programı yazın.(Switch Case Kullanın) (Mülakat Sorusu Sızıntı Yılı)
        Sample:
        INPUT:
        Input a month number: 2
        Input a year: 2016
        OUTPUT  :
        February 2016 has 29 day

       */
        Scanner scann = new Scanner(System.in);
        System.out.println("AY NUMARASINI GİRİNİZ");
        int month = scann.nextInt();

        System.out.println("YILI GİRİNİZ");
        int year = scann.nextInt();

        int gunSayisi = 0;


        switch (month) {

            case 1:
                month = 1;
                gunSayisi = 31;
                break;
            case 2:
                month = 2;
                if ((year % 100 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    gunSayisi = 29;
                } else {
                    gunSayisi = 28;
                }
                break;
            case 3:
                month = 3;
                gunSayisi = 31;
                break;
            case 4:
                month = 4;
                gunSayisi = 30;
                break;
            case 5:
                month = 5;
                gunSayisi = 31;
                break;
            case 6:
                month = 6;
                gunSayisi = 30;
                break;
            case 7:
                month = 7;
                gunSayisi = 31;
                break;
            case 8:
                month = 8;
                gunSayisi = 31;
                break;
            case 9:
                month = 9;
                gunSayisi = 30;
                break;
            case 10:
                month = 10;
                gunSayisi = 31;
                break;
            case 11:
                month = 11;
                gunSayisi = 30;
                break;
            case 12:
                month = 12;
                gunSayisi = 31;
                break;

        }
        if (month < 10) {
            System.out.println(year+" "+"0" + month+"= "+gunSayisi+" gun");
        } else {
            System.out.println(year + " " +month+"= "+gunSayisi+" gun");


        }
    }
}