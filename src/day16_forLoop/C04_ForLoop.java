package day16_forLoop;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        System.out.print("lutfen 100'den kucuk bir sayi giriniz :");
        int input = scann.nextInt();

        for (int i = 1; i <=input; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("java guzeldir"+"\n");   //en sınırlandırıcı daraltıcı olandan başladık (dar kapsamlı)
            }else if (i % 5 == 0) {
                System.out.print("guzeldir"+" ");
            } else if (i % 3 == 0) {
                System.out.print("Java"+" ");
            }else {
                System.out.print(i+" ");
            }


            }


        }
    }
