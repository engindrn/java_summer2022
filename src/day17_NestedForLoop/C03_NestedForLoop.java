package day17_NestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        /*
    verilen yukseklik ve boy degerine gore
    *'lardan olusan bir dikdortgen olusturalim
    yukseklik :3  boy:4
    * * * *
    * * * *
    * * * *
 */
        int yukseklik=4;        //dış loop 4 kez dönecek ve aşağı doğru gidecek satırları kontrol edecek
        int en=8;              //iç loop 8 kez dönecek ve sütunları kontrol edecek


        for (int i = 1; i <=yukseklik ; i++) {

            for (int j = 1; j <=en ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
