package ÇALIŞMA1;

public class Varargs {
    public static void main(String[] args) {

        //  verilen Stringleri birlestiren concat isimli bir method olusturunuz
        // input : "m", "e", "r", "v", "e";
        // output : merve

        String harf="m";
        String harf1="e";
        String harf2="r";
        String harf3="v";
        String harf4="e";

        harfBirleştirme(harf,harf1,harf2,harf3,harf4);

      /*  harfBirleştirme("m", "e", "r", "v", "e");   */


    }

    private static void harfBirleştirme(String...harf) {

        String kelime=" ";

        for (String each :harf
             ) { kelime+=each;

        }
        System.out.println(kelime);

    }


}
