package Çalışmalar;

import java.util.Scanner;

public class İfStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();


        sayi = sayi % 2;

        if (sayi == 0) {
            System.out.println("sayi" + " " + "çifttir");
        } else {
            System.out.println("tektir");
        }
    }
    }
