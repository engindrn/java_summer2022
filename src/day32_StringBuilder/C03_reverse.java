package day32_StringBuilder;
public class C03_reverse {

    public static void main(String[] args) {

        // verilen bir input'u tersine cevirip,
        // bize donduren bir method olusturun

        String input="Hey gidi for loop gunleri";

        String tersInput= tersineCevir(input);   //tersinecevir methoduna imputumuzu yazıp gönderdik

        System.out.println(tersInput);
    }
    public static String tersineCevir(String input) {

        StringBuilder sb=new StringBuilder(input);     //String de ters çevirme işlemini direk yapamayacağımız için
                                             //yine String ifade yazılan String Builder oluşturup imputumuzu ekledik

        return sb.reverse().toString();     //tek sb.reverse olarak dönderemeyiz o şekilde StringBuilder olur
                                      //methodumuz String. bu yüzden .toString diyerek stringe çevirdik

    }
}
