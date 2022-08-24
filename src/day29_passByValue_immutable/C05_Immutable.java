package day29_passByValue_immutable;
public class C05_Immutable {

    public static void main(String[] args) {

        String isim= "Mine";
        isim=isim.toUpperCase();             //kalıcı olması için atamam yaparız.
                                                //String mutable olduğu için atamada olsa tekrar aynı referansda yeni
        System.out.println(isim); // MINE       //isim variable olşturulur boşuna yer kaplar

        isim="Mevlut";

        System.out.println(isim); // Mevlut

        for (int i = 0; i <100 ; i++) {       //burda ekstradan 100 obje oluşturulur
            isim += ".";
        }
        System.out.println(isim);
    }
}
  //kullanımı kolay olduğu için şimdiye kadar String kullandık