package day32_StringBuilder;
public class C04_subSequence {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("Kayra");

        sb.substring(0,3);                     //substring String döndüreceği için ignored olur biryere atanmaz
        // Bu method String (ımmutable) dondurdugu icin StringBuilder'in eski halini degistiremez
       /* String aaa=sb.substring(0,3);
        System.out.println(aaa);//Kay*/

        System.out.println(sb); // Kayra

        sb.subSequence(0,3);
        System.out.println(sb); // Kayra
    }
}