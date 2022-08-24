package Çalışmalar;

public class MethodOluşturmaReturn {

    public static void main(String[]args){

        /*input olarak verilen isim ve soyismin ilk harflari büyük, diğer harfleri kucuk olark degistirip
        pragramın sonraki bolumlerinde kullanılabilek uzere isimSoyisim variable ına atayacak bir method oluşturun

        input= isim:Ali soyisim:Can
        output: isimSoyisim: Ali Can
         */

        String isim="ALİ";
        String soyisim="CAN";

      String isimSoyisim= isimDüzenle(isim, soyisim);      //return ile gelen yeni halini önceden belirlediğimiz
                                                            //variable kaydettik ve yazdırdık.
        System.out.println("ilk hali:"+isim+" "+soyisim);
        System.out.println("degistirilmis hali:"+" "+isimSoyisim);

    }

    public static String isimDüzenle(String isim, String soyisim) {
        String yeniIsim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        String yeniSoyIsım=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();

        return yeniIsim+" "+yeniSoyIsım;
    }

}
