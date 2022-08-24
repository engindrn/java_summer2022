package day09_ternary;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {
        //soru2 : Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” , buyuk harfse consola “Buyuk Harf”
       // yoksa “girdiginiz karakter harf degil” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);

        /*       String sonuc=(harf>='a' && harf<='z') ? ("kucuk harf") :
                ("buyuk harf veya geçersiz harf");   */

        String sonuc=(harf>='a' && harf<='z') ? ("kucuk harf") :
                      (harf>='A' && harf<='Z') ? ("buyuk harf") : ("geçersiz harf");

        System.out.println(sonuc);

        String sonuc2=harf>='a' && harf<='z'? "kucuk harf" :      //pazantezsizde karşımıza çıkabilir
                harf>='A' && harf<='Z' ? "buyuk harf" : "geçersiz harf";

        System.out.println(sonuc2);





    }
}
