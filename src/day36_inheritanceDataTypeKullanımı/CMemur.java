package day36_inheritanceDataTypeKullanımı;

public class CMemur extends BMuhasebe {


    protected int saatUcreti = 12;
    protected int gunlukMesai = 9;

    protected void maas(){
        System.out.println("Memurlar : " + (30*saatUcreti*gunlukMesai)+ " maas alir");
    }
    protected void ozelSigorta(){
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir");
    }


    public static void main(String[] args) {

        CMemur mmr1=new CMemur();

        System.out.println(mmr1.gunlukMesai); // 9     //önce bu classa bakar varsa onu alır. class levelda instance var
        System.out.println(mmr1.saatUcreti); // 12    //önce bu classa bakar varsa onu alır. class levelda instance var

        mmr1.maas(); // Memurlar : 3240 maas alir. bu class daki maas() methodumuz

        mmr1.ozelSigorta(); // Memurlar %60 indirimli ozel sigorta yaptirabilir. bu classdaki ozelSigorta() methodumuz

        mmr1.sigorta(); // bu classda yok parenttada yok grandParentta var ordan aldı

        System.out.println(mmr1.isim); // Personel classından
        System.out.println(mmr1.soyisim); // Personel classından
        System.out.println(mmr1.departmant);//Personel classından


        BMuhasebe mhsb1= new BMuhasebe();
        /*
        Her ne kadar Memur class'inin icinde olsak da
        olusturdugumuz obje Muhasebe class'indan
        cunku data turu ve constructor BMuhasebe

        String str="Murat";                                // String data type ı aynı zamanda class dır
        ArrayList<Integer> list=new ArrayList<>();         //ArrayList de bir class
        Integer sayi=20;                                    //wrapper class

        BMuhasebe class'i da obje olusturulabilen bir class'dir yani data turudur
        obje oluşturduğumuz her class aynı zamanda bir data türüdür
    */

        System.out.println(mhsb1.gunlukMesai); // 8  Muhasebe classından
        System.out.println(mhsb1.saatUcreti); // 10 Muhasebe clasından

        mhsb1.maas(); // Muhasebe Personel minumum : 2400 maas alir

        mhsb1.ozelSigorta(); // Muhasebe Isteyen calisanlara %50 indirimli ozel sigorta yapilir

        mhsb1.sigorta(); // Personel Tum personelimiz sigorta yapilir

        System.out.println(mhsb1.isim); // Personel
        System.out.println(mhsb1.soyisim); // Personel
        System.out.println(mhsb1.departmant);//Personel
    }
}

/* CMemur mmr1=new CMemur(); eğer data türü ve constructor aynı classdan ise direk o classa gideriz orda varsa onu alır
                                yoksa parent classa ordada yoksa ve grandparent class varya ordan alır

   BMuhasebe mhsb1= new BMuhasebe();  bu classda oluşturulmuş bu objenın data türü ve constructorı aynı
                                    yani muhasebe classından oluşturulmuş. mhsb1 objesi için muhasebe classına gitmeliyiz
                                    muhasebe classında varsa vardır orda yoksa muhasebe classının parentına gider.
                                    muhasebenin child ına gidemeyiz. parenta gidenbilirsin childa gidemezsin
 */