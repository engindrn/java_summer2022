package day25_Constructor;
public class CarRunner {

    public static void main(String[] args) {

        Car car1=new Car();         //main methodumuzun içine car class'ından bir obje oluşturduk


        car1.fiyat=150000;     //car1 nokta yazınca car1 objesine yeni değerler atayabiliriz
        car1.yil=2020;
        car1.marka="Toyota";

        System.out.println("Car1 bilgileri\nMarka : " + car1.marka +"\nModel : " + car1.model
                +"\nYil : " + car1.yil+ "\nFiyat : " + car1.fiyat);

        /*Car1 bilgileri
          Marka : Toyota
          Model : Model belirtilmedi      //bu classda model için bir atama yapmadığımız için car claasındakini yazdırdı
          Yil : 2020
          Fiyat : 150000   */


        Car car2=new Car();   // car2 için yeni bir obje oluşturduk

        System.out.println("Car2 bilgileri\nMarka : " + car2.marka +"\nModel : " + car2.model
                +"\nYil : " + car2.yil+ "\nFiyat : " + car2.fiyat);

        /*Car2 bilgileri
         Marka : Marka belirtilmedi     //burda bir atama yapılmadı ama objenin oluşturulduğu car clasında yapıldı o değeri aldı
         Model : Model belirtilmedi     //burda bir atama yapılmadı ama objenin oluşturulduğu car clasında yapıldı o değeri aldı
         Yil : 0        //bu class da bir atama yapılmadı objenin oluşturulduğu classda da bir atama yok bu yüzen default değer atandı
         Fiyat : 0      //bu class da bir atama yapılmadı objenin oluşturulduğu classda da bir atama yok bu yüzen default değer atandı


        /*
        Herhangi bir obje uzerinden bir variable yazdirmaya calistigimizda
        Java degeri su siralama ile arar
        1- o obje olusturulduktan sonra  bu classda bir deger atandi mi ?
        2- Objenin olusturuldugu class'da variable'a bir deger atanmis mi bakar
        3- O zaman data turune gore Java default degeri atar
         */
    }
}