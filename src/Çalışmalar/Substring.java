package Çalışmalar;



public class Substring {
    public static void main(String[] args) {

       String isim="engin";
       String soyisim="durna";
       String kartno="1234 7895 4569 7458";


       // isim=isim.substring(0,1).toUpperCase();       //bu işlemden sonra artık isim değeri sadece E oldu
                                                     // bundan sonra isim variable'nın kalan kısmıyla işlem yapamayız
                                                      // bu yüzden isimin ilk harfini farklı bi variable atamalıyız

        String isimilkharf=isim.substring(0,1).toUpperCase();
        String isimkalan=isim.substring(1).replaceAll("\\w","*");

        String soyisimilkharf=soyisim.substring(0,1).toUpperCase();
        String soyisimkalan=soyisim.substring(1).replaceAll("\\w","*");

       String kartnoilk4=kartno.substring(0,4);
        String kartnokalan=kartno.substring(4).replaceAll("\\d","*");

        System.out.println(isimilkharf+isimkalan+"\n"+ soyisimilkharf+soyisimkalan+"\n"+
                           kartnoilk4+kartnokalan);




    }
}
