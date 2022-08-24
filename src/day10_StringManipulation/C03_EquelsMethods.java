package day10_StringManipulation;

public class C03_EquelsMethods {
    public static void main(String[] args) {

        String str1="Ali Can";
        String str2="ALİ CAN";
        String str3="Ali can"+"";
        String str4="Ali Can";
        String str5=new String("Ali Can");

        System.out.println(str1==str2);           //false

        System.out.println(str1==str3);            //true
        System.out.println(str1.equals(str3));     //true

        System.out.println(str1==str5);            //false
        System.out.println(str1.equals(str5));      //true

        System.out.println(str1.equals(str4));      //true

        System.out.println(str3.equals(str5));      //false
        System.out.println(str3==str5);             //false

        /*Stringlerde aynı string olsa bile == sign herhezman çalışmaz emin olmak için equels() methodunu kullanmalıyız

        equels() da tek dikkat edilecek şey metinleri ifadelerin karakterlerin aynı olması şarttır
         */



    }
}
