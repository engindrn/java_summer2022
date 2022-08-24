package day47_maps;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
public class C02_TekrarSayisiBulma {

    public static void main(String[] args) {

        // Verilen bir String'deki kullanilan harfleri
        // ve kullanilan harflerin tekrar sayisini
        // H = 20 seklinde yazdirin

        String str= "Heeeeellllooooo Woooorrrrllllllddddd.";

        // space'leri saymamasi icin once onlari yok edelim
        str=str.replaceAll("\\W","");

        String[] harflerArr=str.split("");

        System.out.println(Arrays.toString(harflerArr));
        // [H, e, e, e, e, e, l, l, l, l, o, o, o, o, o, W, o, o, o, o, r, r, r, r, l, l, l, l, l, l, d, d, d, d, d]


        // harfleri key, kullanim adedini value yaparak bir map olusturalim
        Map<String,Integer> harfKullanimsayilariMap= new TreeMap<>(); //key ler harf value ler sayi
        //not: mapde şuan için değerler yok biz aşağıda atama yapağız bu yüzeden arrayde olan elemanlara ulaşmak için
        //collection oluşturmamıza gerek yok. diğer soruda mapdeki value lere ulaşmak için collection oluşturup valuelerine
        // ulaşıp onunda indexlerine ulaşmak için arraya atamştık.
        Integer harfKullanimsayisi;

        for (String each: harflerArr                          //array den ilk harfi alddı geldi
        ) {
            if (!harfKullanimsayilariMap.containsKey(each)){  //harfKullanimsayilariMap each ile gelen harfi içermiyorsa
                harfKullanimsayilariMap.put(each,1);    //harfKullanimsayilariMap e ekle key each deki harf value şimdilik 1
            }else{
                harfKullanimsayisi=harfKullanimsayilariMap.get(each);     //get methodu key in değerini getirdi
                //bizde harf kullanım sayısı olrak atadık yani daha önce 4 e var ise değer olarak onu getirdi atadık
                harfKullanimsayilariMap.put(each,++harfKullanimsayisi);   //burdada var olan key in değerini 1 artırdık
                //yani harfKullanimsayilariMap inde daha önce değeri 4 olan e yi 5 yaptık
            }
        }
        System.out.println(harfKullanimsayilariMap);//{H=1, W=1, d=5, e=5, l=10, o=9, r=4}
    }
}
/* Arrayden harleri sırasıyla alıp loop içinde if  ile bakıyoruz map de bu harf yoksa daha önce eklenmemişse
 bu harfi value 1 olarak ekliiyoruz mape . if ile biz sadece her harften birtane aldık ve value olrak 1 yazdık
  yoksayı yukarda if ile hallettik ekledik burda ise varsa var olanı update etmesini istiyoruz*/