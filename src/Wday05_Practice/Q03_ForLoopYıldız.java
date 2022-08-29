package Wday05_Practice;

public class Q03_ForLoopYıldız {
    public static void main(String[] args) {
        /*Get the number of rows and columns from user.
           Create a rectangle.

        rows = 3 and column = 5 ==> * * * * *
                                    * * * * *
                                    * * * * *        */

        int satirsayisi=3;       //scanner ile de yapılabilir dinamik olması açısınıdan
        int sutunsayisi=5;



        for (int i = 0; i <satirsayisi; i++) {
            for (int j =0; j <sutunsayisi; j++) {
                System.out.print( "* ");
            }
            System.out.println("");
        }


}}
