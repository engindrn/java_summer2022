package day17_NestedForLoop;

public class C05_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen input'a gore
        *'lardan olusan asagıdaki sekli olusturun

    *               //satır 1 sütün 1
    * *             //satır 2 sütün 2
    * * *           //satır 3 sütün 3   bu şekilde devam ettiği için inner loop 1 den i'ye kadar
    * * * *
    * * *
    * *
    *
                //artan kısmı nested For Loop ile yapalım*/

        int input=4;

        for (int i = 1; i <=input ; i++) {                  //satır sayısını verecek
            for (int j = 1; j <= i ; j++) {            //üçgen old için inner loop 1 den başlar i'ye kadar gider
                System.out.print("* ");                 //birici satırda i bir inner bir ikinci satıır i 2 inner da 2..

            }
            System.out.println("");         //  *
                                           //   * *
                                          //    * * *
                                          //    * * * *    bu aşamada bu kısma kadar yaptık yarının bir fazlasına kadar
                                         //kalan kısım için 4 ise 3, 5 ise 4 yani input-1 ile yapacağız
        }

        for (int i = input-1; i >=1 ; i--) {            //artık azalark gidecek
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
