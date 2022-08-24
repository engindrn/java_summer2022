
package day35_inheritancedaConstructorKullanimi;
public class HCorolla extends GToyota{


    HCorolla(){
        //Super() parametresiz call burdada vardır
        System.out.println("HCorolla parametresiz cons");
    }


    HCorolla(String isim){
        super(isim);
        System.out.println("HCorolla parametreli cons");
    }
}