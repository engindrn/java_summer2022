package Çalışmalar;

import java.util.Scanner;

public class ForLoopFaktoriyel {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int faktoriyel = 1;
        int sayi;

        System.out.print("Bir sayı giriniz: ");
        sayi = scan.nextInt();

        for(int i = 1; i <= sayi; i++)
        {
            faktoriyel *= i;
            //System.out.println(i + "! = " + faktoriyel); // girilen sayıyı kadar olan faktoriyel
        }
        System.out.println(sayi + "! = " + faktoriyel);
    }
}