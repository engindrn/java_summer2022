package day15_overloading_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {

        //1'den 5'e kadar (5 dahil) olan tamsayıları  toplayalım

        int toplam=0;                  //döngü içinde topalnan sayıları koyabilmek için bir variable oluşturduk.

        for (int i = 1; i <=5; i++) {
            toplam+=i;                      //döngü süslü parantezi içerisine yazdığımız variable'a değeri atayacak
            
        }

        System.out.println("toplam :"+toplam);  //yazdırma işlemini for döngüsü içine yazsak döngü bitene kadarki her
                                                //değeri yazdırır


        //10 (dahi) 20 (dahil) aradaki sayıların toplamı

        toplam=0;        //değerini sıfırladık yukardaki işlemden sonra 15'di


        for (int i = 10; i <=20 ; i++) {
            toplam+=i;

        }
        System.out.println(toplam);

        //30 dahil 50 dahil aradaki çift yayıların toplamı

        toplam=0;
        for (int i = 30; i <=50 ; i+=2) {                   //başlangıç sayısını biliyorsak bu şekilde yapılabilir
            toplam+=i;
        }
        System.out.println("30-50 arası çift saayıları toplam "+toplam);

        toplam=0;

        for (int i = 30; i <= 50; i++) {                //mantıklı olan yöntem ilk değerin bilmesekte önemi yok
            if (i%2==0){
                toplam+=i;

            }
        }
        System.out.println(toplam);

        //1500 ile 1600 arası sınırlar dahil 7 ile bölünen sayıların toplamı

        toplam=0;
        for (int i = 1500; i <=1600 ; i++) {
            if (i%7==0){
                toplam+=i;
            }
        }
        System.out.println("7 ile bölünen sayılar "+toplam);
    }
}
