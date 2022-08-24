package Redlit;

import java.util.ArrayList;
import java.util.List;

public class List4 {
    public static void main(String[] args) {
        /*  LIST 4. SORU
        Write a program that deletes the letters 'a' from the names in the list given as input.
        INPUT :  list1={"Ali","Veli","Ayse","Fatma","Omer"}
        OUTPUT :  [Veli,Omer]
         */
        String[] list1 = {"Ali", "Veli", "Ayse", "Fatma", "Omer"};
        List<String> list2 = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            if (!((list1[i].contains("a")) || (list1[i].contains("A")))) {
                list2.add(list1[i]);
            }
        }
        System.out.println(list2);
    }
}
