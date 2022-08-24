package day24_arrayLists_ForEachLoop;

import java.util.Arrays;

public class C09_ForEachLoopKarakterYazdırma {


        public static void main(String[] args) {

            //bir string olusturun,bu string'deki character'leri for-each loop kullanarak yazdirin
            //ip ucu:split()

            String arr1[]={"ali","ayse","veli","ahmet","mehmet"};
            String hece="";

            for (String each:arr1
            ) {
                hece+=each;
                arr1=hece.split("");

            }
            System.out.println("characterler = " + Arrays.toString(arr1));
        }
    }

