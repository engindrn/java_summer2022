package day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {

        // bir tamsayı,bir de char değişken oluşturun ve bunların toplamrını yazdırın

        int sayi = 10;
        char harf = 'a';
        String str = "banan";

        System.out.println(sayi + harf); //10a değil 107 oldu
        System.out.println(sayi * harf);  //10*97
        System.out.println(str + harf);  //banana
        System.out.println(harf + 2);    //a2 değil 99 yazar
        System.out.println(str + sayi);   //banan10
        System.out.println(str + sayi + harf);   //banan10a olur String güçlü

        /*
        1- char data türü işleme girdiği değişkenin türüne göre farklı davranabilir eğer matematiksel işleme girdiği
        variable sayısal bir değerse sayı gibi ddavranır.
        sayı+harf sayı variable'i int olduğundan harf variable'ı ascıı tablosundan 97 değerini kullanır.


        2- str+harf; //  banana String variable çok güçlüdür, hangi data türü ile işleme girerse girsin
        diğer data türünü kendine benzetir.
        System.out.println(str+sayi+harf);   //banan10a olur String güçlü

         */

        //peki  konsolda verilen variable 'ları kullanarak 10a görmek istersek nasıl yazdırabiliriz?
        //String'in gücünü devreye sokmamız lazım. "" (hiçlik) yazarak String olur


        System.out.println("" + sayi + harf); //10a

        char deger = '1';
        System.out.println(deger + harf);    //'1' + a = 146 olur ascıı değerleri 1=49 a=97
    }
}
