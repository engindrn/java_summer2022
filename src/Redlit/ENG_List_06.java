package Redlit;

import java.util.ArrayList;
import java.util.List;

public class ENG_List_06 {
    /*
    Write a program to find the common elements between two String Arrays
    (without case sensitivity)

Input1 : {John,Brad,Ange,Sofia,Emily}

Input2 : {sofia,brad,grace,emily,hazel}

Output : [sofia,brad,emily]


İki String Dizisi arasındaki ortak öğeleri bulan bir program yazın (büyük/küçük harf duyarlılığı olmadan)

     */

    public static void main(String[] args) {

        String [] input1={"John","Brad","Ange","Sofia","Emily"};
        String [] input2={"sofia","brad","grace","emily","hazel"};

        List<String> aynilist= new ArrayList<>();

        for (int i = 0; i <input1.length ; i++) {
            for (int j = 0; j <input2.length ; j++) {
                if (input1[i].equalsIgnoreCase(input2[j])) {
                    aynilist.add(input2[j]);
                }

            }
        }
        System.out.println(aynilist);
    }
}

