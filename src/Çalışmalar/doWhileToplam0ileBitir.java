package Çalışmalar;

import java.util.Scanner;

public class doWhileToplam0ileBitir {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sayi;
        int sayac = 0;
        int toplam = 0;

        do {
            System.out.print("Bir sayi giriniz: ");
            sayi = scan.nextInt();
            toplam += sayi;
            sayac++;
        }
        while(sayi != 0);

        System.out.println("Girdiğiniz " + sayac + " tane sayının toplamı = " + toplam);
    }
}