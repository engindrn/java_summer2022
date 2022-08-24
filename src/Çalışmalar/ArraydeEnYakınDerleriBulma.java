package Çalışmalar;

import java.util.Arrays;

public class ArraydeEnYakınDerleriBulma {
    public static void main(String[] args) {
      /*  Farklı güçleri olan atlarla bir at yarışı düzenliyor. Atların gücü bir tamsayı dizi assign  edilirse.
                bir birine yakın güçlere sahip at çiftlerini bulunuz.
                For example :{3, 67, 9, 46, 55, 48}
        output : 46,48              */


        int arr[]= {3, 67, 9, 46, 55, 48};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[3, 9, 46, 48, 55, 67]

        int fark= arr[1]-arr[0];  //9-3=6

        for (int i=0; i<arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j]-arr[i]<fark) {
                    System.out.println(arr[i] + " ile " + arr[j] );
                }
            }
        }
    }
}


