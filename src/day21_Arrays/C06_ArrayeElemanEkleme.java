package day21_Arrays;
import java.util.Arrays;
public class C06_ArrayeElemanEkleme {

    public static void main(String[] args) {

        // C05 deki method'u kullanarak array'e eleman ekleyelim

        String [] takimListesi={"Suleyman", "Osman"};
        String eklenecekIsim="Talha";

        takimListesi= C05_ArrayeElementEkleme.elemanEkle(takimListesi,eklenecekIsim);

        //C05 deki elemanekle methodunu kullanarak yaptık
        //ya atama yapmamız gerekir yada direk yazdırmamız gerekirdi biz atama yapıp yazdırdık- takimlistesi

        System.out.println(Arrays.toString(takimListesi));
    }
}
