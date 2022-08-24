package day21_Arrays;

public class C01_Array_MaxSayiyiBulma {
    public static void main(String[] args) {
        //verilen bir int array'deki en büyük sayiyi yazdıran bir method oluşturun

        int [] sayilar={3,5,7,1,4,9,5,2};

        maxSayiyiYazdir(sayilar);

    }
    public static void maxSayiyiYazdir(int[] sayilar){

        int maxSayi=sayilar[0];                         // index 0 daki sayidan başladı

        for (int i = 1; i < sayilar.length; i++) {        //yukarda 0 ı atamıştık 1 den başladı

            if (sayilar[i]>maxSayi){      //sayiların i indexindeki sayi maxsayidan büyükse değer olarak ata
                maxSayi=sayilar[i];
            }

        }

        System.out.println("array deki en büyük sayi: "+maxSayi);//9




    }

}
