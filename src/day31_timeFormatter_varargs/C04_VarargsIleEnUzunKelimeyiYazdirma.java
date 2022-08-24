package day31_timeFormatter_varargs;
public class C04_VarargsIleEnUzunKelimeyiYazdirma {

    public static void main(String[] args) {

        enUzunKelimeyiYazdir("Ali","Ayse","Ismail","Ahmet","Babayigit");
    }
    public static void enUzunKelimeyiYazdir(String... kelime) {      //varargs bir array olduğu için ona göre işlem
        String enUzunKelime=kelime[0];                              //yaparız
        for (String each:kelime
        ) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }
        }
        System.out.println("Girilen kelimelerden en uzunu : " + enUzunKelime);
    }
}