package Redlit;


import java.util.Scanner;

public class ENG_If_Switch_Ternary_StringMeth_4 {

        /*    Write a switch statement that tests the value of the char variable response and performs the following actions:
           if response is a, the message Your request is being processed is printed
           if response is b, the message Thank you anyway for your consideration is printed
           if response is c, the message Sorry, no help is currently available is printed for any other value of response,
           the message "Invalid entry, please try again!" is printed
            Create Scanner object.

           Use charAt() method, in order to get the char value at the specified index.

            Example:
           -Display prompt: "Enter command:"
           input: a -Display prompt: "Your request is being processed"

         */


        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter command");
            char karakter = scan.next().charAt(0);

            switch (karakter) {

                case 'a':
                    System.out.println("Your request is being processed"); // Ihre Anfrage wird bearbeitet
                    break;
                case 'b':
                    System.out.println("Thank you anyway for your consideration"); //Vielen Dank trotzdem für Ihre Aufmerksamkeit
                    break;
                case 'c':
                    System.out.println("Sorry, no help is currently available"); //Leider ist derzeit keine Hilfe verfügbar
                    break;
                default:
                    System.out.println("Invalid entry, please try again!"); //Ungültige Eingabe, bitte versuchen Sie es erneut!
            }


        }
}
