package day14_MethodCreation;

import day13_MethodCreation.C04_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {

        //input olarak verilen bir String'i testen yazdıran bir method oluşturalım

    tersdenYazdır("okan");
        C04_MethodCreation.topla(6,5);           //başka classdaki method

    }
    public static void tersdenYazdır(String input){
        String tersInput= input.substring(3)+
                            input.substring(2,3)+
                            input.substring(1,2)+
                            input.substring(0,1);

        System.out.println("verilen kelimenin tersten yazılımı :"+tersInput);
    }
}
