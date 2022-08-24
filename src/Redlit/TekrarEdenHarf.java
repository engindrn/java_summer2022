package Redlit;

import java.util.Scanner;

public class TekrarEdenHarf {
    public static void main(String[] args) {

                /* Kullanıcıdan bir ad yazmasını isteyin, adın uzunluğu 3 olmalıdır.
                Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.
                Dize aynı karakterlere sahipse;

        Yazdır “Dize çift karakterler içeriyor” Aksi takdirde
        Yazdır “Dizenin benzersiz karakterleri var”
        Lütfen üçlü kullanın.
        Giriş :ala
        Çıktı:Dize yinelenen karakterler içeriyor*/



        Scanner scann=new Scanner(System.in);
        System.out.println("uc harfli bir isim giriniz");
        String isim=scann.nextLine();

        if(isim.length()>3 ) {
            System.out.println("geçersiz isim");
        }
        if(isim.substring(0,1).equalsIgnoreCase(isim.substring(1,2))
                ||isim.substring(0,1).equalsIgnoreCase (isim.substring(2))
                ||isim.substring(1,2).equalsIgnoreCase(isim.substring(2))){
            System.out.println("dize çift karakterler iceriyor");
        }else{
            System.out.println("içermiyor");
        }

    }
}



