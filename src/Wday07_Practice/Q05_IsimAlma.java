package Wday07_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q05_IsimAlma {  /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
     *  1. Kullanicidan ismini isteyelim
     *  2. Kullanici adindaki bosluklari silelim.
     *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
     *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
     *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        Random rnd=new Random();


        System.out.print("Lutfen kullanici adi giriniz : ");
        String kullanici=scan.nextLine();

        String sadeKullanici=kullanici.replaceAll(" ","");

        List<String> kullanicilar=new ArrayList<>();

        kullanicilar.add("akin");
        kullanicilar.add("ali");
        kullanicilar.add("veli");
        kullanicilar.add("deli");


        if(!kullanicilar.contains(sadeKullanici)){
            kullanicilar.add(sadeKullanici.trim());

        }else{
            int rastgele=rnd.nextInt(100);
            sadeKullanici+=rastgele+"";
            kullanicilar.add(sadeKullanici.trim());

        }
        System.out.println(kullanicilar);//[akin, ali, veli, deli, akin32],[akin, ali, veli, deli, deli92]..


    }
}
