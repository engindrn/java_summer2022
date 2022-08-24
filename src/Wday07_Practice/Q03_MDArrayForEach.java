package Wday07_Practice;

public class Q03_MDArrayForEach { /*
 * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
 * yaziniz
 * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
 *
 * OUTPUT : Arraydeki cift sayilarin toplami : 30
 */
    public static void main(String[] args) {
        ciftlerToplami();
    }
    public static void ciftlerToplami() {
        int[][]arr={{1,3,6},{2,8},{5,7,9,14}};
        int toplam=0;
        for (int[] each:arr
        ) {
            for (int eachIc:each
            ) {
                if(eachIc%2==0){
                    toplam+=eachIc;
                }
            }
        }
        System.out.println("Cift sayilar toplami : "+toplam);
    }

}
