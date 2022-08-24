package day26_constructor;
public class Ogretmen {
    String isim="Isim belirtilmedi";             //bunları default olarak biz atadık
    String soyisim= "Soyisim belirtilmedi";
    String dogumTarihi="Tarih girilmedi";
    String brans="Brans belirtilmedi";
    String yanBrans="Yan brans belirtilmedi";

    public Ogretmen() {                 //biz bu classı yine kalıphane olarak kullanacağız ve birden fazla parametreli
    }                                 //parametresiz contructorlar üreteceğiz bu sebeple javanın parametresiz default
                                    //contructor u öleceğinden biz peşinen oluşturuduk


    public Ogretmen(String isim, String soyisim, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyisim = soyisim;                       //bütün özellikleri barındıran constructor ürettik
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;

    }
    public Ogretmen(String isim, String soyisim, String dogumTarihi) {
        this.isim = isim;
        this.soyisim = soyisim;                         //üç parametreli
        this.dogumTarihi = dogumTarihi;
    }


    @Override                                                 //bir tanede toString methodu koyduk
    public String toString() {                              //yazdırırken her seferinde uğraşmamak için bu methodu koyduk
        return                                              //girilsede girilmesede bütün özelikleri seçtik düzenleme yaptık
                "\nisim : " + isim +
                        "\nsoyisim : " + soyisim +
                        "\ndogumTarihi : " + dogumTarihi +
                        "\nbrans : " + brans +
                        "\nyanBrans : " + yanBrans ;
    }
}