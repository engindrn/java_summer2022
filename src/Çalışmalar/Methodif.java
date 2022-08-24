package Çalışmalar;

import java.util.Scanner;

public class Methodif {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz");
        String isim = scan.next();

        int as = isim.indexOf("a");

        if (as == -1) {
            System.out.println("a yoktur");
        } else {
            System.out.println("a vardır");

        }

    }
}