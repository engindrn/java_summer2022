package day15_overloading_forLoop;

public class C01_ReturnMethod {
    public static void main(String[] args) {

        //verilen iki sayiyi carpıp sonucu bize dondüren bir method oluşturun

        int sayi1=10;
        int sayi2=5;

        int sonuc=carpGetir(sayi1,sayi2);            //methodun ismini argumanti giriyoruz
                                                     // sayı1 ve sayi2 yı methoda gönderecez yazılan kodla gerekli hesaplama
                                                     //yapılacak sunucu bize diödürecek
                                                             //return edilen şeyin mutlaka bir variable atamalıyız
                                                            // veya yazdırmalıyız

        System.out.println(sonuc);


    }

    public static int carpGetir(int sayi1, int sayi2) {

       //int sonuc=sayi1*sayi2;     //da olabilir
        //return=sonuc;

        return sayi1*sayi2;
    }
}
