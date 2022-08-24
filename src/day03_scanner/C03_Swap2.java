package day03_scanner;

public class C03_Swap2 {
    public static void main(String[] args) {

        // bir önceli swap sorusunu boş kova kullanmadan yapın

       int sayı1 = 10;
       int sayı2 = 20;

       sayı2= sayı2-sayı1;
       sayı1=sayı1+sayı2;


        System.out.println("sayi1 :"+ sayı1);
        System.out.println("sayi2 : "+ sayı2);
    }
}
