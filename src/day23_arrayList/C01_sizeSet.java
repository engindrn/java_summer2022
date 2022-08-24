package day23_arrayList;
import java.util.ArrayList;
import java.util.List;
public class C01_sizeSet {

    public static void main(String[] args) {

        List<Integer> sayilar1 = new ArrayList<>();

        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        System.out.println("Listenin boyutu : " + sayilar1.size());  //Listenin boyutu : 3

        sayilar1.add(2);

        sayilar1.addAll(sayilar1);    //sayilar1 'e tekrar sayılar1'in hepsini ekledik ekledik

        System.out.println(sayilar1); // [5, 3, 2, 2, 5, 3, 2, 2]

        System.out.println("Listenin yeni boyutu : " + sayilar1.size());   //Listenin yeni boyutu : 8

        sayilar1.set(2,8);     //indexi 2 olanı 8 yap dedik

        System.out.println(sayilar1); // [5, 3, 8, 2, 5, 3, 2, 2]

        System.out.println(sayilar1.set(0,12)); // 5        ***** set komutunu println içinde çalıştırınca hem sildiği
                                                            //elemenı yazdırır hemde arka planda işlemi yapar
                                                            //ve 0'ıncı indexe 12 yi ekler

        System.out.println(sayilar1); // [12, 3, 8, 2, 5, 3, 2, 2]
        /*
         set method'u istenen index'deki eski elementi silip,
          yerine verdigimiz yeni elementi set eder.


          eger eski elementi silmek istemiyorsak,
          add(index,deger) method'unu kullanabiliriz

          set() sildigi eski elementi de bize dondurur
         */
    }
}