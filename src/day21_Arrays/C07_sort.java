package day21_Arrays;
import java.util.Arrays;
public class C07_sort {

    public static void main(String[] args) {

        int[] sayilar={5,7,1,5,4,7,9};

        // Array'i Arrays class'ini kullanarak natural sirali hale getirebiliriz yani sayilarsa kücükten büyüğe doğru
        //String ise harf sirası (natural sirali)
        //sort dan sonra sıralama kalıcı olur

        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar)); // [1, 4, 5, 5, 7, 7, 9]


        // burdan en büyük değeri bulabilriz. sort ile sıralandığı için

        System.out.println(sayilar[sayilar.length-1]);  //9 en büyük deger

        System.out.println(sayilar[0]);    //1 en küçük değer




    }
}