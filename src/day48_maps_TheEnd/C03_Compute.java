package day48_maps_TheEnd;
import java.util.HashMap;
import java.util.Map;
public class C03_Compute {
    public static void main(String[] args) {

        Map<String,Integer> harfMapi= new HashMap<>();

        harfMapi.put("A", 5);
        harfMapi.put("B", 1);
        harfMapi.put("C", 2);
        harfMapi.put("D", 4);
        harfMapi.put("E", 4);

        System.out.println(harfMapi);

        harfMapi.compute("A", (k,v) -> v*2+3);   // k,v sembolik başka harfde olur value lerle işlem yapıyoruz
        harfMapi.compute("D",(a,b)->b*b);

        harfMapi.computeIfAbsent("C",(v)-> 30);    //c zaten var o yüzden değiştirmedi
        harfMapi.computeIfAbsent("F",(v)-> 30);    //f yi value si 30 olarak ekledi
        harfMapi.computeIfPresent("E" , (k,v)-> v+5); // e var değerini 5 artırdı
        harfMapi.computeIfPresent("G" , (k,v)-> v+5); // olmadığı için işlem yapmadı
        System.out.println(harfMapi);
    }
}
