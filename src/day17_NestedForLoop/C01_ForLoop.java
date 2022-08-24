package day17_NestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        //verilen String deki kullanılan harfleri tekrarsız olarak yazdırıp
        //kelimede kullanılan farklı harf sayısın veren bir method yazınız


        String input = "Java her zaman guzel";
        tekrarsizYap(input);

    }
    public static void tekrarsizYap(String input) {
        String benzersizInput = "";
        String islenecekKelime=input.replaceAll("\\W",""); //   Java her zaman guzel

        System.out.print(islenecekKelime.substring(0, 1));         //j   -ilk harfi burda yazdırdık devmını loop ile
        benzersizInput += islenecekKelime.substring(0, 1);           //j    ilk harfi variable ekledik

        for (int i = 1; i < islenecekKelime.length(); i++) {
            if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
                System.out.print(", "+islenecekKelime.substring(i,i+1));
                benzersizInput+=islenecekKelime.substring(i,i+1);
            }
        }
        System.out.println("");
        System.out.println("input: "+input);
        System.out.println("benzersiz input: "+benzersizInput);
        System.out.println("kelimede verilen harf sayısı :"+benzersizInput.length());

    }

}
