package day33_Encapsulation;
public class TasitRunner {


    public static void main(String[] args) {


        Tasit tst1=new Tasit();

        tst1.setTasitTuru("Tir");  //yeni parametremizi set edilmek üzere gönderiyoruz

        System.out.println(tst1.getTasitTuru());  //method call var oraya gider

        tst1.setYil(2000);
        System.out.println(tst1.getYil());
    }
}