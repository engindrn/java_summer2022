package day24_arrayLists_ForEachLoop;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class C05_IstenmeyenleriSil {

    public static void main(String[] args) {

        // Soru 4) Verilen bir array’de istenmeyen harf iceren kelimeleri silip,
        // kalan elementleri yeni bir array yapin

        // bu  ve önceki gibi sorularda tek arrayle yapmak zor bu yüzden listen yardım alırız
        //bir list oluşturup istenmeyen harf içermeyen elmanları o liste koyacak
        // size belli olmadığı için direk array yapamayız

        String[] sehirler ={"Istanbul", "Ankara","Mersin","Konya","Kastamonu"};
        String istenmeyenHarf="r";

        List<String> kalanlar=new ArrayList<>();

        for (int i = 0; i < sehirler.length; i++) {
            if (!sehirler[i].contains(istenmeyenHarf)){   //sehirle istenmeyenharf icermiyorsa kalaml
                kalanlar.add(sehirler[i]);               //kalanlar a ekle
            }
        }
        //loop bittiginde istenmeyen harf icermeyen sehirler, listeye eklenmis olacak


        System.out.println(kalanlar);//[Istanbul, Konya, Kastamonu]


        // yeni bir array olusturup, listeyi ona aktaralim

        String[] kalanlarArrayi=new String[kalanlar.size()]; //uzunlukta kalanların size ı kadar

        for (int i = 0; i <kalanlarArrayi.length ; i++) {
            kalanlarArrayi[i]=kalanlar.get(i);
        }

        // sehirler array'inin yeni degerini atayalim

        sehirler=kalanlarArrayi;
        System.out.println("sehirler array'inin son hali : " + Arrays.toString(sehirler));
    }
}
