package day22_multiDimensionalArrays;

public class C05_MDArrayElemanYazdırma {

    public static void main(String[] args) {

        int [][] dizi = {{12,23},{25,67},{12,56}};

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.println("[" + i + "]" + "["+ j +"] = " + dizi[i][j] );
            }
        }

        System.out.println("\n");

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print(dizi[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}

