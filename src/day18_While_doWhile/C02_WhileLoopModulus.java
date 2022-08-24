package day18_While_doWhile;
public class C02_WhileLoopModulus {
    public static void main(String[] args) {
        /*
        Soru 7 ) Kullanicidan bir sayi alin
        ve bu sayinin rakamlari toplamini yazdirin
         */
        int input= 5432;

        int rakamlarToplami=0;
        int birlerBasagi=0;
        int temp=input;             //sayının kaybolmaması için atama yapıp onla işlem yapacaz orjınal oyle kalacak

        while(temp>0){
            birlerBasagi=temp%10;
            rakamlarToplami += birlerBasagi;
            temp /= 10;
        }
        System.out.println(input + " sayisinin rakamlar toplami : " + rakamlarToplami);
    }
}