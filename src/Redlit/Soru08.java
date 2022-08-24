package Redlit;

public class Soru08 {
    public static void main(String[] args) {
       /* Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.

                Array: [1232,2345,5467,678,3454,2312,3451] */

        int[] sayilar = {7090, 2345, 5487, 8002, 678, 9454, 2312, 3451,7080};



       /* Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));//[678, 1232, 2312, 2345, 3451, 3454, 5487, 7080, 8002]

        System.out.println(sayilar[sayilar.length-1]);
        System.out.println(sayilar[sayilar.length-2]);*/


        int maxSayi1 = sayilar[0];
        int maxSayi2 = sayilar[0];

        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i] > maxSayi1) {
                maxSayi1 = sayilar[i];
            }
            if (sayilar[i]!= maxSayi1 && sayilar[i]> maxSayi2 ){
                maxSayi2 = sayilar[i];
            }
        }
        System.out.println("En buyuk sayi: " + maxSayi1);
        System.out.println("ikinci buyuk sayi: " + maxSayi2);
    }
}

