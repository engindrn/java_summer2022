package Redlit;

public class ENG_Method_Array_5 {


        public static void main(String[] args) {

    /*    Write a java program that calculates the average value of array elements
            Dizi elemanlarının ortalama değerini hesaplayan bir java programı yazınız.
        input[]= {1,2,3,4,5,6,7}

        Output : 4
*/

            int [] sayilar= {1,2,3,4,5,6,7};
            int toplam=0;

            for (int i = 0; i < sayilar.length ; i++) {

                toplam+=sayilar[i];
            }

            double ortalama=toplam/ sayilar.length;
            System.out.println(ortalama);




        }
}
