package day05_matametikselIşlemler;

public class C02_Pre_Post_Increment {
    public static void main(String[] args) {

        int sayi=10;

        System.out.println("pre_increment="+  ++sayi);   //bu satırda iki işlem var 1-artırma 2-yazdırma
                                                            // sayı 10 önce artırır 11 olur yazdırır
                                                            //sayi'nın yeni değeri 11 olur


        System.out.println("post_increment=" +   sayi++);  // iki işlem var  1-yazdırma  2-artırma
                                                            //sayıyın mevcut değerini yazdıracak "11" sonra bir artıracak

        System.out.println("post_increment'den sonra= "+ sayi); // artık sayı 12 olacak

        /* aradaki fark ikisindede sayı 1 artacak
        pre increment'te sayıyı artırıp yazıracak yeni değeri o olacak
        post incrementte yazdıracak sonra değeri atayacak
         */

        int a=2;
        int b=++a;                // a'yı bir artırıp b'yede atayıp yazdırdı yeni değeri oldu
        System.out.println(b);   //3
        System.out.println(a);   //3

       int c=2;
       int d=c++;                 // önce c'nin mevcut değrini d' ye atadı ve yazırdı sonra c'yi bir artırdı
        System.out.println(d);   //2
        System.out.println(c);  //3

        int e=5;
        int f=--e;
        System.out.println(f);  //4
        System.out.println(e);  //4

        int t=5;
        int y=t--;
        System.out.println(y);    //5
        System.out.println(t);    //4


    }
}
