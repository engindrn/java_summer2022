package RECAP;

import java.util.Scanner;

public class Q05_StringManipulation {
    public static void main(String[] args) {
        //kullanıcıdan ismini ve soyismini girmesini isteyin, sonrasında tam ismini konsola büyük harfle yazdırın

        Scanner scann=new Scanner(System.in);
        System.out.println("lutfen isim giriniz:");
        String isim=scann.nextLine();
        System.out.println("soyisim gir");
        String soyisim=scann.nextLine();

        String fullname=isim.concat(" "+ soyisim).toUpperCase();


        System.out.println("fullname = " + fullname);




    }
}
