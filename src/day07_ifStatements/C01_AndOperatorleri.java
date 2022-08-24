package day07_ifStatements;

public class C01_AndOperatorleri {
    public static void main(String[] args) {
          int a=10;
          int b=15;
          int c=20;

        System.out.println(a>0 && b<20 && c>b);  // true true true

        System.out.println(a<0 && b<20 && c>b);   //false true true

        /* java and operatorü konusunda bize iki seçenek sunar
           && kullanırsak ilk false bulduğunda artık sonucun false olacağını bilir ve geriye kalan şartlara bakmaz

           & kullanırsak tüm sartları kontrol eder ve sonra sonucu belirler
           Bu çalışma usulünden dolayı & operatorü && operatorüne göre daha yavaş olabilir.
         */

        System.out.println(a<0 & b<20 & c>b); //false




    }
}
