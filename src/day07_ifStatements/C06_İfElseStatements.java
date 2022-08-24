package day07_ifStatements;

import java.util.Scanner;

public class C06_İfElseStatements {
    public static void main(String[] args) {

        /*Soru=kullanıcıya yaşını sorun eger yas 65'den kucuk ise emekli olamazsı calışmalısın
          65'e eşit veya büyükse emekli olabilirsin yazdır
         */



        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas < 65) {
            System.out.println("emekli olamazsın " + (65-yas) + " yıl daha çalışmalısın");
        } else {
            System.out.println("emekli olabilirsin");
        }
    }
}