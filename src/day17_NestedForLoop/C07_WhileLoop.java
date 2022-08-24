package day17_NestedForLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {
        //20 den 50 ye kadar sınırlar dahil çift sayıları yazdırın
        //for loop ile yapalım


        int bas = 20;
        int bitis = 50;

        for (int i = bas; i <= bitis; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");


            }
        }
        System.out.println(""); //alt satıra geçmek için

        int temp=bas;               //başlangıc değerini bozmamak için yeni bir atama yaptık onla devam ettik
        while (temp <= bitis) {

            if (temp%2==0){
                System.out.print(temp+" ");
            }
            temp++;
        }
    }
}