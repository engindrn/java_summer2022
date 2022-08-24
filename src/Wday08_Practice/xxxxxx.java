package Wday08_Practice;

import java.util.Scanner;

public class xxxxxx {

        // Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.

        public static void main(String[] args) {
            Scanner scan =new Scanner(System.in);
            System.out.print("bir cumle giriniz :");
            String cumle = scan.nextLine().toLowerCase();


        String[] arr = cumle.split("");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("s")) {
                arr[i] = "5";
            }
            if (arr[i].equals("a")) {
                arr[i] = "4";
            }
            if (arr[i].equals("e")) {
                arr[i] = "3";
            }
            if (arr[i].equals("i")) {
                arr[i] = "1";
            }
            if (arr[i].equals("o")) {
                arr[i] = "0";
            }
            System.out.print(arr[i]);
        }
    }
}
/*Scanner scan=new Scanner(System.in);
String s="5", a="4", e="3", i="1",o="0", u="x";
String sonuc="";

sonuc=mesaj.replaceAll("s",s);
sonuc=sonuc.replaceAll("a",a);
sonuc=sonuc.replaceAll("e",e);
sonuc=sonuc.replaceAll("i",i);
sonuc=sonuc.replaceAll("o",o);
sonuc=sonuc.replaceAll("u",u);


System.out.println("sonuc = " + sonuc);*/