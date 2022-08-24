package Wday09_Practice;

public class BatchConstructor {


    public static void main(String[] args) {


        Batch batch =new Batch();//eşitliğin bu tarafı contructor dur ve obje ğrettiğimiz clasdan obje üretmemizi sağlar
        //obje oluştutrarak Batch clladındaki variablelara ve methodlara
        //ulaşdık.

        System.out.println("batch.str1 = " + batch.str1);
        //



        batch.batch(); // method call yandaki batch methodunu calıştırır

    }
}