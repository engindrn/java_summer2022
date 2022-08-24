package day35_inheritancedaConstructorKullanimi;
public class LOgretmen {

    LOgretmen(){                      //buraya gelir extends olmadığı için burda kalır yazdırır geldiği yere döner
        System.out.println("LOgretmen parametresiz cons");
    }

    LOgretmen(String isim){
        this();
        System.out.println("LOgretmen parametreli cons");
    }
}

