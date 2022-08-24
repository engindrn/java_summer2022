package day05_matametikselIşlemler;

import java.util.Scanner;

public class C03_RakamlarToplamıModulus {
    public static void main(String[] args) {

       //Kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen 4 basamaklı pozitif bir tamsayi giriniz");

        int sayi= scan.nextInt();    //5267

        int birlerBasamağı=0;     //soruyu çözmeye başlamadan önce ihtiyacımız olan konteynerları(variable)oluşturalım
        int rakamlarToplamı=0;
        int ilkGirilenSayi=sayi;  // ilk girilen sayı bu variable(konteynera) atanacak ve sabit kalacak i
                                  // htiyaç olursa kullanmak için

        //şuanda sayı 5267 birler basamağı=0 rakamlartoplamı=0

        birlerBasamağı=sayi % 10;            //7 yi aldık
        rakamlarToplamı+=birlerBasamağı;   // bulduğumuz 7'yi rakamlar toplamı konteynırımıza eklememiz lazım
                                            //önceden 0 dı artık 7+0=7 oldu

        sayi/=10;                   //sayıyı 10' a bölerek bulduğumuz ilk basamak olan 7' den kurtuluyoruz
                                    //şuanda sayı 526 bb=7  rt=7

        birlerBasamağı=sayi % 10;               //6
        rakamlarToplamı+= birlerBasamağı;        //7+6=13 oldu

        sayi/=10;                //6'dan kurtulduk
                                 //şuanda sayi 52  bb=6 rt=13

        birlerBasamağı = sayi % 10;               //2
        rakamlarToplamı +=birlerBasamağı;        //13+2=15

        sayi/=10;                  //2'den kurtulduk
                                    //şaunda sayi 5 bb=2  rt=15

        birlerBasamağı=sayi%10;            //5
        rakamlarToplamı+=birlerBasamağı;  //15+5=20

        sayi/=10;                //0

        //şuanda sayi 0 bb=5  rt=20

        System.out.println(ilkGirilenSayi+ " " + "sayinin rakamlar tolamı :" + rakamlarToplamı);












    }
}
