package day46_maps;
import java.util.*;
public class C01_Maps {

    public static void main(String[] args) {

        Map<Integer,String> sinifList = new HashMap<>();

        sinifList.put(101,"Ali, Can, JDev");
        sinifList.put(102,"Enes, Cem, Tester");
        sinifList.put(103,"Taha, Emre, JDev");
        sinifList.put(104,"Derya, Deniz, Tester");

        System.out.println(sinifList);
        // {101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Tester}

        System.out.println(sinifList.keySet()); // [101, 102, 103, 104]

        System.out.println(sinifList.values());
        // [Ali, Can, JDev, Enes, Cem, Tester, Taha, Emre, JDev, Derya, Deniz, Tester]

        System.out.println(sinifList.values().size()); // 4  String valuemiz var





        // tum ogrencilerin isim ve soyisimlerini sira no ile alt alta yazdirin

        Collection<String> tumValueColl =sinifList.values();  //Values methoduyla value leri döndürdüğünde (yukarda yazdırdığımızda)
                                                             // bize bir collections olarak döndürür bu yüzden bu valuelerle işlem
                                                            //yapmak istiyorsakb sadece value leri alıp bir collectiona atamamız lazım

        String[] eachArr;             //loop içerinide her bir value buna atayacağız split  yapıp

        int sira=1;

        for (String each : tumValueColl
        ) {
            // buradaki each bize her bir ogrenciye ait
            // ayni yapidaki isim, soyisim, brans bilgilerini iceren String'ler getiriyor

            eachArr= each.split(", ");
           // System.out.println(Arrays.toString(eachArr));[Ali, Can, JDev]-[Enes, Cem, Tester]-[Taha, Emre, JDev]-[Derya, Deniz, Tester]
            //bunların herbiri bir ellemnt bunların içine ulaşmanın en iyi yolu split methoduy üstteki hale dönüştürmek.indexi al
            //collectiondan split methodunu uygulayarak array a atadığımız String valuelerin her birinin 0 ve 1. elemenetlerini yazdıracağız

            System.out.println(sira + "- " + eachArr[0] + " " + eachArr[1]);                   
            sira++;
        }


        // Map'de bulunan ogrencilerin, isim ve soyisimlerini birlestirerek
        // bir sinif listesi olusturun
        //not: yukarda yaptığımız işlemler atama olmadığı için for each loop un içinde olan for each loopun kaldı
        //tekrar value lerimize ulaşmak istiyorsak aynı işlemleri yapmalıyız

        List<String> sinifIsimSoyisimList= new ArrayList<>();    //bir arrayList olusturduk

        for (String each : tumValueColl
        ) {
            eachArr=each.split(", ");
            sinifIsimSoyisimList.add(eachArr[0] + " " + eachArr[1]);
        }
        System.out.println(sinifIsimSoyisimList);
    }
}