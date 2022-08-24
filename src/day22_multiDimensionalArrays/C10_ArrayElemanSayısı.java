package day22_multiDimensionalArrays;

public class C10_ArrayElemanSayısı {
    public static void main(String[] args) {

        int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};

        int elemanSayisi=0;

        for (int i = 0; i <arr.length; i++) {

            for (int j = 0; j <arr[i].length; j++) {

                elemanSayisi++;
            }
        }
        System.out.println(elemanSayisi);
    }
}
