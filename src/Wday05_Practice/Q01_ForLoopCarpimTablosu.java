package Wday05_Practice;
public class Q01_ForLoopCarpimTablosu {
    // 1 x 1 = 1
    // 1 x 2 = 2
    // 1 x 3 = 3
    // 1 x 4 = 4
    // 1 x 5 = 5
    // 1 x 6 = 6
    // 1 x 7 = 7
    // 1 x 8 = 8
    // 1 x 9 = 9
    // 1 x 10 = 10
    // Yukarıdaki çarpım tablosunu 10 a kadar ekrana yazdırınız.


    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {  //outer for
            for (int j = 1; j <=10 ; j++) { //inner for
                System.out.println(i + " x " +j + " = " + (i*j));
            }//inner sonu
            System.out.println();
        }//outer sonu
    }
}
//inner loop da şart false olana kadar döngü döner bitince loop dan çıkar ver başa döner
//yani outerloop bir yazar içeri girer iç loop j 10 dan küçük olduğu sürece yazdırır
// yanınada outer loopun i sini ekler yani /*    1  1  sonra inner loopdan çıkar outer 2 olur tekrar aynı işlem
                                          //     1  2
                                          //     1  3
                                          //     1  4
                                          //     1  5
                                         //      1  6
                                          //     1  7
                                        //       1  8
                                         //      1  9
                                        //       1  10
