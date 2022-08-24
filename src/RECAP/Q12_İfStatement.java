package RECAP;

import java.util.Scanner;

public class Q12_İfStatement {
    public static void main(String[] args) {
        /*
      Print "Lutfen is unvaninizi girin
      jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
      Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
      Eger jobTitle  qa ise print is unvaniniz Quality Analyst
      test data: qa ise print Quality Analyst
      dev ise print Developer
      ba ise print Business Analyst
      pm ise print Project Manager
     */
        Scanner scann=new Scanner(System.in);
        System.out.print("lutfen is unvanınızı giriniz :");
        String jobtitle=scann.nextLine().toLowerCase();
        System.out.println("jobteitel :" +jobtitle);       // kontrol edebiliriz lovercase olduğunu

        if(jobtitle.equals("qa")){
            System.out.println("unvanınız: Quality Analyst");
        } else if (jobtitle.equals("dev")) {
            System.out.println("unvanınız: devoloper");
        }else if(jobtitle.equals("ba")){
            System.out.println("unvanınız: business analyst");
        }else if (jobtitle.equals("pm")) {
            System.out.println("unvanınız: project maneger");
        }else System.out.println("geçerli ünvan giriniz");


        switch (jobtitle){
            case "qa":
                System.out.println("Quality Analyst");
                break;
            case "dev":
                System.out.println("devoloper");
                break;
            case "ba" :
                System.out.println("business analyst");
                break;
            case "pm":
                System.out.println( "project maneger");
                break;
            default:
                System.out.println("geçerli bir jotitle giriniz");
        }

    }
}
