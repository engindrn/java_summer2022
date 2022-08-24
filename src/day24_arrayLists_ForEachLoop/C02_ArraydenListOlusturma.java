package day24_arrayLists_ForEachLoop;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class C02_ArraydenListOlusturma {

    public static void main(String[] args) {

        /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazalim
         */

        Random rnd=new Random();    //sayi üretir rasgele Random class!ı Scanner gibi çalışır. objeyi burda oluşturduk

        int sayi=0;

        List<Integer> sayiListesi=new ArrayList<>();

        while(sayiListesi.size()<200){            //size 200 olana kadar tekrar tekrar çalışsın
            sayi= rnd.nextInt(1000);       //Random atamasını burda yaptık sayi 200 olana kadar üretsin dedik
            if (!sayiListesi.contains(sayi)){    //üretilen sayi listede varsa eklemesn
                sayiListesi.add(sayi);          //yoksa eklesin
            }
        }

        boolean bildiMi=false;                   //loop önvesi ihtiyacımız olan değişkenleri oluşturudk
        int tahminSayisi=1;
        Scanner scan= new Scanner(System.in);


        while(!bildiMi){              // bildiMi==false
            System.out.println("Lutfen bir sayi tahmininde bulunun");
            sayi=scan.nextInt();
            if (sayiListesi.contains(sayi)){
                System.out.println("Tebrikler " + tahminSayisi + " adet tahminde listeden bir sayi buldunuz");
                bildiMi=true;
            }else{
                System.out.println(tahminSayisi + " adet sayi soylediniz ama hic biri listede yok");
                tahminSayisi++;
            }
        }
    }
}