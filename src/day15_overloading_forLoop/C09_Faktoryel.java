package day15_overloading_forLoop;

public class C09_Faktoryel {
    public static void main(String[] args) {
        // input olarak veirlen bir tamsayi için faktoryel hesaplayıp yazdıran bir method oluşturun
        //verilen sayi  negatif veya  20 den büyük olursa girilen sayinin faktoryeli hesaplanamaz yazdırın
        
        int input=5;

         faktoryelHesapla(input);
    }

    public static void faktoryelHesapla(int input) {
        int faktoryel=1;                                 //çarpılacak olduğu için bir yaptık
        
        if(input<0 || input>10){
            System.out.println("girilrn sayinin faktoryeli hesaplanamaz");
        }else if (input==0){
            System.out.println("0!=1 dir");
        }else
            for (int i = 1; i <=input ; i++) {
                faktoryel*=i;
            }
        System.out.println("faktoryel değeri "+faktoryel);
    }
}
