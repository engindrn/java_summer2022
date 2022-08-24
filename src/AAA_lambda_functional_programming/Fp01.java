package AAA_lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
    /*
    1) Lambda (Functional Programming) Java 8 ile kullanılmaya başlanmıştır.
    2) Functional Programming'de "Ne yapılacak" (What to do) üzerine yoğunlaşılır.
       Structured Programming "Nasıl yapılacak" (How to do) üzerine yoğınlaşılır.
    3) Functional Programming, Arrays ve Collections ile kullanılır.
    4) "entrySet() methodu ile Map, Set'e dönüştürülerek Functional Programming'de kullanılabilir.
     */

    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);

        listElemanlariniYazdirStructured(liste);
        System.out.println();
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirStructured(liste);
        System.out.println();
        System.out.println("Functional:");
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);
        tekrarsizCiftElemanlarınKupununCarpimi(liste);
        getMaxEleman01(liste);
        getMaxEleman02(liste);
        getMinEleman(liste);
        getMinEleman2(liste);
        getYedidenBuyukCiftMin(liste);
        getYedidenBuyukCiftMin2(liste);
        getYedidenBuyukCiftMin3(liste) ;
        getTersSıralamaylaTekrarsizElemanlarınYarisi(liste);

    }
    //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
    public static void listElemanlariniYazdirStructured(List<Integer> list){

        for(Integer w : list){

            System.out.print(w+" ");

        }
    }

    //1)Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void listElemanlariniYazdirFunctional(List<Integer> list){

        list.stream().forEach(t-> System.out.print(t+" "));   //t bir variabe loopla tek tek alınan değişknelerin yerine geçer
        //t yi lambda expression ile (t->) kullanırsak alıdığın elemanı kullan yeni eleman gelecek demek
        //stream() methodu collection'dan elementleri akışa dahil etmel için ve methodlara ulaşmak için kullanılır.
    }

    //2)Çift sayı olan list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
    public static void ciftElemanlariYazdirStructured(List<Integer> list){
        for(Integer w : list){
            if(w%2==0){
                System.out.print(w+" ");
            }
        }
    }
    //2)Çift sayı olan çift list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void ciftElemanlariYazdirFunctional(List<Integer> list){

        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));
    }

        //3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarinKareleriniYazdir(List<Integer> list){

        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" ")); //elemanların değerleri değişecekse map() methodu kullanılır.

    }
    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list) {
        list.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
    }

        //5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list){

        Integer toplam = list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);

        System.out.println(toplam);

    }
    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarınKupununCarpimi(List<Integer>list){

        Integer carpım= list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)-> t*u);
        System.out.println(carpım);
    }


    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    //1.yol
    public static void getMaxEleman01(List<Integer> list){

     Integer max= list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u? t:u );
        System.out.println(max);
    }

    //2.yol
    public static void getMaxEleman02(List<Integer> list){

        Integer max= list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);
        System.out.println("max2 :"+max);
    }
    //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)

    public static void getMinEleman(List<Integer>list){

        Integer min= list.stream().distinct().reduce(Integer.MAX_VALUE,(t,u)->t<u ? t : u);
        System.out.println("min: " + min);
    }
    //2.yol

    public static void getMinEleman2(List <Integer> list){

        Integer min= list.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t,u)->u);
        System.out.println("min2 = " + min);
    }


    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
  //1.yol
    public static void getYedidenBuyukCiftMin(List<Integer> list){
      Integer min=  list.stream().distinct().filter(t->t%2==0).filter(t->t>7).reduce(Integer.MAX_VALUE,(t,u)->t<u ? t:u);
        System.out.println(min);
     //   list.stream().distinct().filter(t->t%2==0).filter(t->t>7).min();
    }

    //2.yol
    public static void getYedidenBuyukCiftMin2(List<Integer> list){
       Integer min= list.stream().
               distinct().
               filter(t->t%2==0).
               filter(t->t>7).
               sorted(Comparator.reverseOrder()).
               reduce(Integer.MAX_VALUE,(t,u)->u);
        System.out.println(min);
    }
    //3.yol

    public static void getYedidenBuyukCiftMin3(List<Integer> list){

        Integer min= list.stream().filter(t->t%2==0).filter(t->t>7).sorted().findFirst().get();
        System.out.println(min);

    }
    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

    public static void getTersSıralamaylaTekrarsizElemanlarınYarisi(List<Integer>list){

       List<Double>sonuc= list.stream().distinct().filter(t-> t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sonuc);
     //   List<Double> list2= list.stream().distinct().filter(t -> t > 5).map(t -> t / 2.0).sorted(Comparator.reverseOrder()).toList();
    }
}