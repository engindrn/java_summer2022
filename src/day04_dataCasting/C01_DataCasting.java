package day04_dataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {
        char harf= 'a';
        //char yiniHarf= harf+1;  //kod bu durumda önce sağdaki işlemi yapar
                                 //char yeniHarf= 97+1 yani 98 yapar
                                // char bir variable 98 olamayacağı için java hata verir
        char yeniHarf= (char)(harf+1);  // 98 'in ascıı karşılı olan b 'yi yapyık
        System.out.println(yeniHarf);



                                //eşitliğin sağına parantez açıp hangi veri tipinde istiyorsak yazarız
                                 //bazen variable'a oluşturulduğu data tipinden farklı değer atanabilir
                                //bunlardan bazısını java otomatik kabul eder

        /* java eğer değer atamasında sorun oluşacağını (data kayıpları veya datanın başkalaşabileceği)
        görürse bu durumda otomatik olarak atamayı kabul etmez sizden sorumluluğu almanızı bekler*/

        int sayi1=(int)7.3;
        System.out.println("sayı1:"+ sayi1);   //7  küsüratı atar. 7 olarak yazdırı veri kaybı olur.

       double sayi2=10;
        System.out.println("sayı:"+ sayi2);  //10.0

       int sayi3='c';
        System.out.println("sayi3:"+ sayi3);   //99

       char harf2=98;
        System.out.println("harf2: "+harf2);    //b



    }
}
