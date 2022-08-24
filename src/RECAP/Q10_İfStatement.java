package RECAP;

import java.util.Scanner;

public class Q10_İfStatement {

    public static void main(String[] args) {


        /* kullanıcıdan Y/N ikilisinden birini girdiğinde girdiği değeri ekranda yazdıran java kodunu giriniz*/
        //Input= Y/N
        //OUTPUT= YES NO

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen Y veya N harflerinden birini giriniz giriniz");
        char harf=scan.next().charAt(0);


        if(harf=='Y'|| harf=='y') {
            System.out.println("yes");
        } else if (harf=='N'|| harf=='n') {
            System.out.println("no");

        }else System.out.println("yanlış giriş yaptınız");


    }

    }