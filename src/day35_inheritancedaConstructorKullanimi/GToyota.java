package day35_inheritancedaConstructorKullanimi;
public class GToyota {


    GToyota(){
        //burda yok ve yazdırır ve kendi child ına doner kaldığı yere
        System.out.println("GToyota parametresiz cons");
    }


    GToyota(String isim){
        // super(isim);  extends olmadigi icin super constructor call'u java kabul etmez
        System.out.println("GToyota parametreli cons");
    }
}
