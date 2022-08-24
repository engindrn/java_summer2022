package day17_NestedForLoop;

import java.util.Scanner;

public class C04_NestedForLoop {
    public static void main(String[] args) {
       /* verilen input a göre * lardan oluşan bir üçgen olusturun
        örn: input:4

        *
        * *
        * * *
        * * * *

         */

        Scanner scann=new Scanner(System.in);
        System.out.println("lutfen ucgenin kaç satır olacağını girin");
        int input=scann.nextInt();

        
        for (int i = 1; i <=input ; i++) {       //
            for (int j = 1; j <=i ; j++) {       //
                System.out.print("* ");
                
            }
            System.out.println("");

        }

    }
}
