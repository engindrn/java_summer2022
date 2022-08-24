package Redlit;

public class ENG_List_3_TersYazdır {
    /* Get a sentence from the user. Accept the sentence received from the user as a parameter,
     Invert sentence using Array and write a Method that returns the result as a String to the main method.

     Note: Upper and lower case letters, spaces and special characters will not be changed.

     Input :

     It is very nice to write code.

     Output :

     .edoc etirw ot ecin yrev si tI

 */
    public static void main(String[] args) {

        String str = "It is very nice to write code.";

        tersStr(str);

        System.out.println(tersStr(str));

    }

    public static String tersStr(String str) {

        String tersten = "";

        String[] karakterler = str.split("");

        for (int i = str.length() - 1; i >= 0; i--) {
            tersten += karakterler[i];

        }

        return tersten;
    }
}
