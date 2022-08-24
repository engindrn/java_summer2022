package Wday10_Practice.okul_Proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {
    /*
        * ogretmen bilgilerini kullanicidan aliniz
        * aldiginiz bilgilerrden object ureterek yeni
         ogretmenler olusturun ve bilgilerini yazdirin
        */
    static Scanner scan = new Scanner(System.in);



    public static void main(String[] args) {
        System.out.println("hosgeldiniz okulumuza ");

        System.out.println("isim giriniz");

        String isim = scan.nextLine();

        System.out.println("soyisim giriniz");
        String soyisim = scan.nextLine();

        System.out.println("yasinizi giriniz");
        int yas = scan.nextInt();

        System.out.println("bransinizi giriniz");
        String brans = scan.next();


        System.out.println("telefon no giriniz");
        String tel = scan.next();

        //scan.nextLine();//dummy hayalet komut

        OgretmenBilgileri adayOgretmen = new OgretmenBilgileri(isim, soyisim, yas, brans, tel);
      //ogretmenBilgileri classından bir adayOgretmen objesi olusturup parametreli OgretmenBilgileri constructoru oluşturuduk
    //kullanıcıdan aldığımız bilgileri diğer class a gönderdik ve instance variable larımıza atadık


        List<OgretmenBilgileri> ogretmenList = new ArrayList<>(); //adayOgretmen bilgilerini tutmak için bir list oluşturudk
                                                                        //data tipi olarak OgretmenBilgileri classındaki bilgileri yazdık

        ogretmenList.add(adayOgretmen);   //listimize adayOgretmen bilgilerini ekledik

        System.out.println("ogretmenList = " + ogretmenList);

        //liste eklemedende sout ile adayOgretmeni direk toString ile yazdırabilirdik


    }


}