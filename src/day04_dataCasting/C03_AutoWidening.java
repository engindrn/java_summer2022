package day04_dataCasting;

public class C03_AutoWidening {
    public static void main(String[] args) {

       //dar veri türündeki bir değeri geniş veri türündeki variable' a otomatik olarak assign olur

        byte sayi1=23;
        short sayi2=55;

        int sayi3= sayi1*sayi2;    //88  byte short toplamları int siğar

        double sayi4=sayi1*sayi2;  //1265.0

        sayi4=sayi2/sayi1;   //2,391     işlem 55/23 sonucu ondalıklı olmasına rağmaen byte ve short tamsayı oldundan
                                                       //küsüratı atıp double olan sayı4 atar.
        System.out.println(sayi4);   //2,0 veri kaybı oluşur

        sayi4=(double)sayi2/sayi1;   //50,0/23=2,391 olur burda casting yaparak sayı2 double çevirdik
                                        //işlem paranteze alınmaz.
                                        //sayı2 ye bi atama yok casting sadece bu işlem için geçerli sayı2=55(short)
                                        // double olarak işleme girdi


    }
}
