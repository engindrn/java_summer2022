package day21_Arrays;

public class C11_TersString {
    /*

    Write a Java program that reverse a sentence by using Array (with all spaces and special characters).

   Input : Coding is greate.

   Output : .etaerg si gnidoC

     */
    public static void main(String[] args) {

        String str = "Coding is greate.";
        String terstenStr = "";

        String[] karakterler = str.split("");         //bölüp arrya atadıık

        for (int i = karakterler.length - 1; i >= 0; i--) {

            terstenStr += karakterler[i];

        }
        System.out.println("Input :"+str+"\nOutput :"+ terstenStr);

    }
}
