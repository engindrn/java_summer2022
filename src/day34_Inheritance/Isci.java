package day34_Inheritance;
public class  Isci extends Personel{
    /*
    Normal hayatimizda parent cocuk sahibi olmaya karar verebilir
    Java'da ise child class'lar ozelliklerini inherit etmek istedikleri
    class'i kendilerine parent edinirler.

    mesela isci class'ini olusturunca nelere ihtiyaci var diye dusunsek
    Personel class'indaki tum variable ve method'lara ihtiyaci
    oldugunu gorebiliriz.

    BU durumda yeniden o variable ve method'lari olusturmak yerine
    Personel class'ini kendimize parent ediniriz

    Bir class'i parent edinmek icin extends keyword kullanmaliyiz
    bir class baska bir class'i parent edindiginde
    1- parent class'daki tum ozelliklere (variable + method) otomatik olarak sahip olur
    2- Parent class'daki ozelliklerden bazilarini kendine uyarlayabilir
    3- Parent class'da olmayan bazi yeni ozellikler olusturabilir/method-variable

    not: parent class'daki ozelliklerden hicbirini reddedemez ama degistirebilir
    kullanmasakta oluşturduğumuz objede parent ın tüm özellikleri vardır
     */

    int persNo=1001;

    public static void main(String[] args) {
        Isci isci1=new Isci();   //şimdiye kadar farklı classların ismiyle oble oluşturup oraya ulaştık
                                //burdada personel classında obje oluşturup oraya ulaşıp personel oluşturabiliriz
                                //ama  biz personel oluşturmak istemiyoruz biz işçi classından işçi oluşturuyoruz
                                //bu yüzden obje ismi kendi classımızın ismi olur

        System.out.println(isci1.isim); //Isim belirtilmedi
                                       // kendi class'imizda isim variable yok, onun icin parent'a gideriz

        isci1.isim="Selim";    //isme atama yaptık
        System.out.println(isci1.isim);//Selim

        System.out.println(isci1.persNo); // 1001 kendi class'imizda varsa onu kullaniriz. instance değer olarak yukarda

        isci1.maas(); // Isciler minumum 15 euro saat ucreti alir.
    }

    //isci class ının maaşını spesifikleştirmek istersek bu classda aynı isimde bir maas methodu oluştururuz

    public void maas(){
        System.out.println("Isciler minumum 15 euro saat ucreti alir");
    }
    public void ozelSigorta(){
        System.out.println("Iscilerden isteyene %50 indirimli ozel sigorta yaptirilir");
    }
}


//personel numarasını ve maaş durumunumu kendimize göre bu classda değiştirdik
//   persNo için instance bir variable oluşturup obje ile kendi clasımızda özelleştirdiğimiz halini kullandık
//   maas durumu için parent class daki genel olduğu için kendi clasımızda aynı isimde method oluşturarak özelleştirdik
//   son olarak parent classdan bağımsız kendimize ait methodlarımız ve variable larımız olabilir
//  ozelSigorta methodu oluşturduk sadece iscilere yapılmış bir sigorta olarak düşünülebilinir