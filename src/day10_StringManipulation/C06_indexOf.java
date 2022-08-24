package day10_StringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

         String str="java ogrenmek cok guzel";

        System.out.println(str.indexOf("o"));   //5
        System.out.println(str.indexOf('g'));   //6
        System.out.println(str.indexOf("t"));   //bu method int döndürüyor, int 'da yok diye bişey oladığından
                                                // 0 dersek j nin indexidir.
                                                //negatif değer vermiş -1 karakterin olmadığını gösterir

        String str5= "weeretty.pcvbnbvceggbvccgxcvnb";

        if(str5.indexOf("w")==-1){
            System.out.println("str5'de istenilen karakter kullanılmamıştır");
        }else{
            System.out.println("str5'de istenilen karakter kullanılmıştır");
        }
    }
}
