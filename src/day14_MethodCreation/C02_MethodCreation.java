package day14_MethodCreation;

import day13_MethodCreation.C04_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {

        //verilen 3 sayının rakamlar toplamını veren bir method oluşturalım

         int input=423;

         rakamlariTopla(input);
            C01_MethodCreation.tersdenYazdır("AYAK");        //DİĞER CLASS TAKİ METOTLARI ÇAĞIRDIK
            C04_MethodCreation.topla(6,6);

    }

    public static void rakamlariTopla(int input) {

        int birlerBasamagi= 0;
        int rakamlarToplami=0;
        int temp=input;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        System.out.println("girilen "+temp+" sayısının rakamlar toplamı :"+rakamlarToplami);
    }

}
