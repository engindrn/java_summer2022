package day32_StringBuilder;
public class C02_Append_insert {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("Java daha ne yapsin");

        sb.append("?");
        sb.append(5);     //ne istersek ekleyebiliririz String strong old. için concat yapıp Stringe çevirir

        System.out.println(sb); // Java daha ne yapsin?5

        // append istedigimiz String'i en sona ekler

        sb.insert(4," her seyi dusunmus,");

        System.out.println(sb); // Java her seyi dusunmus, daha ne yapsin?

        // araya ekleme yapmak istedigimizde append degil insert kullanmaliyiz


        sb.insert(22,"valla valla",5,11); //arada yazanın istenilen bölümünü seçip ekletiyoruz

        System.out.println(sb);
    }
}