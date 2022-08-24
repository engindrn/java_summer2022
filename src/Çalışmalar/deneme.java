package Çalışmalar;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        int sayilar[] = {1551, 1223, 1443, 1267, 1789, 1023, 2020};

        Scanner scann = new Scanner(System.in);
        System.out.println("deger giriniz");
        int deger = scann.nextInt();
        boolean sonuc = false;

        for (int i = 0; i < sayilar.length; i++) {
            if (deger == sayilar[i]) {
                sonuc = true;
            }
        }
        if (sonuc) {
            System.out.println("**true**");
        } else {
            System.out.println("**false**");
        }
    }
}