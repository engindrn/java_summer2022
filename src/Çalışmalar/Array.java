package Çalışmalar;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        String [] isimler={"Ali", "Veli", "Ayse", "Fatma"};

        System.out.println(isimler);    //[Ljava.lang.String;@4dd8dc3

        System.out.println(Arrays.toString(isimler));  //[Ali, Veli, Ayse, Fatma]

        System.out.println(isimler[2]);     //Ayse     sadece bir elementi bu şekilde yazdırabiliriz
    }
}
