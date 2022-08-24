package day05_matametikselIşlemler;

public class C04_WrapperClass {
    public static void main(String[] args) {
        String str="Java Cok guzel";

        str.toUpperCase();

        int sayi=10;

        //primitive data turlerinin yanında method'lar olmaz
        //java bazı methodları kullanabilmemiz için
        //her bir primitive data turu için bir wrapper class oluşturmuştur

        Integer sayi2=10;

        sayi2.byteValue();

    }
}
