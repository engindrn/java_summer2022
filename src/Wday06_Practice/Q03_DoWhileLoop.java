package Wday06_Practice;

import java.util.Scanner;

public class Q03_DoWhileLoop {
    public static void main(String[] args) {


        /* kullanıcıdan x girilene kadar "program calisıyor" yazın
        ve x girildiğinde ise "program bitti" yazan program yazınız
         */

        Scanner abc =new Scanner(System.in);
        String okunan="";

        do{
            System.out.println("harf giriniz");
            okunan=abc.next();
            System.out.println("program calisiyor");
        }while (!okunan.equalsIgnoreCase("x"));

        System.out.println("program bitti");
    }
}
