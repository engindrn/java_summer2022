package RECAP;

public class Q07_StringManipulation {
    public static void main(String[] args) {

        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"     *String olduğu için işlem yapamıyoruz
        // String str 2= "$10.55"
        // *** ipucu: Double parseDouble() methodunu kullanabilirsiniz.


     /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
        replace String bir manipulationdur bir eski karakter vardır ve yerini new yeni karakter vardır

         1) \\d    ==> tum rakamlar
             \\D    ==> tum rakam disi character ler
         2) \\w   ==> A->Z        a->z         0->9    _
             \\W  ==> A->Z        a->z         0->9    _ disindaki hersey
         3) \\s   ==> space
             \\S   ==> space disindaki hersey  */

        String str1= "$13.99";
        str1=str1.replaceAll("\\D","");
        System.out.println("str1 = " + str1);                 //str1 = 1399

        String str2= "$10.55";
        str2=str2.replaceAll("\\D","");
        System.out.println("str2 = " + str2);                  //str2 = 1055
        System.out.println(str1+str2);                         //13991055 //concat


        double sayi1= Double.parseDouble(str1); //sayi1 degiskenini String olan str1 den double a donusturduk - 1399
        double sayi2= Double.parseDouble(str2); //sayi2 degiskenini String olan str2 den double a donusturduk - 1055
        double toplam = (sayi1+sayi2)/100;      // 2454/100   virgüllü olamsı için tekrar 100 böldük
        System.out.println("$" + toplam);     //$24.54


    }
}
