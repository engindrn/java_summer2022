package RECAP01;

import java.util.Scanner;

public class Q07_BMIsınıflandırma {
    public static void main(String[] args) {
                /*
                 *  Kullanicidan boyunu  (CM)  ve kilosunu (kg) alarak  BMI (VKE) hesaplayiniz

                    BMI = kilo(kg) /(boy*boy)(cm)
                    BMI <=20 oldukca zayifsiniz
                    20<BMI<=25 Normal sinirlardasiniz
                    25<BMI<=30 Sisman kategorisindesiniz
                    30<BMI ==> Obez grubundasiniz.*/


        Scanner scan=new Scanner(System.in);
        System.out.println("boyunuzu cm olark giriniz");
        double boy=scan.nextDouble()/100;                          //boyu metreye dönüştürdük

        System.out.println("lutfen kilonuzu kg olarak giriniz");
        double kilo=scan.nextDouble();

        double vkı= kilo/(boy*boy);

        if(vkı<=20) {
            System.out.println("VKİ :" + vkı + " oldukça zayıfsınız");
        } else if (vkı<=25) {
            System.out.println("VKİ :" + vkı + " normalsiniz");
        } else if (vkı<=30) {
            System.out.println("VKİ :" + vkı + " sismansiniz");
        }else if (vkı>30) {
            System.out.println("VKİ :" + vkı + " obezsiniz");
        }


        String sonuc= (vkı<=20)? ("zayıfsınız"):(vkı<=25)? ("normalsiniz"):(vkı<=30)? ("sismansınız"):("obezsiniz");
        System.out.println("sonuc :"+sonuc);






        //String sonuc= vke<=20 ? "Oldukça Zayıfsınız" : vke<=25 ? "Normal Sınırlardasınız" :
      //                vke<=30 ? "Şişmansınız": "Obezsiniz";



    }
}
