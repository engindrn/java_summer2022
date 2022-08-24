package day46_maps;
import java.util.*;

public class ReusableMethods {
    public static Map<Integer, String> mapOlustur() {        //methodumuzu oluşturudk
        Map<Integer, String> sinifMap = new HashMap<>();
        sinifMap.put(101, "Ali, Can, JDev");
        sinifMap.put(102, "Enes, Cem, Tester");
        sinifMap.put(103, "Taha, Emre, JDev");
        sinifMap.put(104, "Derya, Deniz, Devops");
        sinifMap.put(105, "Enes, Can, Tester");
        sinifMap.put(106, "Taha, Deniz, JDev");
        sinifMap.put(107, "Derya, Cem, Tester");
        return sinifMap;
    }

    public static void tumValueSiraliYazdir(Map<Integer, String> ogrenciMap) {
        int sira = 1;
        for (String each : ogrenciMap.values()
        ) {
            System.out.println(sira + " - " + each);
            sira++;
        }
    }              //bu method birşey döndürmyecek sadece value ları sıralı olarak yazdırır

    public static List<String> isimSoyisimListesiOlustur(Map<Integer, String> ogrenciMap) {

        List<String> methoddakiList = new ArrayList<>();

        String[] eachArr;

        for (String each : ogrenciMap.values()
        ) {
            eachArr = each.split(", ");
            methoddakiList.add(eachArr[0] + " " + eachArr[1]);
        }
        return methoddakiList;

    }

    public static void bransOgrencisayisiYazdir(Map<Integer, String> sinifListMap) {
        // brans=bransdakiOgrenciSayisi

        Map<String, Integer> bransOgrSayiMap = new TreeMap<>();

        Collection<String> valuesCollection = sinifListMap.values();   //valuelerdeki istediğimizi almak için collection
        // oluşturup valueleri aldık[isim, soyisim, brans] şeklinde

        String[] valueArr;                                //herbir value yi parçalara bölmek için array oluşturup
        //loop içinde atama yapacağız. isim soyisim branş var ayırmamız lazım
        String brans;

        Integer bransdakiOgrSayisi;

        for (String each : valuesCollection                  //valuesCollection dan buraya Stringler gelecek/isim,soyisim,branş
        ) {
            valueArr = each.split(", ");                //burda kalıp olarak gelen value yi bölerek parçalara ulaşabileceğiz
            brans = valueArr[2];                              //ikinci indexdeki branşa ulaşıp daha önceden olş. veriable atadık

            // bransin bransOgrSayiMap'inde key olarak daha onceden eklenip eklenmedigini
            // kontrol etmeliyiz
            if (!bransOgrSayiMap.containsKey(brans)) {     //bransOgrSayİMap inde brans yoksa olmayan branlsarı ekledik
                bransOgrSayiMap.put(brans, 1);               //key imiz brans valuemiz sayi yani kaç adaet olduğu
            } else {
                bransdakiOgrSayisi = bransOgrSayiMap.get(brans);    //yukarda yoksa ekledik burda ise varsa value sini 1 artıracaz
                bransOgrSayiMap.put(brans, ++bransdakiOgrSayisi);
            }
        }
        System.out.println(bransOgrSayiMap);
    }

    public static void entryYazdir(Map<Integer, String> sinifListMap) {

        Set<Map.Entry<Integer, String>> sinifListEntrySeti = sinifListMap.entrySet();

        for (Map.Entry<Integer, String> entry : sinifListEntrySeti
        ) {
            System.out.println(entry);
        }
    }
}