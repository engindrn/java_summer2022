package Çalışmalar;

import java.util.Scanner;

public class SwitchATM {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int bakiye = 1000;
        int islem,tutar;

        System.out.println("Bakiyeniz = " + bakiye);
        System.out.println("\n**** İŞLEMLER ****");

        System.out.println("1. Para Çekme");
        System.out.println("2. Para Yatırma");
        System.out.println("3. Bakiye Sorgulama");
        System.out.println("4. Kart İade");

        System.out.print("İsleminizi seçiniz: ");
        islem = scan.nextInt();

        switch(islem) {
            case 1:
                System.out.println("Bakiyeniz = " + bakiye);
                System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                tutar = scan.nextInt();
                if(tutar > 1000) {
                    System.out.println("YETERSİZ BAKİYE !!!");
                }
                bakiye -= tutar;  // bakiye = bakiye - tutar
                System.out.println("Yeni bakiyeniz = " + bakiye);
                break;
            case 2:
                System.out.println("Bakiyeniz = " + bakiye);
                System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                tutar = scan.nextInt();
                bakiye += tutar;
                System.out.println("Yeni bakiyeniz: " + bakiye);
                break;
            case 3:
                System.out.println("Bakiyeniz = " + bakiye);
                break;
            case 4:
                System.out.println("Kartınızı almayı unutmayınız.");
                break;

        }
    }
}