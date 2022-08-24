package Çalışmalar;

public class IndexOf {
    public static void main(String[] args) {

        String input = "sdfksjggjkfgaf,lg";

        System.out.println(input.indexOf('v'));

        if (input.indexOf("q") == -1) {
            System.out.println("kullanilmamistir");

        } else {
            System.out.println("kulanilmistir");


        }
    }
}