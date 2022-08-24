package day09_ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        // kullanıcıdan bir sayı isteyin
        //sayi pozitifse yayiyi yazdırın
        //sayi sıfır veya negatifse, bir sayı daha isteyin ve ikiisinin çarpımını yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir  sayı giriniz");
        double sayi=scan.nextDouble();

        if(sayi>0){
            System.out.println(sayi);
        }
        else{
            System.out.println("lutfen bir sayi daha giriniz");
            double sayi2=scan.nextDouble();
            System.out.println(sayi2*sayi2);
        }
        /* eğer if else içerisinde yeni kodlar varsa ternary ile yapmak mümkün olmaz
           ternary ya tek sonuç yada daha önce aldığımız değerlere bağlı bi işlem olur.

         */




    }
}
