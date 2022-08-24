package Çalışmalar;

public class Arrays {
    public static void main(String[] args){

        String [] isimler={"Ali", "Veli", "Ayse", "Fatma"};  // ali yerine can ayse yerine gul atayın

        isimler[0]="Can";
        isimler[2]="Gul";


        System.out.println(isimler.length);//4     //int değer döndürdüğü için direk yazdırdık

        System.out.println(java.util.Arrays.toString(isimler)); //[Can, Veli, Gul, Fatma]

        for (int i = 0; i < isimler.length; i++) {
            System.out.print(" "+isimler[i]);                       //Can Veli Gul Fatma


        }
        System.out.println("");

        System.out.println(isimler.length-1); //3   indexi verdi



    }

}
