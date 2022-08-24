package day13_MethodCreation;

public class C01_StringManupulation {
    public static void main(String[] args) {
        /*
Soru 2-) String şeklinde verilen aşağıdaki fiyatların toplamını bulunuz.
-String str1 = "$13.99"
-String str2 = "$10.55"
ipucu= Double.parseDouble() metodunu kullanabilirsiniz.
 */
        String str1 = "$13.99";
        String str2 = "$10.55";

        str1 = str1.replace("$", "");
        str2 = str2.replace("$", "");

        double sayı1= Double.parseDouble(str1);        //String oldukları için toplama işlemini yapabilmek için doubleçevirdik
        double sayı2 =Double.parseDouble(str2);

        System.out.println(sayı1+sayı2);


    }
}
  // String str1 = "$13.99";
// String str2 = "$10.55";
//
//str1 = str1.replace("$", "");
//str2 = str2.replace("$", "");
//
//double sayı1= Double.parseDouble(str1);
//double sayı2 =Double.parseDouble(str2);
//
//System.out.println("$" + (sayı1+sayı2));