package day16_forLoop;

public class C02_ForLoopHatalar {
    public static void main(String[] args) {

        //başlangıc noktaasından sonra bitis sartına yaklaşmıyorsak sonsuz loop oluşur


        for (int i = 0; i >=-10 ; i++) {            //0 büyüktür -10 çalışır 0'ı yazdırır değeri bir artırır devam eder
            System.out.println(i);                  //1 .....ara giderek açılır ve sonsuz loop oluşur
            
        }


        for (int i = 0; i >5 ; i++) {           //0 büyüktür 5 den false olunca loop is broken
            System.out.println(i);

            //burda kod çalışır forloop çalışır loop badysi hiçbir zmaan devreye girmez.
        }
    }



}




