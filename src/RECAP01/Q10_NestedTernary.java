package RECAP01;

public class Q10_NestedTernary {
    public static void main(String[] args) {

        /*
Final notu tanimlayin, Nested Ternary ile cozunuz
'A'  ->  "Gayet Basarili"
'B'  ->  "Basarili"
'C'  ->   "Ha gayret"
bu notlar disindakilere de Digerleri.. yazdiriniz
 */


    char finalNotu = 'B';

    String result = finalNotu=='A'? "Gayet Basarili" :finalNotu=='B' ? "Basarili":finalNotu=='C'? "Ha gayret":"Digerleri..";
    System.out.println("result = " + result);





            //if (finalNotu=='A'){
        //    System.out.println("Gayet basarili");
        //}else if ( finalNotu=='B'){
        //    System.out.println( "basarili");
        //}else if (finalNotu=='C') {
        //    System.out.println("ha gayret");
        //} else System.out.println("digerleri");
    }
}
