package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        //bir önceki soruyu tek seferde kullanıcıdan tum bilgileri alarak yapiniz

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen adinizi,soyadinizi,yasinizi giriniz \naralarda enter tusuna basınız");
                                                          //alt satıra geçmek için \n kullanılır
        String ad=scan.nextLine();
        String soyad=scan.nextLine();





        System.out.println("girilen bilgiler=" + ad + soyad );
        
    }
}
