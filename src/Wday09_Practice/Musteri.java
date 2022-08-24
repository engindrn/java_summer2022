package Wday09_Practice;

public class Musteri {

    public static void main(String[] args) {



        Mutfak menu =new Mutfak();     //parametresiz const.

        System.out.println("menu.toString() = " + menu.toString()); //toString üzerinden yazdırdık

        Mutfak siparisim=new Mutfak("adanakebab","mercimek","kunefe","salgam");
        //parametreli contructor ile mutfaktan istediklerimizi sipariş edeceğiz getirecek
        // girdiğimiz parametreleri creat edeceğiz
        System.out.println("siparisim = " + siparisim);

    }
}