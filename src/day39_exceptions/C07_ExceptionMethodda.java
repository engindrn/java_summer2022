package day39_exceptions;

import java.util.Scanner;

public class C07_ExceptionMethodda {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int numOfEgg = scann.nextInt();

        countEgg(numOfEgg);


    }

    public static void countEgg(int numOfEgg) {

            try {
                if (numOfEgg < 0) {                   //eğer yumurta sayisi 0 dan küçükse IllegalArgumentException
                    throw new IllegalArgumentException();       //fırlat dedik. eğer - değer girilirse if yakalar ve
                                                            //body si çalışır else çalışmaz artık orayı atlar catche gider



                } else {                            // negatif değilse girilen yumurta sayısını yazdırır
                    System.out.println("yumuta sayisi :" + numOfEgg);
                }

            } catch (IllegalArgumentException e) {      //burdada exception türü gerçekleştiğinden body si çalışır
                System.err.println("yumurta sayisi negatif olamaz");    //kırmızı yazdırır


            }
        }
    }
