package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_TekrarEdenHarfler {

    public static void main(String[] args) {


        String str="Javaisalsoeasy";

        String [] str2 = str.split("");

        Arrays.sort(str2);
        System.out.println(Arrays.toString(str2));    //[J, a, a, a, a, e, i, l, o, s, s, s, v, y]

        List<String> tekrarEdenler = new ArrayList<>();

        for (int i = 0; i < str2.length-1 ; i++) {
            if (str2[i].equals(str2[i + 1]) && !tekrarEdenler.contains(str2[i])) {
                tekrarEdenler.add(str2[i]);
            }
        }
        System.out.println(tekrarEdenler) ;
    }
}
