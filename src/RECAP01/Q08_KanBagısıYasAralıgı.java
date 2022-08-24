package RECAP01;

import java.util.Scanner;

public class Q08_KanBagısıYasAralıgı {
    public static void main(String[] args) {

        /*
        Problem tanimi :
        Kullanicidan  yasini ve kilosunu alaliniz
        18 yasindan kucuk ise kan bagisi yapamaz
        18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        18 yasindan buyuk 50 ve 50 kilodan agir ise kan bagisi yapabilir.
        */

        Scanner scann=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas=scann.nextInt();

        System.out.println("lutfen kilonuzu giriniz");
        double kilo=scann.nextDouble();


        //             if (yas>=18 && kılo<50){
        //                System.out.println("kan bagısı yapamaz");
        //            } else if (yas>=18 && kılo>=50){
        //                System.out.println("kan bagısı yapabılır");
        //            }else {
        //                System.out.println("kan bagısı yapamaz");
        //            }
        //        }


        //if (yas < 18) {
        //            System.out.println("Kan Bağışı Yapamazsınız");
        //        } else if (yas >= 18 && kilo >= 50) {
        //            System.out.println("Kan Bağışı Yapabilirsiniz");
        //        } else System.out.println("Kan Bağışı Yapamazsınız");
    }
}
