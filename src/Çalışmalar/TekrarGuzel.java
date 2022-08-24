package Çalışmalar;

import java.util.Scanner;

public class TekrarGuzel {

    public static void main(String[] args) {
        //Soru6 Kullanicidan bir sifre girmesini isteyin Asagidaki sartlari sagliyorsa “Sifre
        //basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin”
        //yazdirin
        //Ilk harf buyuk harf olmali
        //Son harf kucuk harf olmali
        //Sifre bosluk icermemeli
        //Sifre uzunlugu en az 8 karakter olmali

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen şifrenizi giriniz");
        String sifre = scan.nextLine();

        boolean ilkHarfKontrol = sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z';
        boolean sonHarfKontrol = sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z';
        boolean spaceKontrol = !sifre.contains(" ");
        boolean uzunlukKontrol = sifre.length() >= 8;

        if (ilkHarfKontrol && sonHarfKontrol && spaceKontrol && uzunlukKontrol) {
            System.out.println("Sifre basari ile tanimlandi");
        } else {
            System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");

        }
    }
}