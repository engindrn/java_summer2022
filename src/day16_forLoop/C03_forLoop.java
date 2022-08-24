package day16_forLoop;

public class C03_forLoop {
    public static void main(String[] args) {

        //soru2 : 10 ile 30 arasındaki (10-30 dahil)sayıları aralarında virgül olarak aynı satırda yazdırın

    /*    for (int i = 10; i <=30 ; i++) {
            System.out.print(i+",");        bu şekilde kod hem dinemik değil hemde 30'dan sonrada virgül koyar*/

        int bas=10;
        int son=30;

        for (int i = bas; i <=son; i++) {
            if(i<son){
                System.out.print(i+",");
            }else
                System.out.print(i);




        }




    }


}
