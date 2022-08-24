package day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C12_ArrayForLoopElemanSayları {
    /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: yapacan ==> a = 3, y = 1, p = 1, n = 1, c = 1
            hallolur yaaa   ==> a=4  l=3 h=1 o=1 u=1 y=1
    */

    /*
    daha oncelikler Scannner obj olusturcaz
    onceliklr split methodu kullanicaz
    sonra sort yapcaz
    for loop a alcaz
    if ile control yapicaz ve sout ile yazdiricaz
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir string ifade giriniz ede");
        String str=scan.nextLine();

        String arr[]=str.split("");            //String ifademizi hiçlikten ayırarak array e atadık

        System.out.println("arr = " + Arrays.toString(arr));

        //sort() la
        Arrays.sort(arr);                 //eklenen karakterleri/sayilari/harleri sıraladık

        System.out.println("arr nin sortr lanmis hali = " + Arrays.toString(arr));

        int counter=0;                 //benzer elemanları sayması için counter variable oluşturduk

        for (int i = 1; i <arr.length ; i++) {       //i yi burda 0 dan başlatıp length-1 de yazılabilir

            if (arr[i-1].equals(arr[i])){          //i yi forLoopta 1 den başlattığımız için arry in 0. indexisini
                                                //alabilmek için arr[i-1] dedik ve arr[i] ye eşitmi dedik
                counter++;                    //eşitse conter i bir artırır
            }else{
                System.out.println(arr[i-1]+" karakteri "+(counter+1)); //eşit değilse arr[i-1] i yazır caounteri 1 artır
                counter=0;


            }if (i==arr.length-1){                                   //yani for loop da en sona geldiginde son karakteri
                System.out.println(arr[i]+" karakteri "+(counter+1)); //kontrol etmek için bu if bloğunu oluşturduk.
            }

        }
        //a,a,b,c olarak düşünürsek 0.indexdeki a ile 1. indexdeki a yı
        //                          1.indexdeki a ile 2. indexdeki b yi
        //                          2.indexdeki b ile 3. indexdeki c yi kontrol etmiştik ama son indexdeki c yi kontrol
        //                                                              edip yazırabilmek için son if bloğunu oluşturudk



    }
}
