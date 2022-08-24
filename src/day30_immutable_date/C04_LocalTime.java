package day30_immutable_date;
import java.time.LocalTime;
public class C04_LocalTime {

    public static void main(String[] args) throws InterruptedException {

        LocalTime time1=LocalTime.now();
        System.out.println(time1); // 15:18:28.813475400 //nano saniye sondaki

        /*
         Bizim olusturdugumuz date ve time
         canli saat veya tarih degildir
         LocalTime.now(); kullandigimiz satirda
         o anki tarih veya saati alip
         bizim variable'imiza store eder.( Depolar)
         time1 variable'inin degeri SABITTIR
         */
        Thread.sleep(3000);   // bu kodda java 3 saniye bekler

        time1=LocalTime.now();   //local time bilgisayardan alıp yeniden değer olarak ekledik. üç saniye sonra fark oluşer
        System.out.println(time1);                        //15:18:31.820130500



        System.out.println(time1.getSecond()); // 32
        System.out.println(time1.plusSeconds(10000)); // 21:18:12.631502800
        System.out.println(time1.minusMinutes(200)); // 15:13:59.829050300
        System.out.println(time1.withHour(3)); // saati 3 yapip yazdirdi
    }
}
