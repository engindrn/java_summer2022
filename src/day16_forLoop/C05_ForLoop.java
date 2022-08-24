package day16_forLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[]args){
        //kullanıcıdan iki sayi isteyin
        //girilen sayılar ve aralarındaki tüm sayilari toplayıp sonucu yazdıran bir method yazınız

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen başlangic ve bitiş degerlerini pozitif tamsayi olarak giriniz");
        int bas=scan.nextInt();
        int bitis=scan.nextInt();

        aralarıTopla(bas,bitis);


    }

    public static void aralarıTopla(int bas, int bitis) {

        int toplam=0;

        if (bas<=bitis){
            for (int i =bas; i <=bitis; i++) {
                toplam+=i;
            }

        }else {                                             //önce büyük sayı girmesi durmunda burası çalışacak
            for (int i = bitis; i <=bas ; i++) {
                toplam+=i;

            }
        }
        System.out.println("sayıları toplamı "+toplam);

        }
    }