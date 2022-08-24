package day35_inheritancedaConstructorKullanimi;
public class FMemur extends EMuhasebe{


    /*
      Extends keyword kullanilan classlarda
      ister default consructor bulunsun
      istersek de biz yeni constructor(lar) olusturalim
      Java constructor'in ilk satirina
      super(); constructor call yazar

      super(); constructor call, default constructor'a benzer
      gorunmese de orada vardir ve calisir
      ancak biz ilk satira farkli bir constructor call yazarsak
      Java super(); 'i siler

      Eger biz mudahale edip kendi constructor call'umuzu olusturmazsak
      Javanin default olarak olusturdugu constructor call
      her zaman parametresizdir
      super();
     */


    FMemur(){
        //burda Super() vardır yazdırmaz parent class a gider
        System.out.println("Memur parametresiz cons");
    }


    FMemur(String isim){
        //burda Super() vardır yazdırmaz parent class a gider. call parametresiz olduğu için ordada parametresize gider
        System.out.println("Memur parametreli cons");
    }


    public static void main(String[] args) {

       // FMemur mmr1=new FMemur();  parameteresiz olunca bu classdaki parametresiz constructor a gider orda görünmesede
                                   //super() olduğu için paranta gider onunda parentı varsa oraya gider yoksa ordakini ilk
                                    //yazdırır ve childa doğru gelir en son child ı yazdırır

        FMemur mmr1=new FMemur("ali"); // burdan parametreliye gider ama göremesekte constructor call yani Super()
                                            //olduğu için ve bu callda parameetresiz olduğu için parent classda parametresiz
                                            //contructor a gider
    }
}
