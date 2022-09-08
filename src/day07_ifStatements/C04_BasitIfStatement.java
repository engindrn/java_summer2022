package day07_ifStatements;

public class C04_BasitIfStatement {

    public static void main(String[] args) {

        int sayi1=55;
        int sayi2=62;
        int sayi3=64;

        int enBuyukaSayi=sayi1;

        if(enBuyukaSayi<sayi2){
            enBuyukaSayi=sayi2;

        }if(enBuyukaSayi<sayi3){
            enBuyukaSayi=sayi3;
        }
        System.out.println(enBuyukaSayi);
    }
}
