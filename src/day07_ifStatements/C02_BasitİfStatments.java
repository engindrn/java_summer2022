package day07_ifStatements;

public class C02_BasitİfStatments {
    public static void main(String[] args) {

        int sayi=10 ;
        if (sayi>0) {
            System.out.println("sayi pozitif");
        }


        if (sayi%2==0) {
            System.out.println("sayi cift");
        }


        if(sayi%5==0) {
            System.out.println("sayi 5'in tam kati");
        }

        //basit if cümlerleri kadun diğer parçalarından bağımsızdır
        //sadece bir şart kontrol eder, şart sağlanıyorsa if bady çalışır yoksa çalışmaz
        // birden fazla basit if cümlesi varsa girilen şarta bağlı olarak
        // tümünde if bady'si çalışabilir-kısmen çalışabilir- veya çalışmayabilir

    }
}
