package Redlit;

import java.util.Arrays;

public class ENG_Method_Array_4_AtamalıAtamasız {
    public static void main(String[] args) {

         /* Create a custom return type method accepts a name as parameter and prints the name as a char array.
        (do not use toCharArray() method)
        Input : John
        Output :[J, o, h, n]
        */

        String name = "HAKAN";

        String [] yeni=arrMethod(name);

        System.out.println(Arrays.toString(yeni));   //[H, A, K, A, N]


       //   arrMethod(name);    //atama yapmadan method oluşturup dönen sonunce direkde yazdırabiliriz
      //  System.out.println("Input :" + name + "\nOutput :" + Arrays.toString(arrMethod(name))); //[H, A, K, A, N]
    }
    public static String[] arrMethod(String name) {

        String[] arr= name.split("");

        return arr;
    }
    }



