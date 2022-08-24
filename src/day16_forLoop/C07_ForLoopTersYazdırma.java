package day16_forLoop;

import java.util.Scanner;

public class C07_ForLoopTersYazdırma {
    public static void main(String[] args) {

        Scanner scann=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String str =scann.nextLine();



        for(int i=str.length()-1; i>=0;i--) //i'yi kelime uzunluğu kadar tanımlıyoruz.
        {
            System.out.print(str.charAt(i));

        }

    }
}
