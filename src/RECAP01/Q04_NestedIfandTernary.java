package RECAP01;
public class Q04_NestedIfandTernary {
    /*
   0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
  kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
  cikis "Gecersiz" olmalidir
  NestedIf ve Ternary kullanarak 2 yolla da cozunuz
*/
    public static void main(String[] args) {
        int sayi = 10;
        String sonuc = "";                             //burda variable oluşturduk sonra değer atamak için

        if(sayi>=0 && sayi<=9){
            if(sayi==9){sonuc="dokuz";}             //sayi 9 girildiyse sonuç variable ata git yazdir
            else if(sayi==8){sonuc="sekiz";}        //sayi 8 girildiyse sonuç değerine ata git yazdır
            else if(sayi==7){sonuc="yedi";}         // böyle devam eder
            else if(sayi==6){sonuc="alti";}         //not: sout ile direk yazdıradabilirdik
            else if(sayi==5){sonuc="bes";}
            else if(sayi==4){sonuc="dort";}
            else if(sayi==3){sonuc="uc";}
            else if(sayi==2){sonuc="iki";}
            else if(sayi==1){sonuc="bir";}
            else sonuc="sifir";
        }else sonuc="gecersiz";                         //ilk if 'in elsesi sayi 0-9 kuralına uymazsa buraya gelecek
        System.out.println("sonuc = " + sonuc);
    }
}
/*
         int n =4;

         String result = n==9 ? "dokuz" :n==8? "sekiz" :n==7 ? "yedi":n==6 ? "alti"
                 :n==5 ? "bes" :n==4 ? "dort" :n==3 ? "uc" : n==2 ? "iki" : n==1 ? "bir"
                 :n==0 ? "sifir" :"gecersiz";
         System.out.println("result = " + result);*/
            //önce atama yaptık sonra yazdırdık