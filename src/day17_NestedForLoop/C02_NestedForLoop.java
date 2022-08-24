package day17_NestedForLoop;

public class C02_NestedForLoop {
    public static void main(String[] args) {

        //verilen sayıya göre carpım tablosu oluşturun
        /*input;3
        1 2 3
        2 4 6
        3 6 9
         */

        int input=4;                //dinamik olması için input ile yapılabilir

        for (int i = 1; i <=input ; i++) {              //satır sayısının kaç olmasını istersek ilk loop onun için
                                                    //ilk for loop içinde ikinci forloop u oluşturuyoruz
            for (int j = 1; j <=input ; j++) {            //j de sütünü kontrol eder kaçtan kaça olduğunnu

                System.out.print(i*j+" ");        //yan yana yazdırmak icin print yaptık

            }
            System.out.println("");    // iç loop un dışına dış loppun içine iç loop döndükçe asagı satıra
        }                               //geçmesi için boş bir sout koyduk
    }
}
