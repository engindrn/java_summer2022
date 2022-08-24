package day32_StringBuilder;
public class C01_OlusturmaYontemleri {

    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2= new StringBuilder("Java Candir...");
        StringBuilder sb3= new StringBuilder(10);          //belirttiğimizden az yada çok olabilir

        System.out.println(sb1.length()); // 0
        System.out.println(sb1.capacity()); // 16

        System.out.println(sb2.length()); // 14
        System.out.println(sb2.capacity()); // 30

        System.out.println(sb3.length()); // 0
        System.out.println(sb3.capacity()); // 10

        sb1.append("Java");                            //Java ekledik uzunluk 4 olur
        System.out.println(sb1.length()); // 4
        System.out.println(sb1.capacity()); // 16

        sb1.append(" Candir");                          //"Java Candır"    11 oldu
        System.out.println(sb1.length()); // 11
        System.out.println(sb1.capacity()); // 16

        sb1.append(", bilen bilir.");                 //"Java Candır, bilen bilir."  25
        System.out.println(sb1.length()); // 25
        System.out.println(sb1.capacity()); // 34 (16 *2 +2)

        StringBuilder sb4=new StringBuilder();     //önce String Builder oluşturup sonra ekleme yaptık
        sb4.append("Java Candir");
        System.out.println(sb4.length()); // 11
        System.out.println(sb4.capacity()); // 16
    }
}
