package Çalışmalar;

import java.util.ArrayList;
import java.util.List;

public class ArrayElemanBulma {
    public static void main(String[] args) {
     /*   "Integer sayılardan oluşan bir diziyi parametre olarak alan  ve dizide 7 rakamı  var ise  "Boom!" ifadesini;
      aksi takdirde  "dizide 7 rakamı yok" ifadesini döndüren bir method oluşturun".

         Örnek çıktı:
                [1, 2, 3, 4, 5, 6, 7])➞ "Boom!"
                [8, 6, 33, 100] ➞ "dizide 7 rakamı yok"
                [2, 55, 60, 97, 86] ➞ "Boom!"

      */

        int[] dizi={1,2,3,4,5,6,};

        dizikontrolEt(dizi);

    }

    public static List dizikontrolEt(int[] dizi) {

        List<Integer> liste=new ArrayList<>();

        for (int i = 0; i < dizi.length; i++) {

            liste.add(dizi[i]);
        }

        if (liste.contains(7)){
            System.out.println("boom");

        }else {
            System.out.println("7 yok");
        }
        return liste;
    }
}