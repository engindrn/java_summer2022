package day32_StringBuilder;
public class C05_indexOf_lastIndexOf {

    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Pay attention please");

        System.out.println(sb.indexOf("Pay")); //0    //bize int bir değer döndürdü yani bir bilgi döndürdü
                                                    //yani her method un String Builderimizi değiştirmesi beklenemz
        System.out.println(sb); // Pay attention please

        System.out.println(sb.indexOf("e")); // 7

        System.out.println(sb.indexOf("e",10)); // 16     //10. indexten sonrasındaki e yi aldık

        System.out.println(sb.lastIndexOf("e")); // 19         //sondan başladı e yi buldu indexini baştan sayar

        System.out.println(sb.lastIndexOf("e",10)); // 7  //baştan 10. indexe kadar gelecez
                                                                //ordan başa doğru e arıyacaz ve bulunca baştan
                                                                     //indexsini sayacaz
    }
}