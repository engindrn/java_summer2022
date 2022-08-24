package day15_overloading_forLoop;

public class C08_ForLoop {
    public static void main(String[] args) {

            C07_StringTersCevirme.terstenYazdır("engin");


            //100 den 1'e kadar sınırlar dahil 8 'e bölünen sayıları yazdırın(method istememiş mainde yapıyoruz)


        for (int i = 100; i >=1 ; i--) {            // geriye doğru yapacağız o şekilde istenmiş
         if(i%8==0){                                //1'e eşit olana kadar geriye döndi ve alttaki methodlada 8 e bölenleri
             System.out.print(i+" ");               //tespit eidip yazdırdık,


        //ÖNEMLİ: print işini for loop un parantezleri içerisinde yaptığımmızda döngü her döndüğünde o değeri yazar
         }

        }



        //1500 ile 1600 arası sınırlar dahil 7 ile bölünen sayıların toplamı

       int toplam=0;
        for (int i = 1500; i <=1600 ; i++) {
            if (i%7==0){
                toplam+=i;
            }
        }
        System.out.println("7 ile bölünen sayılar "+toplam);  //buraya for loop curly braces dışına
                                                              // yazarsak döngü işlemi biter sonucu yazar
    }

}
