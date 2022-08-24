package Redlit;

import java.util.ArrayList;
import java.util.List;

public class ENG_List_07 {
    /*
    write a Java program to removes a specific element from an array and put the remaining elements in a new array
     and prints the new array

Input :{1,2,3,4,5,6}

element:6

Output : [1,2,3,4,5]


bir diziden belirli bir elemanı çıkarmak ve kalan elemanları yeni bir diziye koymak
ve yeni diziyi basmak için bir Java programı yaz

Giriş :{1,2,3,4,5,6}

eleman:6

Çıkış : [1,2,3,4,5]
     */

    public static void main(String[] args) {
        Integer[] number={1,2,3,4,5,6};
        int element=3;

        List<Integer> newList = new ArrayList<>();



        for (int i = 0; i < number.length ; i++) {
            if (number[i]!=element){
                newList.add(number[i]);
            }
        }

    }
}

