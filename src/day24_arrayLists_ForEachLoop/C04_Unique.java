package day24_arrayLists_ForEachLoop;
import java.util.Arrays;
public class C04_Unique {
    /*
    Soru 2) Verilen bir array deki unique elementleri yeni bir array olarak donduren bir
method olusturun
     */
    public static void main(String[] args) {
        int[] input={1,3,5,6,2,4,6,1,7,8,9,5,1,3}; // sonuc: 2,4,7,8,9
        yeniArr(input);
    }
    private static void yeniArr(int[] input) {  // tekrar Eden: 1,3,5,6
        int count=0;
        int tekrarEtmeyen=0;
        for (int i = 0; i < input.length ; i++) {
            for (int j = 0; j <input.length ; j++) {
                if (input[i]==input[j]){
                    count++;
                }
            }
            if (count==1){
                tekrarEtmeyen++;
                count=0;
            } else {
                count=0;
            }
        }
        System.out.println("tekrarEtmeyen = " + tekrarEtmeyen);
        int [] yeniArr=new int[tekrarEtmeyen];
        int sayac=0;
        int arrDegeri=0;
        for (int i = 0; i < input.length ; i++) {
            for (int j = 0; j < input.length ; j++) {
                if (input[i]==input[j]){
                    sayac++;
                }
            }
            if (sayac==1){
                yeniArr[arrDegeri]=input[i];
                arrDegeri++;
                sayac=0;
            } else {
                sayac=0;
            }
        }
        System.out.println(Arrays.toString(yeniArr));
    }
}