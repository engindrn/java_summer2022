package Wday05_Practice;

import java.util.Scanner;

public class Q04_MethodCreationForLoop {
    public static void main(String[] args) {
        /* Interview Question
           Write a Java program to reverse a string. Use for loop and create a method called
           reverseString//Bir dizeyi tersine çevirmek için bir Java programı yazın.
           For döngüsü kullanın ve reverseString adlı bir yöntem oluşturun/ */


            Scanner scan = new Scanner(System.in);
            System.out.println("bir string giriniz :");
            String str = scan.nextLine();


            System.out.println("string in tersi :" + reverseString(str));

    }
        private static String reverseString(String str) {
            String reversed = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed+=str.charAt(i);                       //reversed+=str.substring(i,i+1);
            }

            return reversed;

    }
}
