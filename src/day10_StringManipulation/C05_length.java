package day10_StringManipulation;

public class C05_length {
    public static void main(String[] args) {

        String isim="ali can";
        System.out.println(isim.length());          //7

        String str="java öğren, isi kap";

        System.out.println(str.length());           //str'in karakter sayısını döndürür 19

        System.out.println(str.charAt(str.length()-1));  //son karakteri yazdıralım  p

        System.out.println(str.charAt(str.length()-3)); // sondan 3. karaklteri yazdıralım k

        /* jaca'da null pointer bir değer değil, karşısına yazıldığı variable'ın
        hiçbir değer almadığının işaretcisidir
         */

        String str2="";     //str2'ye bir değer atanmıştır bu değer hiçlik değeridir
        System.out.println(str2.length());  // 0 yazdırır

        String str3=null;    //str3' e bir değer atanmamıştır. null bu değer atamamayı işaret etmektedir
        System.out.println(str3.length());  // NullPointerException
                                            //bir değer atanmamışkı nasıl uzunluğu olsun
                                            //null bir eşitliğin karşısında olsada bu bir atam değildir.

    }
}
