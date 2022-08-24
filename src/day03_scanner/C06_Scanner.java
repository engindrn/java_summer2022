package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan ismini soyismini ve yaşını alıp
        //girilen bilgiler = seyfi capar 34 şeklinde yazdırın

        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen adini giriniz");
        String isim =scan.nextLine();                    //String verileri scanner ile alırken
                                                         //scan.next() tek kelime alır
                                                         //scan.nextLine() birden fazla değer alır

        System.out.println("lutfen soyadiniz giriniz");
        String soyad= scan.nextLine();

        System.out.println("lutfen yaşınizi giriniz");
        int yas=scan.nextInt();

        System.out.println("girilen bilgiler ="+" "+isim+" "+ soyad+ " "+ yas);

    }
}
