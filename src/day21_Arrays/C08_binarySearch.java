package day21_Arrays;
import java.util.Arrays;
public class C08_binarySearch {
    public static void main(String[] args) {
        /*
         Binary search java da eleman aramanin kisa yoludur
         Ancak binary searc'un calismasi icin once
         array'in sirali hale getirilmesi gerekir
         Eger siralama yapmadan binarySearch yaparsaniz
         sonucu bulamayabilir veya yanlis bulabilir
         */
        String[] harfler= {"Y", "B", "D", "G", "O","A"};
        String arananHarf="Y";

        System.out.println(Arrays.binarySearch(harfler,arananHarf));//-7

        System.out.println(C03_Contains.contains(harfler,arananHarf));//true  //C03 deki methodu kullandık

        // binarySearch bize aradigimiz elemanin index'ini dondurur
        // array sirali olmadigi icin arama sonucunu dogru bulamayabilir
        // emin olmak icin once sort yapmaliyiz
       //int değer döndüreceği için sout olarak direk yazdırırız

        Arrays.sort(harfler);

        System.out.println(Arrays.toString(harfler));   //[A, B, D, G, O, Y]  artık sıralı

        System.out.println(Arrays.binarySearch(harfler,arananHarf)); //5  aranan y harfi index 5 de

        System.out.println(C03_Contains.contains(harfler,arananHarf));//true
                                                                    //C03 deki methodu kullandık boolean değer döndü

    }
}

