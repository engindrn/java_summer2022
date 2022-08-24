package day09_ternary;

public class C06_SwitchCaseImput {
    public static void main(String[] args) {

        //kullanıcıdan gun ismini alın hafta ici veya hafta sonu olduğunu yazın

        String input="pazartesi";          //scanner yerine kulanacaz
        input=input.toLowerCase();



        switch (input){
            case "pazartesi":
                System.out.println("hafta ici");
                break;
            case "salı":
                System.out.println("hafta ici");
                break;
            case "carsamba":
                System.out.println("hafta ici");
                break;
            case "persembe":
                System.out.println("hafta ici");
                break;
            case "cuma":
                System.out.println("hafta ici");
                break;
            case "cumartesi:":
                System.out.println("hafta sonu");
                break;
            case "pazar":
                System.out.println("hafta sonu");
                break;
            default :
                System.out.println("lutfen geçerli bir gün giriniz");

        }

        switch (input){                                      // sonucu aynı olduğunda bu şekilde yazılabilr
            case "pazartesi":                      //girilen günü alır kodu görene kadar gider orda yazdırır
            case "salı":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("hafta ici");
                break;

            case "cumartesi:":
            case "pazar":
                System.out.println("hafta sonu");
                break;
            default :
                System.out.println("lutfen geçerli bir gün giriniz");

        }

    }
}
