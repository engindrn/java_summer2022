package ÇALIŞMA1;

public class NestedForLoop {

    public static void main(String[] args) {

      /*  Aşağıdaki grid şeklini yazan Java Kodunu yazınız.

                Beklenen Çıktı:
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0    */


    int yukseklik= 10;
    int en=10;

    for(int i=1; i<=yukseklik; i++){
        for(int j=1; j<=i; j++){                         //en e i kadar dersek üçgen olur
                System.out.print(0 +" ");
        }
        System.out.println("");
    }
}
}


