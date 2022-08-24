package Çalışmalar;

public class MethodOlusturma {
    public static void main(String[] args) {

        /*input olarak verilen satıs fiyatı, musteri kartı varmı? ve uyeligi kac yıllık? bilgilerini değerlendirip
        uye degilse: %5 indirim
        uyeligi var ama 5 yıldan az ise %10 indirim
        uyeligi var ve 5 yıldan fazla ise %15 indirim uygulayıp
        asıl fiyatı, indirim miktarını ve indirimli fiyatını yazdıran bir method oluşturun.
         */

        boolean uyeMi=true;
        int uyelikYili=6;
        double satısFiyati=250;

       indirimliFiyatHesapla(uyeMi,uyelikYili,satısFiyati);

    }
    public static void indirimliFiyatHesapla(boolean uyeMi, int uyelikYili, double satısFiyati){

        double yuzdeBes=satısFiyati-(satısFiyati*0.05);
        double yuzdeOn=satısFiyati-(satısFiyati*0.1);
        double yuzdeOnBes=satısFiyati-(satısFiyati*0.15);

        if (uyeMi==false){
            System.out.print("%5 indirimli fiyat :"+yuzdeBes);
        } else if (uyeMi==true && uyelikYili<5) {
            System.out.print("%10 indirimli fiyat :"+yuzdeOn);
        }else if (uyeMi==true && uyelikYili>5){
            System.out.print("%15 indirimli fiyat :"+yuzdeOnBes+"\n"+"satis fiyati"+" "+satısFiyati+"" +
                                                   "\n"+"indirim miktari "+(satısFiyati-yuzdeOnBes));
        }

    }

}
