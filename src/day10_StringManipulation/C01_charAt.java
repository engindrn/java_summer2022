package day10_StringManipulation;

public class C01_charAt {
    public static void main(String[] args) {

        String str="java ogrenmek ne guzel";

        System.out.println(str.charAt(0));          //ilk hafr yazdırır

        System.out.println(str.toUpperCase().charAt(7));  // R yazdırır

        //String atama olmadığı için kalıcı olarak değişmedi sadece bu işlem için büyütüp 7. harfi aldık

        System.out.println(str.charAt(21));      //l
       // System.out.println(str.charAt(22));      // StringIndexOutOfBoundsException(index sınırların dışında)

        /* son harfi bulmak için str'ın bir eksiğini index olarak gireriz.
        eğer index olarak uzunluğu veya daha bir sayıyı girersek java exeption verir
         */

        //charAt() kullandığımızda sonuç char olacağı için artık manipulation yapamayız
        //str methodlarından kullanmamız geren bir method varsa charAt den önce kullanmalıyız

        System.out.println(str.length());  //22 index
        System.out.println(str.charAt(21)); //bir eksiği son index'i verir


    }
}
