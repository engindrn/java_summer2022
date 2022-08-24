package day09_ternary;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {

                   /*
                    kullanicidan gun numarasini alip
                    1 ise pazartesi,
                    ...
                    7 ise pazar yazdiralim
                    */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kacıncı gun olduğunu giriniz");
        int gunNo=scan.nextInt();

       /* switch yanına yazılan () göre case atayacağımızı gösteri. sadece sayı değil harf isim gün vb olabilir
       java girilrn case değere göre case 'i bulur ve o satırdan çalıştırmaya başlar break yazısına veya
        switch parantezine kadar çalışmaya devm eder.

        if-else if-....else yapısında olduğu gibi hiçbir şarta uymayanları default keywort kullanılır
        */


        switch(gunNo){                        //girilen numaraya göre o case gider ve ordan çalıştırmaya başlar


            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumatesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("gecerli bir gün giriniz");

        }


    }
}
