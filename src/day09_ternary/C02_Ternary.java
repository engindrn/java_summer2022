package day09_ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
         //   soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin,
        //   negatifse  sayinin karesini yazdirin

        Scanner scann=new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz");
        double sayi=scann.nextDouble();

               // sayi>0 ? "sayi Pozitif"  : (sayi*sayi); bu şekilde olmaz ya variable atamalıyız yada yazdırmalıyız

        //eğer ternary içindeki sonuçlar farklı türlerdeyse atama yapamayız sadece yazdırabiliriz.

        // örn: double sonuc=    sayi>0 ? sayi ppozitif : (sayi*sayi)

        System.out.println(sayi>0?"sayi pozitif" : (sayi*sayi));


     }
}
