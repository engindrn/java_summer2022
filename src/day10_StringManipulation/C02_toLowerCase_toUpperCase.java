package day10_StringManipulation;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {

            String str="Beni psikopata baglaglmayin";

        System.out.println(str.toUpperCase());    //BENI PSIKOPATA BAGLAMAYIN

        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));    //BENİ PSİKOPATA BAĞLAMAYİN

        /* eğer büyük-küçük harf donuşumunde local bir dili  eses almak isterseniz bu method kullanılabilir

         */
    }
}
