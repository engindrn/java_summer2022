package ÇALIŞMA1;

public class MultiArrayToplam {

    public static void main(String[] args) {
        /* TASK :
        arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} }  veriliyor.
        Bu iki multi dimensional array'in tum elemanlarinin toplamini bulan programi yaziniz.
         */
        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};        //outor array içinde üç element var
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};

        int sum1 = 0;

        for (int i = 0; i < arr1.length; i++) {               //nested ForLoop outor array için

            for (int j = 0; j < arr1[i].length; j++) {       //inner arrayin elemanları için
                sum1+= arr1[i][j];
              //  sum1 = sum1 + arr1[i][j];
            }
        }
        System.out.println(sum1);



        int sum2 = 0;
        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j < arr2[i].length; j++) {
                sum2 = sum2 + arr2[i][j];
            }
        }
        System.out.println(sum2);

        System.out.println("arr1 + arr2: " + (sum1 + sum2));


    }

}
