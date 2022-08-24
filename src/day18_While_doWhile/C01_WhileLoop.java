package day18_While_doWhile;
public class C01_WhileLoop {

    public static void main(String[] args) {

        /*
        Soru 4 ) Kullanicidan baslangic ve bitis haflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
        Kullanicinin hata yapmadigini farz edin.
         */

        char ilkharf='f';
        char sonharf='t';

        char temp=ilkharf;      //ilkharf korumak için
        String buyult="";           //char primitive olduğu için method kullanamayız bu yüzden ilerde kullanmak için

        while (temp<=sonharf){
            buyult=(temp+"").toUpperCase();      //temp hiçlikle toplayarak String oldu ve method kullanabildik
            System.out.print(temp +" ");
            temp+=1;
        }


    }
}