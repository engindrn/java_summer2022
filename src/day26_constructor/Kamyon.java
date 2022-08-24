package day26_constructor;
public class Kamyon {

    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;
    public int fiyat;


    public Kamyon(String marka, String model, int yil, int fiyat) {

        this.marka=marka;                //parametra olarak gelen bu bilgileri(marka model ..)yukardaki objeye ait
        this.model=model;               //instance variable lara atamamız lazım
        this.yil=yil;
        this.fiyat=fiyat;
        /*
          bizim temel amacimiz KamyonRunner'da argument olarak girilen degerin
          Kamyon class'inda intstance variable'a atanmasi

          Ancak scope konusunda ogrendigimiz gibi (aynı olduğu için marka=marka)
          Kamyon constructor scope'unda marka oldugu icin
          instance marka'ya gitmiyor

          Bu karisikligi gidermek icin instance variable'lari
          belirli hale getirmemiz lazim

          Java bunun icin this keyword'u olusturmustur. this yazınca bu clasın instance variable ını belirtir

          Genel kullanim acisindan this keyord'u kodu herkesin anlamasini
          kolaylastirdigi icin tercih edilir
         */
    }

    public Kamyon(String marka, String model) {          //burdada yapabiliriz sağ tuş generata contructor deyip olmasını
        this.marka = marka;                             //istediğimiz parametreleri seçtik marka-model
        this.model = model;            //biz oluşturmasakta kalan diğer özelliklerde (yıl-fiyat) olacak (toString methodu) ve
    }                                  //default değerler alacak

    public Kamyon(){
    }
    @Override
    public String toString() {                         //sağ tık generate seçip toString ile oluşturuduk
        return
                "\nmarka : " + marka  +
                        "\nmodel : " + model  +
                        "\nyil : " + yil +
                        "\nfiyat : " + fiyat ;
    }
}