package day23_arrayList;
import java.util.ArrayList;
import java.util.List;
public class C02_set {
    public static void main(String[] args) {
        /*
          elimizde urunlerin bulundugu bir liste var
          urun listesindeki istenen siradaki urunu
          istegimiz yeni urunle degistirip
           eski urunu, varolan eski urunler listesine ekleyelim
         */

        List<String> urunler= new ArrayList<>();

        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        List<String> eskiUrunler= new ArrayList<>();

        // listedeki ikram'in yerine biskrem koyalim,
        // ikram'i da eski urunler listesine ekleyelim

        String yeniUrun="Biskrem";
        String silinecekUrun="Ikram";

        int temp=urunler.indexOf(silinecekUrun); //1        //silinecek ürünün indexsini arıyoruz kullanabilmek için
                                                        // ve int döneceği için int temp variable ına ekliyoruz

        String silinenUrun=urunler.set(temp,yeniUrun);   //1. indexdeki silinecek ürün olan ikramı yeniUrun ile
        eskiUrunler.add(silinenUrun);                   // değiştir ve ikramı silinenUrun variable ına ekle dedik

        System.out.println("urunler listesi : " + urunler);   //urunler listesi : [Nutella, Biskrem, Cekirdek, Cay]
        System.out.println("eski urunler listesi : " + eskiUrunler);   //eski urunler listesi : [Ikram]

        yeniUrun="Kahve";
        silinecekUrun="Cay";

        temp=urunler.indexOf(silinecekUrun);   //3 indexi aldık
        silinenUrun=urunler.set(temp,yeniUrun);   // 3. indexdeki ile yeniUrunu (kahve) set ettik

        eskiUrunler.add(silinenUrun);

        System.out.println("urunler listesi : " + urunler);         // [Nutella, Biskrem, Cekirdek, Kahve]
        System.out.println("eski urunler listesi : " + eskiUrunler);   //[Ikram, Cay]

        yeniUrun="Findik";
        silinecekUrun="Cekirdek";

        temp=urunler.indexOf(silinecekUrun);
        silinenUrun=urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("urunler listesi : " + urunler);        //[Nutella, Biskrem, Findik, Kahve]
        System.out.println("eski urunler listesi : " + eskiUrunler);    //[Ikram, Cay, Cekirdek]
    }
}