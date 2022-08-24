package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan ismini isteyin
        //girilen ismi
        //İsminiz : İsmail   şeklinde yazdırın

        // insanların dünyasından kodlarımızın bulunduğu class'a değer almak için
        //Scanner class'ını kullanırız

        //1-Scanner objesi oluşturalım

        Scanner scan =new Scanner(System.in);

        //2-kullanıcıya ne istediğimizi söyleyelim

        System.out.println("Lutfen isminizi giriniz");

        //3-oluşturduğumuz scan objesi ile kullanıcının girdiği değeri alıp
        //oluşturacağımız uygun bir variable' a atayalım

        String kullanıcıIsmı= scan.next();
        System.out.println("Kullanici Ismi"+" " +  kullanıcıIsmı);
    }
}
