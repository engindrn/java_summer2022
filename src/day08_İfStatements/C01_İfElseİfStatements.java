package day08_İfStatements;

import java.util.Scanner;

public class C01_İfElseİfStatements {
    public static void main(String[] args) {

        /*soru5= kullanıcıdan gun ismini yazmasini isteyin
          girilen isim geçerli bir gün ise isminin 1.,2. ve 3. harflarini
          ilk harf buyuk diger ikisi kucuk olarak yazdırın
          gün ismi geçerli değilse "geçerli gün ismi giriniz" yazdırın
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismin giriniz");
        String gun= scan.next().toLowerCase();

        if(gun.equals("pazartesi")){
            System.out.println("Paz");
        }else if(gun.equals("salı")){
            System.out.println("Sal");
        }else if(gun.equals("carsamba")){
            System.out.println("Car");
        }else if(gun.equals("persembe")) {
            System.out.println("Per");
        } else if (gun.equals("cuma")) {
            System.out.println("Cum");
        } else if (gun.equals("cumartesi")) {
            System.out.println("Cum");
        }else if (gun.equals("pazar")){
            System.out.println("Paz");
        }else {
            System.out.println("Lutfen gecerli bir gun ismi yaziniz");



    }

    }
        }

