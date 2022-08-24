package Wday06_Practice;

import java.util.Arrays;

public class Q05_Arrays {
    public static void main(String[] args) {
        /*
   given an int array and find the squares of the elements
   (Verilen bir int dizisi icin elemanlarin karelerini bulun )
   Example:{2,6,4,5,8,9}
   output:{4,36,16,25,64,81}
   */
//arraylerde tüm data tipleri aynı olması lazım
//arraylerin uzunlugu bize icindaki eleman sayisini verir
//arrayler heap memory de run time da olusturulur
//arrayler non primitivedir , bu yüzden kendilerine özel methodları vardır
//bir array i declare ederken referansları stack memory de olusur

        int arr []={2,6,4,5,8,9};

        for (int i = 0; i < arr.length; i++) {
            arr[i]*=arr[i];

        }
        System.out.println(Arrays.toString(arr));
    }
}
