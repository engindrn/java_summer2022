package day27_staticKeyword;
public class C01 {


    static int sayi= 10;
    int rakam=5;


    public static void main(String[] args) {


        /*
        class level'da iki tur variable olusturabiliriz
          static (class) variable
          instance (obje) variable
        static variable'lar tum class'tan kullanilabilirken
        instance olanlar sadece static olmayan method'larda direk  kullanilabilir
        instance variable'lara static method'dan ulasmak istersek
        obje olusturmamiz gerekir.
        instance variable'lar obje variable'i oldgu icin
        herhangi bir satirda instance variable'in degerinin ne oldugunu bulmak icin
    *** OBJE OLUSTURULAN SATIRDAN itibaren kod incelenmelidir.
        static variable'lar class variable'i oldugu icin
        herhangi bir satirda static variable'in degerini bulmak icin
       CLASSIN BASINDAN itibaren kod incelenmelidir.
         */

        C01 obj1= new C01();      //class level daki instance int rakam variable a ulaşmak
                                 // için static olan main method da obje oluşturduk

        System.out.println("obj1'in rakam degeri : " + obj1.rakam); //5
        System.out.println("obj1'in sayi degeri : " + obj1.sayi); // 10


        obj1.rakam+=1; // 5+1=6    //burdada direk kullanamadığımız için obj1. ile obje üzerinden kullandık ve değerini değiştirdik
        obj1.sayi+=1; // 10+1=11      //static olduğu için direk kullandık

        System.out.println("1 artirdiktan sonra obj1'in rakam degeri : " + obj1.rakam); // 6
        System.out.println("1 artirdiktan sonra obj1'in sayi degeri : " +obj1.sayi); // 11


        //eğer obje1 in rakam değerine bakmak istiyorsak obje1 oluşturulduktan sonra rakamla ilgili bir işlem
        //yapılmışmı ona bakarız;   obj1 28. satırda oluşturulmuş- yazdırma işlemi sayılmaz- 35.satırda  artırılmış

        //sayi static olduğu için class ın başından bakarız-36. satırda artırılmış  11 olmuş




        C01 obj2=new C01();     //ikinci bir obje oluşturuyoruz

        System.out.println("obj2'in rakam degeri : " + obj2.rakam); // 5
        //rakam instance bir variable dır yani instance variable demek aynı zamanda obje demektir değerini anlalamak
        //istersek obje oluşturulduktan sonra yeni bir değer ataması yapılmış mı buna bakmalıyız
        //burda obj2 oluşturulduktan sonra rakama herhangi bir değer ataması yapılmamış
        //bu yüzden class levelda oluştırulan instance int rakam değeri ne ise o geçerli olur //5
        //insance variable ların takibi oluşturulan obje ile başlar

        System.out.println("obj2'in sayi degeri : " + obj2.sayi); // 11

        //static variable lar gökteki ay gibi herkes için aynı yarımay da olsa dolunayda olsa
        //instance (obje) variable lar evlerdeki lamba gibi o objeye ait.

        //obj1.sayi ve obj2.sayi dememizin sebebi objenin sayi değeri olmamasına rağmen yapıdan dolayı
        //objelerin içinde olduğu claasın static sayi variable ı var ve ortaktır objeler üzerinden ona ulaşırız

        //örn obj2.sayi sının değerini 1 artır değiğimizde obj1 in sayı değeri yok ama bağlı olduğu class ın
        //sayi değeri var ve onu 1 artırırız. başka obje üzerinden bi işlem yapacak olsakta değeri sıfırlanmaz



        obj2.rakam++; //5 + 1 =6
        obj2.sayi++;  // 11+ 1 =12
        System.out.println("1 artirdiktan sonra obj2'in rakam degeri : " + obj2.rakam); // 6
        System.out.println("1 artirdiktan sonra obj2'in sayi degeri : " + sayi); // 12
    }
}