package day05_matametikselIşlemler;

public class C01_Pre_Post_Increment {
    public static void main(String[] args) {


    int sayi1 = 10;

    int sayi2 = sayi1 + 1;         //sayi2=11

    sayi2+=5;                      //sayi2=16

    //pre veye post incremenrt/decriment

    int sayi3 = ++sayi1;          //sayi1 bir artırılacak ve artırılan yeni sayi1 değeri sayi3'e atanacak

                                    /*eğer ++ veya -- variable'dan önce ise buna pre increment/decrement denir.
                                    bu durumda o satırda yapılan iki işlemden öncelikli olan artırma ve azaltmadır
                                    sonra atamadır.  */

        System.out.println("sayi3 :"+sayi3);  //11
        System.out.println("sayi1: "+sayi1);  //11

    int sayi4 =sayi2++;           //önce mevcut sayi2 değeri sayı4' e atanacak sonra sayı2 bir atılacak yeni değeri olck

                                    /*eğer ++ veya -- sonra olursa buna post increment/decrement denir.
                                    bu durumda o satıra yapılan iki işlemden arttırma veya azaltma sonucudur.
                                     */

        System.out.println("sayi4 :"+sayi4);   //16    sayi2'nin 16 olan değerini önce sayi4'e atadı
        System.out.println("sayi2 :"+sayi2);   //17    sonra sayi2'yi bir artırdı ve yeni değeri oldu

    }
  }