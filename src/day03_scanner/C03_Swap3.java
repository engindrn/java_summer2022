package day03_scanner;

public class C03_Swap3 {
    public static void main(String[] args) {

        int sayı1=  10;
        int sayı2=  20;

        sayı1= (sayı1 + sayı2) - sayı1;
        sayı2= (sayı1+sayı2)/4;

        System.out.println("sayi1="+ sayı1);
        System.out.println("sayi2="+ sayı2);
    }
}
