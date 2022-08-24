package Çalışmalar;

import java.util.Scanner;

public class Polidrome {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("String giriniz: ");
        String str=scan.nextLine();
        String tersStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr+=str.substring(i,i+1);
        }if(str.equalsIgnoreCase(tersStr)){
            System.out.println("Palnidrom'dur");
        }else {
            System.out.println("Palindrome degildir");
        }
    }
}
