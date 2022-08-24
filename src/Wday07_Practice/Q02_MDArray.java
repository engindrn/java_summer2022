package Wday07_Practice;

public class Q02_MDArray {


    /*
     *  String 2D array olustur
     *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
     *  String de $ varsa 3.2 ile carp
     *  String de € varsa 4.2 ile carp
     *  elemanlarin toplamini double olarak yazdir
     */
    public static void main(String[] args) {

        String[][] arr={{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};
        double toplam=0;
        double deger$=0;
        double deger€=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j].contains("$")){
                    deger$=Double.parseDouble(arr[i][j].replaceAll("\\$",""));
                    // System.out.println(deger$);
                    deger$*=3.2;
                    toplam+=deger$;

                }
                if(arr[i][j].contains("€")){
                    deger€=Double.parseDouble(arr[i][j].replaceAll("€",""));
                    //System.out.println(deger€);
                    deger€*=4.2;
                    toplam+=deger€;

                }

            }

        }
        System.out.println("toplam = " + toplam);

    }

}
