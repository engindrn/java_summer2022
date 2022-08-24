package day28_staticBlock;
public class C02_PassByValue {

    public static void main(String[] args) {

        double satisFiyati=100;

        System.out.println(indirimliFiyat(satisFiyati)); // 90      //parametremizi girip direk yazdırdık
        System.out.println(satisFiyati); // 100
        System.out.println(indirimliFiyat(satisFiyati)); // 90

        // iki farkli method'da satisFiyati isminde variable olabilir
        // Java buna itiraz etmez cunku, scope'lari farklidir.

    }
    public static double indirimliFiyat(double orjinalFiyat){ //ismi farklıda olsa başdaki dooble satısFiyatı dır.

        // methodumuz %10 indirim yapip
        // yeni fiyati main methid'a dondursun

        double satisFiyati=orjinalFiyat*0.9 ;

        return satisFiyati;
    }
}