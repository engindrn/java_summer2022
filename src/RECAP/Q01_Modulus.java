package RECAP;

import java.util.Scanner;

public class Q01_Modulus {
    public static void main(String[] args) {

        /* kullanıcıdan alacağınız 5 basamaklı sayının ilk iki ve son iki
           basamaklarındaki sayıların toplamını veren bir kod yazınız

            örn: input=12345
                  output=12
 */

        Scanner scan=new Scanner(System.in);
        System.out.print("lutfen 5 basamaklı bir sayı giriniz :");
        int num=scan.nextInt();

        int ilkİki= num/1000;                      //5 basamaklı sayının 1000'e bmlümğ ilk 2 sayıyı verir
        int sonİki= num%100;                      //100 e bölümünden kalanı verir oda son iki sayıyı

        int ilkİkiTop= (ilkİki/10)+(ilkİki%10);
        System.out.println("ilkİkiTop = " + ilkİkiTop);

        int sonİkiTop= (sonİki/10)+(sonİki%10);
        System.out.println("sonSonİkiTop = " + sonİkiTop);

        System.out.println("sayıların toplamı = " +(ilkİkiTop+sonİkiTop) );


    }
}
