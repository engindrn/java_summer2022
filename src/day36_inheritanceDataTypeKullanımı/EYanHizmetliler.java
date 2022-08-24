package day36_inheritanceDataTypeKullanımı;
public class EYanHizmetliler extends BMuhasebe{
    protected int saatUcreti = 9;
    protected int gunlukMesai = 8;
    protected void maas(){
        System.out.println("Yan Hizmetliler : " + (30*saatUcreti*gunlukMesai)+ " maas alir");
    }

    protected void issizlikSigorta(){
        System.out.println("Yan Hizmetliler %30 indirimli issizlik sigortasi yaptirabilir");
    }
    public static void main(String[] args) {
        /*
        overriding child class'daki bir method'un
        parent class'daki ayni isimdeki methodu
        etkisiz hale getirerek
        kendisinin spesifik ozelligini ortaya cikarmasidir.
        Overriding'i nerede dikkate aliyoruz?
        bir obje olusturulurken
        data turu ve constructor farkli ise
        objenin ozelliklerini belirlerken
        3 konuya dikkat cekmeliyiz

        1- Obje constructor'in oldugu class'da olusur
        2- objenin ozelliklerini aramaya data turunun oldugu class'dan baslariz
           bu class'da aranan ozellik bulunamazsa parent class'lara bakilir
           ordada bulamazsak CTE verir
        3-   eger aranan ozellik variable ise buldugumuz ilk degeri yazdiririz
        aranan ozellik method ise
        degeri yazdirmadan once
        override edilmis mi diye kontrol etmemiz gerekir
        eger override edildiyse en guncel degeri yazdiriz
         */

        BMuhasebe yh1= new EYanHizmetliler();             //data type BMuhasebe olduğu çin aramaya ordan başlar
        System.out.println(yh1.gunlukMesai); // M 8
        System.out.println(yh1.saatUcreti); // M 10
        yh1.maas(); // YH Yan Hizmetliler : 2160 maas alir        //data türümüzün(BMuhasebe) old classa baktık methodu bulduk ama
                                                                //hemen alamayız ınheritance ve data türü const farklı
                                                                //olduğu için alt classlarda override oedilmişmi kontrol etmeliyiz
        //maas () methodu bu  classda overriding edilmiş yani spesifikleştirilmiş o yüzden bu kullanılır

        yh1.ozelSigorta(); // M Isteyen calisanlara %50 indirimli ozel sigorta yapilir

        yh1.sigorta(); // P Tum personelimiz sigorta yapilir //  data türümüzün olduğu(BMuhasebe) clasda yok parent class baktık orda var ama
                                                                //alt classlarda overriding yapılmışmı baktık yapılmamış
                                                                //parent (Personel) classdakini aldı

        System.out.println(yh1.isim); // P     //bunlar variable olduğu için Bmuhasebe claasına baktı yoksa personel ordan buldu
                                                //controle gerek yok direk yazdırdı
        System.out.println(yh1.soyisim); // P
        System.out.println(yh1.departmant);// P


        // System.out.println(yh1.issizlikSigorta);  //kendi clasımızda olmasına rağmen çalışmadı CTE VERDİ
        // Aramaya muhasebeden basladigimizdan
        // issizlikSigortasi bulamadik CTE
    }
}
