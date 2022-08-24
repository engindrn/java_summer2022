package day06_Concatenation;

public class C02_Concanation {


    public static void main(String[] args) {
        String str1="Java";
        String str2="Guzeldir";
        int sayi1=5;
        int sayi2=4;
        int sayi3=sayi1*sayi2;

        // yukaridaki variable'larri kullanarak istenen metinleri yazdiralim

        System.out.println(str1+" "+str2+" "+sayi1+sayi2); // Java Guzeldir 54
        System.out.println(str1+" "+str2+" " + (sayi1+sayi2)); // Java Guzeldir 9
        System.out.println(sayi1+sayi2+" "+str1); // 9 Java
        System.out.println(""+sayi1+sayi2+" "+str2); // 54 Guzeldir

        System.out.println(str1+" "+--sayi3 );    //Java 19



        System.out.println(str1.concat(str2)); // JavaGuzeldir

        System.out.println(str1.concat(" ").concat(str2)); // Java Guzeldir
        System.out.println(str1.concat(" ")+6);             //java 6
        System.out.println(str1.concat(str2).concat(str1));    //javaguzeldırjava
        System.out.println(str1.concat(" ").concat(str2).concat(" ").concat(str1));    //java guzeldır java
    }
}
