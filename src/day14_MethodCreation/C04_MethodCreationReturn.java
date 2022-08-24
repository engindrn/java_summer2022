package day14_MethodCreation;

public class C04_MethodCreationReturn {
    public static void main(String[] args) {
         //verilen isim ve soyismi ilk harfi büyük geriye kalanları * olcak şekilde değiştirip
        //bize bu halini DÖNDÜREN bir method oluşturun
        //not:programın ilerleyen kısımlarında isim ve soyismi bu şekilde kulanmak istiyoruz

        String isim="Enes";
        String soyisim="Bozkurt";

        String gizliIsim= isimGizle(isim,soyisim);

        System.out.println(isim+" "+soyisim);     //Enes Bozkurt
        System.out.println(gizliIsim);            //E*** B******
    }

    public static String isimGizle(String isim, String soyisim) {

        // String ilkharf=isim.substring(0).toUpperCase();
        // String isimKalan=isim.substring(1).replaceAll("\\w","*");

        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");

        // String soyIlkHarf= soyisim.substring(0).toUpperCase();
        //  String soyKalan= soyisim.substring(1).replaceAll("\\w","*");

        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");

        return isim+" "+soyisim;         //bu methodun amacı yazdırmak değil değişiklik yapıp
                                         // yeni halini bize
    }
}
