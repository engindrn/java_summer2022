package Wday09_Practice;

public class Mutfak {

    public String yemekler="adanakebab, urfaciger,kusbasi, kusleme";

    public String araSicak="yaylacorba, mercimek,duguncorba, corba";

    public String tatlilar="baklava, sutlac,gullac, kazandibi, kunefe";

    public String icecekler="ayran, salgam,kola";



    public Mutfak(String adanakebab, String mercimek, String kunefe, String salgam) {
        this.yemekler=adanakebab;
        this.araSicak=mercimek;
        this.tatlilar=kunefe;
        this.icecekler=salgam;
//diğer classda creat dedik ve dört parametreli cont. oluştu
        //bu scope da gönderdiğimiz pararmetreleri yukararıdaki ınstancea atama yapmamız gerekir

    }

    public Mutfak() {
        //parametresiz cont. rumuz için creat ettik çünkü yukarda paramtreli oluşturunca
        //java default olanı sildi.
    }


    @Override
    public String toString() {           //toStrin oluşturarak variablara ulaşdık
        return "Mutfak{" +
                "\nyemekler='" + yemekler + '\'' +
                ", \naraSicak='" + araSicak + '\'' +
                ", \ntatlilar='" + tatlilar + '\'' +
                ", \nicecekler='" + icecekler + '\'' +
                '}';
    }
}
