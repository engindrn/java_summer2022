package day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {

         /* 1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
        Orn     : sayi1=10 ve sayi2=20;
        kod calistiktan sonra
                sayi1=20 ve sayi2=10 */

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 0;               //sayı3 geçici kovamız
                                     //dinamik olduğu için her sayıda çalışır yer değiştirir

        sayi3 = sayi2;       //sayı2 yi boş kovaya koyunuz 10 20 20 oldu
        sayi2 = sayi1;        //birinci sayıyı ikinci sayıya ata 10 10 20 oldu
        sayi1 = sayi3;        //boş kovadaki sayıyı sayı1 e ata   20  10  20 oldu

        System.out.println("sayi1 =" + sayi1);   //20
        System.out.println("sayi2 =" + sayi2);   //10


    }
}
