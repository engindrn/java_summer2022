package day31_timeFormatter_varargs;
public class C03_VarargsIleToplama {
    public static void main(String[] args) {

        // verilen kac int olursa olsun
        // hepsini toplayip sonucu yazdiran bir method olusturun

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        int sayi5=50;

        toplaYazdir(sayi1,sayi2,sayi3,sayi4,sayi5);      //burda 14.15.16.17. satırda 4 method call var
        toplaYazdir(sayi1,sayi2,sayi3,sayi4);           //aşağıdaki method umuz 4 defa çalışacaktır
        toplaYazdir(sayi1,sayi2,sayi3);
        toplaYazdir(sayi1,sayi2);

        //eğer 14. satırdaki method çalışacaksa aşağıdaki int... sayi içinde 5 element olan array olacak
        //eğer 15 satırdaki method çalışsacaksa aşağıdaki int... sayi içinde 4 element olan array olacak
        //...
    }
    public static void toplaYazdir(int... sayi){
        /*
        int... sayi  bu gosterim integer variable'lardan olusan bir varargs demektir
        varargs array alt yapisini kullanir
         */
        int toplam=0;

        int sayiAdedi= sayi.length;
        for (int each: sayi                  //int larımız sayi array inden gelecek
        ) {
            toplam+=each;
        }
        System.out.println("Girilen "+sayiAdedi+" adet sayinin toplami : " + toplam);
    }
}