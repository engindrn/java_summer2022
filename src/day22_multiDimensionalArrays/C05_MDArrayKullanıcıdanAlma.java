package day22_multiDimensionalArrays;

import java.util.Scanner;

public class C05_MDArrayKullanıcıdanAlma {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [][]dizi = new int[2][3];

        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print("[" + i + "]" + "["+ j +"] = ");
                dizi[i][j] = scan.nextInt();
            }
        }

        System.out.println("\n");

        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(dizi[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
