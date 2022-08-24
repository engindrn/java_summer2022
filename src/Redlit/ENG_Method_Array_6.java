package Redlit;

public class ENG_Method_Array_6 {
    public static void main(String[] args) {



    /*Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array
    Input : {3,2,5,4,1,6}
    Output :
    min: 1
    max: 6
    */


        int[] sayilar = {3, 2, 5, 4, 1, 6};

        maxVeminBulma(sayilar);
    }

    public static void maxVeminBulma(int[] sayilar) {

        int min = sayilar[0];

        int max = sayilar[0];

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] > max) {
                max = sayilar[i];
            }
            if (sayilar[i] < min) {
                min = sayilar[i];
            }
        }
        System.out.println("min :" + min + "\nmax: " + max);
    }
}
