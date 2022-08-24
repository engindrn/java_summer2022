package day03_scanner;

import java.util.Scanner;

public class C08_ScannerIlkHarf {
    public static void main(String[] args) {

        //kullanıcıdan ismin alıp, ilk harfini büyük olarak yazdırın

       Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");

        /* java Scanner class'ında nextchar() methodu yoktur
        bunun yerinre String olarak alıp onun da ilk harfini alabiliriz  */

        //örn; char ilkHarf=scan.next().charAt(1)  (Engin)  n harfini alır çünkü indexler 0'dan başlar
        /* yada; char ilkHarf=scan.next().toLowercase().charAt(0)  e harfini küçük olarak alır çünkü önce
        toLowercase() metoduyla hepsini küçük harfe çevirdik */

        /* yada char ilkHarf=scan.next().toUppercase().charAt(1)  N olarak alırız çünkü nöce hepsini
        toUppercase() methoduyla büyük harf yapıp charAt() ile istediğimiz tek karakteri aldık*/

        char ilkHarf=scan.next().toUpperCase().charAt(0);



        System.out.println("ismin ilk harfi ="+ ilkHarf);

    }
}
