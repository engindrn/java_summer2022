package day07_ifStatements;

import java.util.Scanner;

public class C04_BasitİfStatements {
    public static void main(String[] args) {
        /* soru-3
        kullanıcıdan gün ismini alın ve hafta içi hafta sonu olduğunu yazdırın
        örn: gün=pazar output="hafta sonu"
             gün=sali  output="hafta ici"
             not= String için equals method'unu kullanın
         */
        Scanner scan=new Scanner (System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String girilengun= scan.next().toLowerCase();     //Pazar, pazar,PAZAR, PaZar bilemeyiz girileni
                                                          //bu yüzden toLowerCase ile  pazar yaptık

        if(girilengun.equals("pazar") || girilengun.equals("cumartesi")){
            System.out.println("girilen gün haftasonu");
        }

        if(girilengun.equals("pazartesi") || girilengun.equals("sali") || girilengun.equals("carsamba")
                || girilengun.equals("perşembe") || girilengun.equals("cuma")){
            System.out.println("girilen gün haftaici");
        }

        if(!(girilengun.equals("pazartesi") || girilengun.equals("sali") || girilengun.equals("carsamba")
                || girilengun.equals("perşembe") || girilengun.equals("cuma")|| girilengun.equals("cumartesi")
        ||girilengun.equals("pazar"))){
            System.out.println("lutfen geçerli bir gun giriniz");
        }
    }

    }