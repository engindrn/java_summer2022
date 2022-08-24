package Redlit;

import java.util.ArrayList;
import java.util.List;

public class ENG_List_09 {
    /*
    Write a Java program to get a String from user as input
    and find the maximum occurring character in that string.(Ignore case sensitivity).

    Input : Learning java is easy

    Output: maximum occurring character is : a

    Kullanıcıdan girdi olarak bir String alacak bir Java programı yazın
    ve o karakter dizisinde oluşan maksimum karakteri bulun.
    (Büyük/küçük harf duyarlılığını yoksayın).
     */

    public static void main(String[] args) {
        String cumle = "Learning java is easy";

        List<String > list = new ArrayList<>();

        //listeye elemanlari ekleyelim
        for (String each :cumle.split("")) {
            list.add(each);
        }
        //System.out.println(list);


        int sayac = 0; // ic loopta tekrar eden harf sayisini toplamak icin
        int harfsayisi = 0;  //bir harfin kac defa tekrar ettigini bulmak icin
        int getindex = 0;  //en cok tekrar eden harfi getirmek icin

        for (int i = 0; i <list.size() ; i++) {
            sayac=0;
            for (int j = 0; j <list.size() ; j++) {
                if (list.get(i).equalsIgnoreCase(list.get(j))){
                    sayac++;
                }
            }
            if (sayac > harfsayisi) {
                harfsayisi = sayac;
                getindex = i;

            }
        }
        System.out.println("maximum occurring character is : "
                + list.get(getindex) + " ,toplam "+ harfsayisi +" adet vardir");
    }
}

