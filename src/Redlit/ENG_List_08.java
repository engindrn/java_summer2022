package Redlit;

public class ENG_List_08 {
    /*
    Write a java program which accept a sentence as parameter,
    than reverses sentence by using StringBuilder and checks if sentence is palindrome or not (without case sensitivity).
    Use StringBuilder.

Input :

I love Java.

Output:

Reversed sentence : avaJ evol I. It is not a palindrome"


    Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi tersine çeviren
    ve cümlenin palindrom olup olmadığını (büyük/küçük harf duyarlılığı olmadan) kontrol eden bir Java programı yazın.
    StringBuilder kullanın.


     */
    public static void main(String[] args) {

        String cumle="Adanada";

        StringBuilder input = new StringBuilder(cumle.toLowerCase());

        //System.out.println(input);
        // System.out.println(input.reverse());


        if (input.toString().equals(input.reverse().toString())){
            System.out.println("It is a palindrome");
        }else {
            System.out.println("It is not a palindrome");
        }
    }
}

