package RECAP;

public class Q13_Ternary {
    public static void main(String[] args) {
        /*
         * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
         * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
         * olsun
         */

        double fiyat = 25;

        String sonuç = (fiyat < 10) ? "ucuz" : (fiyat < 20) ? "normal" : "pahali";    //assingment yap

        System.out.println((fiyat < 10) ? "ucuz" : (fiyat < 20) ? "normal" : "pahali");   //yada direk yazıdır

        System.out.println(sonuç);

        if (fiyat < 10) {
            System.out.println("ucuz");
        } else if (fiyat < 20) {
            System.out.println("normal");
        } else System.out.println("pahalı");



    }
}
