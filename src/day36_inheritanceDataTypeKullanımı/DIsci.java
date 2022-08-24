package day36_inheritanceDataTypeKullanımı;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class DIsci extends BMuhasebe{
    protected int saatUcreti = 11;
    protected int gunlukMesai = 7;

    protected void maasIsci(){
        System.out.println("Isciler : " + (30*saatUcreti*gunlukMesai)+ " maas alir");
    }
    protected void ozelSigortaIsci(){
        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilir");
    }
    public static void main(String[] args) {

        BMuhasebe isc1 = new DIsci();     //data türü(class) muhasebe ama const. isci yani biz isci oluştururyoruz
                                          //burda iscinin calısan olarak muhasede classından özelliklerini alıyoruz
                                            //aramaya ordan başlar varsa alır yoksa parenta gider
        /*
          Bir obje olusturulurken
          Data turu ve constructor ayni class'dan ise
          direk o class'a gidiyorduk

          Eger data turu ve cons. farkli ise oncelikle
          Obje constructor'in oldugu class'in objesidir
          ancak, bizden istenen
          Isci class'indaki spesifik ozellikler degil
          Bir iscinin muhasebe classindaki
          tum calisanlarla beraber sahip oldugu
          genel ozellikleri yazdirir
         */
        System.out.println(isc1.gunlukMesai); // M 8        // bu classdan değil datatürünün olduğu classdan aldı
        System.out.println(isc1.saatUcreti); // M 10       // bu classdan değil datatürünün olduğu classdan aldı
        isc1.maas(); // M Personel minumum : 2400 maas alir     // bu classdan değil datatürünün olduğu classdan aldı
        isc1.ozelSigorta(); // M Isteyen calisanlara %50 indirimli ozel sigorta yapilir    //aynı şekilde
        isc1.sigorta(); // P
        System.out.println(isc1.isim); // P
        System.out.println(isc1.soyisim); // P
        System.out.println(isc1.departmant);// P




        APersonel isc2 = new DIsci();                    //data type Apersonel const. ı Dısci olan obje oluşturduk
                                                         //burdada bir isci oluşturuyoruz ve personelde olan özlellikleri aldık
                                                        //aramaya ordan başlar varsa alır yoksa parent olmadığı için CTE VERİR


        //System.out.println(isc2.gunlukMesai); // M 8      //personel clssında gunlukMesai yok CTE
        //System.out.println(isc2.saatUcreti); // M 10     //personel clssında gunlukMesai yok CTE
        //isc2.ozelSigorta(); // M Isteyen calisanlara %50 indirimli ozel sigorta yapilir     //personel clssında gunlukMesai yok CTE
        isc2.sigorta(); // P
        System.out.println(isc2.isim); // P
        System.out.println(isc2.soyisim); // P
        System.out.println(isc2.departmant);// P
        /*
         Eger Data turu olan class'da aradigimiz ozellik yoksa
         varsa onun parent'ina gidebilir
         ama child'a donus olmaz
         Aradigi ozelligi bulamazsa CTE verir
         */




        List<String> list1 = new LinkedList<>();
        Deque<String> list2= new LinkedList<>();
        Queue<String> list3= new LinkedList<>();



        /*
        Hepsi LinkedList olsa da
        list1 List gibi davranir
        list2 Deque gibi davranir
        List3 Queue gibi davranir
         */
    }
}