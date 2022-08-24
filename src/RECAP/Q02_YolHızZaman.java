package RECAP;

import java.util.Scanner;

public class Q02_YolHızZaman {
    public static void main(String[] args) {
        /*  Problem Tanımı
    Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
    Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
    120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

    Örnek Ekran Çıktısı
    Mesafeyi giriniz: 400
    Hızı giriniz: 100
    Süre 4 saattir.
 */

        Scanner scann=new Scanner(System.in);                            //x=v/t
        System.out.println("lutfen hızınızı giriniz (km/saat)");
        double hiz= scann.nextInt();

        System.out.println("lutfen gidilecek mesafeyi giriniz (km)");
        double mesafe= scann.nextInt();

        double sure= (mesafe/hiz);

        System.out.println("gidilen yol "+ sure+" saattir");

        //scann.close() bu şekilde başka scann almayı sonlarndırır yeniden girmek gerekir
    }
}
