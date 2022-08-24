package Çalışmalar;

import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int temp=sayi;
        int basamakSayisi = 0;
        int kuplerinToplami = 0;
        while (temp > 0) {
            basamakSayisi = temp % 10;
            kuplerinToplami += (basamakSayisi * basamakSayisi * basamakSayisi);
            temp /= 10;
        }
        if (sayi==kuplerinToplami) {
            System.out.println("Sayi Amstrog sayidir");
        } else {
            System.out.println("Sayi amstrong sayi değildir");
        }
        System.out.println("Kuplerin Toplami : "+ kuplerinToplami);
    }
}
