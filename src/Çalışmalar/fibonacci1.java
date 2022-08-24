package Çalışmalar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fibonacci1 {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();

        Scanner scan= new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi=scan.nextInt();

        int sayi1=0;  // ilk sayi her zaman 0 dan basladıgından 0 a atadım
        sayilar.add(sayi1);  // bu int degeri listime  ekledim
        int sayi2=1;   // ikinci sayida her zaman 1 oldugundan ikinci sayiyi atadım
        sayilar.add(sayi2);  // Bunuda listime ekledim .
        int sayi3;
        if(sayi<=1){
            System.out.println("Daha buyuk sayilar gir");
        }else {
            for (int i = 0; i <sayi ; i++) {  // girilen sayiyaya kadar dongu kurdum
                sayi3=sayi1+sayi2;      // sayi3ün toplamini buldum
                sayilar.add(sayi3);   // buldugum sayiyiy listeye ekledim.
                sayi1=sayi2;        // dongu devam ettikce sayilari da esitleme yaptım
                sayi2=sayi3;
            }
        }
        System.out.println(("Girilen Fibonacci sayilarin Listesi : " + sayilar));
    }
}
