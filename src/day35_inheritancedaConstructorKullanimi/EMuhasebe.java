package day35_inheritancedaConstructorKullanimi;
public class EMuhasebe extends DPersonel {


    EMuhasebe(){
        //burda Super() vardır. yazdırmaz parent class a gönderir
        System.out.println("Muhasebe parametresiz cons");
    }



    EMuhasebe(String isim){
        System.out.println("Muhasebe parametreli cons");
    }
}