package day08_İfStatements;

import java.util.Scanner;

public class C06_ArtıkYıl {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yıl giriniz");
        int yil=scan.nextInt();

        if(yil%4 !=0) {
            System.out.println("artık yıl değil");
        }else if(yil%100 !=0 ) {
            System.out.println("artık yıl");
        }else if(yil%400 !=0){
            System.out.println("artık yıl değil");

        }else {
            System.out.println("artık yıl");
        }
    }
}
