package day14_MethodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {

        // ınput olark verilen isim ve soyismi ilk harfi buyuk geriye kalanları * olacak sekilde yazdıran method oluştur.

        String isim= "Enes";
        String soyisim="Bozkurt";

        ismiGizle(isim,soyisim); //E*** Y*****



    }
    public static void ismiGizle(String isim,String soyisim){

         // String ilkharf=isim.substring(0).toUpperCase();
         // String isimKalan=isim.substring(1).replaceAll("\\w","*");

   isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");

        // String soyIlkHarf= soyisim.substring(0).toUpperCase();
        //  String soyKalan= soyisim.substring(1).replaceAll("\\w","*");

   soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");

        System.out.println(isim+" "+soyisim);

    }

}
