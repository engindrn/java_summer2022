package RECAP;

import java.util.Scanner;

public class Q03_VucutKıtleEndeksi {
    public static void main(String[] args){

        /*kullanıcıdan boyunu ve kilosunu alıp vucut kitle indeksini hesaplayan bir kod yazınız
        ıpucu: vucut kitle indeksi (VKI)= Vucut ağırlığı(kg) / boy uzunluğunun karesi (m)

        örnek: ınput= kilo:71 boy:1,72    output: VKI 23
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kilonuzu giriniz");
        double kilo=scan.nextDouble();

        System.out.println("lutfen buyunuzu giriniz");
        double boy=scan.nextDouble();
        boy/=100;                                       //cm ye çevirdik

        double vKi= kilo/(boy*boy);

        System.out.println(vKi);

    }
}
