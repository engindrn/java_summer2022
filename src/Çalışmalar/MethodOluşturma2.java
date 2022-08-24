package Çalışmalar;

public class MethodOluşturma2 {public static void main(String[] args) {

        /*input olarak verilen satıs fiyatı, musteri kartı varmı? ve uyeligi kac yıllık? bilgilerini değerlendirip
        uye degilse: %5 indirim
        uyeligi var ama 5 yıldan az ise %10 indirim
        uyeligi var ve 5 yıldan fazla ise %15 indirim uygulayıp
        asıl fiyatı, indirim miktarını ve indirimli fiyatını yazdıran bir method oluşturun.
         */

    boolean uyeMi=true;
    int uyelikYili=3;
    double satısFiyati=250;

    indirimliFiyatHesapla(uyeMi,uyelikYili,satısFiyati);

}
    public static void indirimliFiyatHesapla(boolean uyeMi, int uyelikYili, double satısFiyati) {


        if (uyeMi) {                                                              //nested if*******
            if (uyelikYili < 5) {
                System.out.println("urun fiyatı :" + satısFiyati);
                System.out.println("indirim miktari :" + (satısFiyati * 0.1));
                System.out.println("indirimli fiyat :" + (satısFiyati - satısFiyati * 0.1));
            } else {
                System.out.println("urun fiyatı :" + satısFiyati);
                System.out.println("indirim miktari :" + (satısFiyati * 0.15));
                System.out.println("indirimli fiyat :" + (satısFiyati - satısFiyati * 0.15));
            }


        } else {
            System.out.println("urun fiyatı :" + satısFiyati);
            System.out.println("indirim miktari :" + (satısFiyati * 0.05));
            System.out.println("indirimli fiyat :" + (satısFiyati - satısFiyati * 0.05));


        }
    }
}