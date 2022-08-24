package Çalışmalar;

public class Widening {
    public static void main(String[] args) {

        byte sayi=55;

        short sayi1= sayi;
        int sayi2=sayi1;
        float sayi3=sayi2;
        double sayi4=sayi3;

        System.out.println(sayi);
        System.out.println(sayi1);
        System.out.println(sayi2);
        System.out.println(sayi3);
        System.out.println(sayi4);
    }
}
