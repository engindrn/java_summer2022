package day16_forLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        //verilen bir pozitif tamsayının tam bölenlerini yazdırın

        int input=20;

        for (int i = 1; i <=input; i++) {
            if(input%i==0){
                System.out.print(i+" ");                            //sayıların toplamını bulamk istersen yazdırmak yerine
                                                          //bir toplam variable i oluşturup geleni ona ekleyip forloop curly
                                                        //braces dışında yazdırabiliriz day15 C08 örneği var
            }

        }



    }
}
