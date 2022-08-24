package day04_dataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi1=128;
        byte sayi2= (byte) sayi1;

        System.out.println(sayi2);  //-128

        /*
        geniş data türündeki değeri dar data türündeki variable'a atamak isterseniz java sizin geniş data türündeki
        değerin, dar data türünün sınırlarına uyup uymayacağını çalıştırana kadar bilemez. risk almaz . riski 0'a
        indirmek için sorumluluğu almanızı bekler.
        Bunun için değerin önüne parantez içerisinde istediğimiz data türünü yazmamız yeterlidir

        bu riski üstlendiğimizde 3 durum oluşabilir;
        1- bizim değerimiz dar kalıp değerine uygun olursa hiçbir kayıp olmadan casting olur
        2- double bir sayıyı int'a cast etmek gibi durumlarda data kaybı oluşabilir
        3- geniş kalıptan değeri dar kalıba koyduğumuzda sınırları aşan durumlarda veri başkalaşabilir
         */

        double sayi3=9.78;
        int sayi4=(int)sayi3;

        System.out.println(sayi3);     //9.78
        System.out.println(sayi4);     //9


    }
}
