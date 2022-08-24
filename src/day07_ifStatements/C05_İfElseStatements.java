package day07_ifStatements;

import java.util.Scanner;

public class C05_İfElseStatements {
    public static void main(String[] args) {

        /* soru= kullanıcan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadığını yazdırın*/

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char harf=scan.next().charAt(0);

        if((harf>='a' && harf<='z')  ||  (harf>='A' && harf<='Z' )){
            System.out.println("girilen karakter bir harftir");
        }
        else {
            System.out.println("girilen karakter harf degil");
        }
    }
}
