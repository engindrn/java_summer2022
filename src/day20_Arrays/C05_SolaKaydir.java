package day20_Arrays;
import java.util.Arrays;
public class C05_SolaKaydir {
    public static void main(String[] args) {
        /*
        Soru 1: Verilen 3 elemanli bir array’in
        tum elemanlarini bir soldaki konuma tasiyacak
        bir program yazin.
        Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.
        [1, 2, 3, 4, 5] --> [2, 3, 4, 5, 1]
         */
        int arr[]={1,2,3,4,5};
        int temp=arr[0];  // temp --> gecici
        for (int i = 0; i < arr.length-1 ; i++) {
            arr[i]=arr[i+1];  // burada 2'i 1'e , 3'u 2'e , 4'u 3'3 seklinde devam edecek
            // length()-1 vermemizin sebebi hata veriyor.
        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr)); // [2, 3, 4, 5, 1]
        // yukarida degistirdigimiz Array
        // ilk duruma getirmek icin saga kaydiralim
        temp=arr[arr.length-1];
        for (int i = arr.length-1; i >0; i--) {
            arr[i]=arr[i-1];
        }
        System.out.println(Arrays.toString(arr)); //[2, 2, 3, 4, 5]
        arr[0]=temp;
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]
    }
}