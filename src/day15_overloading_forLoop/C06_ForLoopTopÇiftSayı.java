package day15_overloading_forLoop;

public class C06_ForLoopTopÇiftSayı {
    public static void main(String[] args) {


        //30 dahil 50 dahil aradaki çift yayıların toplamı



       int toplam=0;
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
