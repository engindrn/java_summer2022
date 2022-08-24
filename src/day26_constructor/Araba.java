package day26_constructor;
public class Araba {

    //bu claası arabaların ortak özelliklerini belirmek için oluştururuz sonra nereden obje oluşturulursa oluşturulsun
    // burdaki temel özellikleri görebilir ve kullanabilir


    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;
    public int fiyat;


    public Araba(String markaR, String modelR, int yilR, int fiyatR) {   //create constructor dedik bu oluştu
        marka=markaR;
        model=modelR;
        yil=yilR;
        fiyat=fiyatR;
    }


    public Araba(){                    //biz parametli bir üstteki contructoru oluşturduk bu yüzden
    }                                  //defalt contructoru java sildi ama onu parametresiz araba1 objesi kullanıyordu
                                      //bu yuzden hata verdi bizde onun için bir contructor oluşturuduk

        /*
        biz herhangi bir constructor olusturdugumuzda
        Java default constructor'i siler
        eger biz projemizde bir sorun yasanmasini istemiyorsak
        mutlaka default constructor yerine
        parametresiz bir constructor olusturmaliyiz
         */

        /*birden fazla constructor olduğunda java parametereye göre hangisinin devreye gireceğine karar verir
        method overloading deki gibi diyebiliriz. artık yukarda iki tane constructorumuz var biri parametreli diğeri değil
        */

        public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir");
    }
        public void maxHiz(int hiz){
        System.out.println("Bu araba max " + hiz + " km hiz yapar" );
    }
}
