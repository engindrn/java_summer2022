package day11_StringManipulations;
public class C07_startsWith {
    public static void main(String[] args) {

        String input="Java gun gectikce guzellesiyor";

        System.out.println(input.startsWith("J")); // true

        System.out.println(input.startsWith("")); // true (HİÇLİLK)

        System.out.println(input.startsWith("gun",5)); //true

        System.out.println(input.startsWith("uz",18)); //false    guz olmalı
    }
}