package Çalışmalar;

import java.util.Scanner;

public class BasamakSayısıBulma2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        int sayac = 0;

        while(sayi > 0) {
            sayi /= 10; // sayi = sayi / 10;
            sayac++;
        }
        System.out.println("Girdiginiz sayinin basamak sayisi = " + sayac);
    }
}
