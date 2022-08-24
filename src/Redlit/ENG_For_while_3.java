package Redlit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENG_For_while_3 {
    static void main(String[] args) {

    //  Write a code that returns the duplicate chars in a String array.(interview Question)
        //Bir String dizisinde yinelenen karakterleri döndüren bir kod yazın
    //  Input :

    //  String str=“Javaisalsoeasy”

    //  Output: [a, s]

    String str = "Javaisalsoeasyy";
    List<String> list = dublicate(str);
    System.out.println(list);


}

    public static List<String> dublicate(String str) {

        String[] arr = str.split("");            //String str variable ımızı split ile bölerek array e ekledik
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        List<String> tekrarEdenler = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals(arr[i + 1]) && !tekrarEdenler.contains(arr[i])) {

                tekrarEdenler.add(arr[i]);
            }

        }

        return tekrarEdenler;

    }
}
