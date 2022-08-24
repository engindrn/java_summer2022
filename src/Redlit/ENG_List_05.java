package Redlit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ENG_List_05 {
    /*
  Write a program that accepts an integer as input
  and prints first 10 prime numbers greater
  than input Check numbers if they are even or not in a return method.

Input : 5

Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]


Bir tamsayıyı girdi olarak kabul eden ve girdiden büyük ilk 10 asal sayıyı ekrana yazdıran bir program yazınız.


   */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen asal sayi dizisi icin bir baslangic sayisi giriniz");
        int sayi = scan.nextInt();
        asalListDondur(sayi);
    }

    private static void  asalListDondur(int sayi) {
        List<Integer> asalList = new ArrayList<>();


        for (int i=sayi+1; i>0; i++) { //i sayidan sonsuza dogru gitmesi icin
            int bolum;
            for (bolum=2; bolum<=i; bolum++) {

                if (i%bolum==0)
                    break; //yeni bir sayıya geç
            }

            //gözcü kontrolüne hiç takılmadan çıkan sayı asal sayıdır
            if (bolum == i) {
                asalList.add(i);
            }

            if (asalList.size() == 10) {
                break;
            }
        }
        System.out.println(asalList);

    }

}

