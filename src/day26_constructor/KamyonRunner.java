package day26_constructor;

public class KamyonRunner {

    public static void main(String[] args) {

        Kamyon kamyon1=new Kamyon();

        System.out.println("kamyon1 ozelikleri " + kamyon1.toString());      //toString methodutla oluşturudk


        Kamyon kamyon2=new Kamyon("Mercedes","4140",2005,500000);
        System.out.println("Kamyon2 bilgileri " + kamyon2);


        Kamyon kamyon3=new Kamyon("MAN","as900",2007,400000);
        System.out.println("Kamyon3 bilgileri " + kamyon3);


        Kamyon kamyon4=new Kamyon("Scania","s540");      //iki parametreli yeni bir contructor oluşturduk
        System.out.println("Kamyon4 bilgileri " + kamyon4);        //create constructor yaparak iki pararmetli yeni
                                                                    // komyon class ında oluştu.
    }                                       //biz oluşturmasakta kalan diğer özelliklerde (yıl-fiyat) olacak ve
}                                           //default değerler alacak iki classdada atama yok çünkü

