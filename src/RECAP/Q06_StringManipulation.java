package RECAP;

import java.util.Scanner;

public class Q06_StringManipulation {
    public static void main(String[] args) {

        //scanner kullanarak iki ayrı değer giriniz ve bu iki ayrı kelimeyi String Manipulation kullanarak birlestiriniz
        //yukarıcdaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atıp birlestiriniz

        Scanner scann=new Scanner(System.in);
        System.out.println("String1 :");
        String str1=scann.nextLine();

        System.out.println("String2 :");
        String str2=scann.nextLine();

        String yenistr1=str1.substring(1);              // replace methodu ilede yapılabilir ilk harf örn e
        String yenistr2=str2.substring(1);              // yerine "" hiçliik ekleyerek kurtulabiliz

        String birlesim=yenistr1.concat(yenistr2);

       System.out.println("bileşim: "+yenistr1+""+yenistr2 );    //bu şekildede olabilirdi

        System.out.println("birlesim = " + birlesim);
    }
}
