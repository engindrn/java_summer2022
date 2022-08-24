package day28_staticBlock;
public class C03_PassByValue {
    public static void main(String[] args) {
        /*
          %25 indirimli fiyati hesaplayip bize donduren bir method olusturun
         */
        double satisFiyati = 100;
        double indirimOrani = 60;

        double indirimliFiyat = indirimliFiyatHesapla(satisFiyati, indirimOrani);

        System.out.println("indirimli fiyat : " + indirimliFiyat);
        System.out.println("indirimli fiyat : " + indirimliFiyat);
        System.out.println("indirimli fiyat : " + indirimliFiyat);
        System.out.println("indirimli fiyat : " + indirimliFiyat);
    }

    public static double indirimliFiyatHesapla(double satisFiyati, double indirimOrani) {  //burdakiler main method
        double indirimliFiyat = satisFiyati * (1 - indirimOrani / 100);                 //dakiler değil takibi kolay
        return indirimliFiyat;                                                        //olması için aynı isimdeki
    }                                                                               //kopyalarıdır.
}                                  //farklı isimde de olabilir java data type ına bakar
                                // value sini gönderir diyebiliriz
                            //artık bu method da yapcağımız değişiklikler bu variable ları bağlar main method dakileri
                          //artık bağlamaz değerleri aynı kalır