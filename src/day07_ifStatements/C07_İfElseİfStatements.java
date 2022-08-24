package day07_ifStatements;

import java.util.Scanner;

public class C07_İfElseİfStatements {
    public static void main(String[] args) {

         /*Soru=kullanıcıya yaşını sorun eger yas 65'den kucuk ise emekli olamazsı calışmalısın
          65'e eşit veya büyükse emekli olabilirsin yazdır
           negatif değer girerse uyaralım
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();

        if(yas<0) {
            System.out.println("lutfem gecerli bir yas giriniz ");
        } else if (yas<65){
            System.out.println("emekli olamazsin "+ (yas-65) +" yi65l daha çalışmlısın");
        } else {
            System.out.println("emekli olabilirsin");
        }
    }
}
