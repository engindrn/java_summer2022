package Wday06_Practice;

import java.util.Scanner;

public class Q02_WhileLoop {
    public static void main(String[] args) {

        /*girilen bir sayiya kadar olan sayılardan sadece tek olanları ekrana yazdırınız
        girilen sayi dahil (tek ise)
         */

        Scanner scann =new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi=scann.nextInt();

        int count=0;

        while (sayi>0){
            if(sayi%2==1){
                System.out.println(sayi);
                count++;
            }
            sayi--;
        }
        System.out.println("count: "+count);

    }
}
