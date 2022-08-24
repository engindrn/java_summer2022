package day42_interfaces;
public class K_ChildClassOfInterfaces implements I01_interfaces, I02_Interfaces{
    /*
      Bir class'i bir interface'e child yapmak icin implements keyword kullanilir
      implements dedikten sonra virgul yazarak istedigimiz kadar interface ekleyebiliriz
     */
    public static void main(String[] args) {

        System.out.println(I02_Interfaces.SAYI); // 20
        System.out.println(I01_interfaces.SAYI); // 30
        System.out.println(ISIM); // Yildiz Koleji
    }
}