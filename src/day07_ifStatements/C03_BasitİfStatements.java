package day07_ifStatements;

public class C03_BasitİfStatements {
    public static void main(String[] args) {

        /* bir if statementte {} kullanılmazsa java ilk satırı şart ile bağlar
          sonraki şartlar bağımsız olur

          eğer birden fazla satır if satırına bağlanmış ise mutlaka {} kullanmalıyız
         */

        int sayi= -23 ;
        if (sayi>0) {                                            //{içine yazılanı if 'e bağlar}
            System.out.println("sayi pozitif");
            System.out.println("pozitif kalacaktir");
            System.out.println("ucuncu satir");
        }



        if (sayi%2==0)
            System.out.println("sayi cift");             // bir tek bu satır if ile şarta bağlı çalışır
            System.out.println("cift kalacaktir");       //{} olamdğı için şart sağlanmasada hep çalışr
             System.out.println("ucuncu satir");        //{} olamdğı için şart sağlanmasada hep çalışr

             if(sayi%5==0)
            System.out.println("sayi 5'in tam kati");

    }
}
