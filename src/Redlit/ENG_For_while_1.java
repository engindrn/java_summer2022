package Redlit;

import java.util.Scanner;

public class ENG_For_while_1 {
    public static void main(String[] args) {

     /*   Ask user to enter a name and a character, t
     hen check how many times the character is repeated in the name using loops in the name

      Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından isimde döngüler
      kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin
        e.g:
        char ch1= 'a' ;
        String name =“John came late"
        Expected Output: Number of a = 2
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir String giriniz");
        String str = scan.nextLine().toLowerCase();
        System.out.println("Lütfen bir karakter giriniz");
        char harf = scan.next().toLowerCase().charAt(0);
        int sayac = 0;

        for (int i = 0; i < str.length(); i++) {

            if (harf == str.charAt(i)) {

                sayac++;
            }
        }
        System.out.println("Girdiginiz String: " + str + "\n" + "girdiginiz karakter: " + harf + "\n" + "tekrar sayisi: " + sayac
        );
    }
}
