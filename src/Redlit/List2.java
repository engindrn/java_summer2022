package Redlit;

import java.util.Arrays;

public class List2 {
    public static void main(String[] args) {

       /* Create a 10-element list. Swap the 8th element with the 3rd element.
        INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
        Output:
        [Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
         */
        String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
        int birinciElement = 2 ;
        int ikinciElement = 7 ;

        String temp = names[birinciElement] ;        // Kemali kaybolmamasi icin gecici tempe atadim
        names[birinciElement] = names[ikinciElement] ;    // 7. indexi 2. indexe atadim
        names[ikinciElement] = temp ;               // tempe atadigim Kemali Furkanin yerine koydum
        System.out.println(Arrays.toString(names)); //[Umit, Emin, Furkan, Kerem, Taylan, Orhan, Sinan, Kemal, Ahmet, Ali]
    }
}
/* String temp = names[2] ;        // Kemali kaybolmamasi icin gecici tempe atadim***
        names[2] = names[7] ;    // 7. indexi 2. indexe atadim
        names[7] = temp ;               // tempe atadigim Kemali Furkanin yerine koydum
        System.out.println(Arrays.toString(names)); //[Umit, Emin, Furkan, Kerem, Taylan, Orhan, Sinan, Kemal, Ahmet, Ali]*/