package day15_overloading_forLoop;

public class C04_Overloading {public static void main(String[] args) {
    topla(5,7); // 12
    topla(5.2, 3); // 8.2
    topla(3.4,6.1); // 9.5
    topla(5,6.2);   // int double o yüzden üçüncü method çalışır-auto widening

    /*java hangi methodun çalışacağına karar verirken optimizasyon yapar
    -eğer hiç casting (cast) yapmadan kullana bileceği method varsa onu kullanır
    - ğer cast yapmadan kullanabileceği bir method yoksa en az cast yapaarak kullanabileceği methodu tercih eder
     */
}
    public static void topla(int sayi1, int sayi2){
        System.out.println("Iki integer'in toplami : " + (sayi1+sayi2));
    }

    public static void topla(double sayi1, int sayi2){
        System.out.println("bir double ve bir integer'in toplami : " + (sayi1+sayi2));
    }

    public static void topla(double sayi1, double sayi2){
        System.out.println("Iki double'in toplami : " + (sayi1+sayi2));
    }

    public static void topla(int sayi1, int sayi2, int sayi3){
        System.out.println("uc integer'in toplami : " + (sayi1+sayi2+sayi3));
    }
}
