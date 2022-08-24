package day15_overloading_forLoop;

public class C07_StringTersCevirme {
    public static void main(String[] args) {
        //input olarak verilen bir Stringi terse çevirip yazdıran bir method oluşturun

        String input="Java gün geçtikçe guzellesiyor";

        //daha önce 4 harfli bir kelime için bu işlemi substring methoduyla yaptık
        //ama input değişebilir 20 harfde olablir 50 de veya kaç harfli olduğunu bilemeyiz

        terstenYazdır(input);

    }

    public static void terstenYazdır(String input) {

        String tersInput=input.substring(input.length()-1);   //son harfi tersInput'a atadık


        for (int i = input.length()-2; i >=0 ; i--) {

            tersInput+=input.substring(i,i+1);


        }
        System.out.println(tersInput);
    }


}
