package day34_Inheritance;
public class ToyotaCorolla extends Toyota{

    String model="Corolla";

    public static void main(String[] args) {
        /*
          child class'dan parent class'a erisimde
          access modifier kurallarini bypass edemeyiz
          ornegin parent class'daki private class uyelerini child class'dan kullanamayiz
          ayni sekilde parent ve child farkli package'larda ise
          parent class'daki default access modifier'i olan
          class uyelerini child class'dan kullanamayiz
         */
        ToyotaCorolla arb1=new ToyotaCorolla();//kendi class ismimile objemizi ürettik

        System.out.println(arb1.marka); // Toyota

       // System.out.println(arb1.model); // Model belirtilmedi

        //bu clasda instance bir model variable oluşturdum ilk bu classa baktığı için
        //onu değer olarak aldı. bu classda olmasaydı yukardaki gibi yazdırdığımızda
        //parent class daki değeri verecek Model belirtilmedi yazacaktı

        System.out.println(arb1.model); //corolla

    }
}