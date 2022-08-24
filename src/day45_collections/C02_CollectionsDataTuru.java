package day45_collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class C02_CollectionsDataTuru {

    public static void main(String[] args) {
        /*
          Collections <dataTuru> nu Object secmeniz durumunda
          Collection'a farkli data turlerinden objeler koymaniza izin verir
          Bu depolama acisindan bize esneklik saglar. depolayıp yazdırmada sorun olmaz
          Ancak islem yaparken tum objeleri Object olarak tanimladigimizdan
          cok fazla casting yapmamiz gerekebilir sorun çıkabilir
         */
        List<String> liste = new ArrayList();  //list imiz Stringlerden oluştuğu için farklı data türü ekleyemeyiz
        // liste.add(5);
        //liste.add('s');
        // liste.add(true);

       // List list = new ArrayList();          //bu şekildede oluşturunca java Object kabul eder alttaki ile aynı
        List<Object> list = new ArrayList();
        list.add(5);
        list.add('s');
        list.add(true);
        list.add("Ali");

        System.out.println(list); // [5, s, true, Ali]

        list.set(0,(Integer)list.get(0)+5);     //data türümüz artık obje old içn kabul etmedi bizde işlem yapmak istediğimzi
                                                //elemanın data türünü yazıp casting yaptık

        list.set(3,list.get(3)+" Can");   //String için sorun olmadı

        list.set(2,!(Boolean)list.get(2));

        System.out.println(list);    //[10, s, false, Ali Can]

        Set<Object> set1= new HashSet<>();
        set1.add(5);
        set1.add(true);
        set1.add('5');
    }
}
