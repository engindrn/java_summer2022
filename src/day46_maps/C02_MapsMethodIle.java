package day46_maps;
import java.util.List;
import java.util.Map;
public class C02_MapsMethodIle {

    public static void main(String[] args) {

        //ReusableMethods.mapOlustur();    class ismimizle ordaki methodu çağırdıd ama kalıcı olarak gelen bilgileri alıp
        //bu classa ait hale getirip kullanbilmemiz için bu class için bir map oluşturup atama yapıypruz.aynı isimde olabilir

        Map<Integer,String> ogrenciMap =ReusableMethods.mapOlustur();
        System.out.println(ogrenciMap);//{101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Tester}



        // value'lari sira numarali olarak yazdirin
        ReusableMethods.tumValueSiraliYazdir(ogrenciMap);     //o classdaki olan bir methodu da çağırabiliriz yoksa burdan
                                        //class ismini-methodismini-argümentimizi yollayıp orda bir method oluşturabilirz
                                        //



        // Isim ve soyisimlerin birlikte olacagi bir liste olusturun
        List<String> sinifisimsoyisimList= ReusableMethods.isimSoyisimListesiOlustur(ogrenciMap);
        //methodumuz bir list döndüreceği için bir list oluşturduk ve kalıcı olamsı için atama yaptık

        System.out.println("isim soyisim listesi : " + sinifisimsoyisimList);
        //isim soyisim listesi : [Ali Can, Enes Cem, Taha Emre, Derya Deniz]





    }
}
