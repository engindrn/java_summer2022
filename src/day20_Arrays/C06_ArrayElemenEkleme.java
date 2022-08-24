package day20_Arrays;

import java.util.Arrays;

public class C06_ArrayElemenEkleme {
    public static void main(String[] args) {

        //int arry variable ına yeni bir elemen eklemek istersek arraylerin uzunluğu değişmeyeceği için buna
        //buna izin vermez. bunun için legth ı uygun yeni bir array oluşrturup mevcut arry variable ındaki
        //elemenları ona eklemeliyiz

        //aşağıdaki array e 3 elemaınını eklemek istersek

        int [] arry={2,5,6,9};


        int [] yeniArry=  new int [arry.length+1];    // length olarak eski arrayimizin uzunluğunun bir fazlası deddik

        for (int i = 0; i < arry.length; i++) {    //for loop kullanarak eski arry deki elemanlarımızı yeniye ekledik
            yeniArry[i]=arry[i];

        }
        System.out.println(Arrays.toString(yeniArry));    //[2, 5, 6, 9, 0]  sona default değeri atadı lengthi uzattık

        yeniArry[yeniArry.length-1]=3;                  //yeni elemanı array e ekledik
        System.out.println(Arrays.toString(yeniArry));  //[2, 5, 6, 9, 3]

        arry=yeniArry;       //burdada yeniArry i yeni haliyle elemanlarıyla eski arry e ekledik
    }
}
