package Çalışmalar;

public class ArraydekiIkinciEnBuyukSayiyiBulma {
    public static void main(String[] args) {
        /* Array icindeki 2. enbuyuk sayiyi bulan Java kodunu yaziniz
        arr={1232,2345,5467,678,3454,2312,3451}
        */


        int[]arr={500,2345,5467,5010,678,3454,2312,3460};

       /* Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[678, 2312, 2345, 3232, 3454, 3460, 5467]
        System.out.println(arr[arr.length-1]);
        System.out.println(arr[arr.length-2]);   */

        int enBuyukSayi=arr[0];
        int enBuyukIKinciSayi=arr[0];

        for (int i = 1; i <arr.length; i++) {
            if (arr[i]>enBuyukSayi){
                enBuyukSayi=arr[i];
            }
        }
        for (int i = 1; i <arr.length; i++) {
            if (arr[i] > enBuyukIKinciSayi && arr[i]<enBuyukSayi){
                enBuyukIKinciSayi=arr[i];
            }
        }
        System.out.println("En Buyuk Sayi       :"+enBuyukSayi);
        System.out.println("Enbuyuk Ikinci Sayi :"+enBuyukIKinciSayi);

    }
}
