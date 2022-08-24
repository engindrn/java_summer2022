package Wday04_Practice;

public class Q05_ForLoop {
    public static void main(String[] args) {
        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

        System.out.println("forloop ile");

        for (int i = 0; i <=255 ; i++) {
            char c= (char) i;                   //casting yaptık int data türünü chara çeviridk
            System.out.println(i+ " -> "+c);

        }
        System.out.println("while ile");

        int i =0;

        while (i<=255){
            char sembol= (char) i;
            System.out.println(i+ " = "+ sembol);
            i++;      //increment(artış)
        }

        System.out.println("do while");

        int a=0;
        do{
            char karakter= (char) a;
            System.out.println(a+ "  "+karakter);
            a++;
        }while(a<=255);
    }
}
