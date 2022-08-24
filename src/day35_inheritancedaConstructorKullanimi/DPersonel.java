package day35_inheritancedaConstructorKullanimi;
public class DPersonel {


    DPersonel(){
        //burda super() yoktur.extends yoksa constructor call yok. yazdırır gelldiği yere döner
        System.out.println("Personel Parametresiz cons");
    }


    DPersonel(String isim){

        System.out.println("Personel Parametreli cons");
    }
}