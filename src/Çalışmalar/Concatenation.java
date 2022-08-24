package Çalışmalar;

import static java.lang.System.*;

public class Concatenation {
    public static void main(String[] args) {
        String str1= "Java";
        String str2= "Guzel";
        int sayi1=5;
        int sayi2=4;

        int sayi3= sayi1*sayi2;
       // sayi3--;

        out.println(str1+" "+ str2+" "+sayi1+sayi2);

        out.println(str1+" "+sayi1+" "+str2);

        out.println(str1+" "+ (sayi1+sayi2)+sayi2);

        //out.println(sayi3);

        out.println(str1+" "+--sayi3 );

        out.println(sayi1+""+sayi2+" "+str2);


    }
}
