package day04_dataCasting;

public class C02_DataCasting {
    public static void main(String[] args) {

        int sayi1=23;
        int sayi2=5;

        System.out.println(sayi1/sayi2);   //4,6 değil 4 yazdırır ikiside int olduğundan sonucu int olur küsüratı atar
        System.out.println(25*7/3);         //58,6666    58 yazdırır

        double sayi3= 5;
        System.out.println(sayi1/sayi3);    //4,6 iki variable'in data türü değişik olduğunda daha kapsamlı olanı
                                                //data türü olarak kabul eder- double>int
    }
}
