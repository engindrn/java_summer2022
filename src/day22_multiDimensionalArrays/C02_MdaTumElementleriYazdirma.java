package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C02_MdaTumElementleriYazdirma {
    public static void main(String[] args) {
        // verilen bir multi-dimensional array'in
        // tum elementlerini yazdiran bir method olusturun

        int[][] sayilar = {{1,5,6,9,4},{2,5,5,8},{3,1,6}}; //outer arrray içinde 3 element var ve bunlarda bir array

        System.out.println(Arrays.deepToString(sayilar)); //[[1, 5, 6, 9, 4], [2, 5, 5, 8], [3, 1, 6]]//array olarak

        elementleriYazdir(sayilar);
    }
    public static void elementleriYazdir(int[][] sayilar) {

        for (int i = 0; i < sayilar.length ; i++) {            // i = 0,1,2 degerleri alacak
            for (int j = 0; j <sayilar[i].length ; j++) {       // inner arraylerin uzunluguna bagladik
                System.out.print(sayilar[i][j] + " ");     //1 5 6 9 4 2 5 5 8 3 1 6
            }

        }
    }
}
