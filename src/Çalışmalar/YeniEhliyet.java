package Çalışmalar;

import java.util.Scanner;

public class YeniEhliyet {

    public static void main(String[] args) {
       /*
*Kullanici ehliyet almak istiyor
*kullanicidan isim soyisim yas alin ve Surmek istedigi araci sectirin
*isim soyisime harf disinda bir ifade giremesin yasada sayi disinda bir ifade giremesin
*Motor 16 yas ustu ve 1200tl
*Araba 18 yas ustu ve 2500tl
*Ucak 22 yas ve ustu 30000tl
*gemi 20 yas ve ustu 15000tl
*3 farkli odeme imkani sunun
        */
        //Eminim daha kisa yapilabilirdi ama ben anca bu kadar kod ile yapabildim asagida
        //her kodun yanina yorum satiri ekledim umarim anlasilir olmustur

        String bosluk = "\n====================================================";
        Scanner scan = new Scanner(System.in);
        System.out.print("Adinizi giriniz: ");
        String ad = scan.nextLine();
        System.out.print("Soyadinizi giriniz: ");
        String soyad = scan.nextLine();

        ad = ad.trim();
        soyad = soyad.trim();//Once basta ve sonda bosluk varsa onlari sildim programda hata olmasin diye

        int index = ad.indexOf(" ");//adda boslugun indexini buldum buyuk kucuk yaparken kullanmak icin
        int index1 = soyad.indexOf(" ");//soyadda boslugun indexini buldum buyuk kucuk yaparken kullanmak icin

        ad = ad.replaceAll(" ", "qwea");//adda olan boslugu "qwea" ile degistirdim replaceAll kullanirken silinmesinler diye
        int aSoyad = soyad.length();//soyadin uzunlugunu buldum replaceAlla girmeden once cunku eger sayi ya da ozel ifade varsa silinecek ve soyad kisalacak
        int bSoyad = soyad.replaceAll("\\d", "").replaceAll("\\W", "").length();//eger varsa sayi ya da ozel ifadeleri sildim
        String kisaltilmisYas = null;//yas icin ayri bir degisken atadim mecbur if in disina yazdim asagida aciklayacagim
        if (aSoyad == bSoyad) {//eger aSoyad bSoyada esit ise program calismaya devam edicek (else en asagida)
            ad = ad.replaceAll("qwea", " ");//"qwea"yi tekrar bosluk yaptim problem cikmasin diye

            ad = ad.replaceAll(" ", "qwea");//soyad icin yaptigim islemlerin aynisini ada da uyguladim
            int a = ad.length();//soyad icin yaptigim islemlerin aynisini ada da uyguladim
            int b = ad.replaceAll("\\d", "").replaceAll("\\W", "").length();//soyad icin yaptigim islemlerin aynisini ada da uyguladim
            if (a == b) {//soyad icin yaptigim islemlerin aynisini ada da uyguladim (else en asagida)
                ad = ad.replaceAll("qwea", " ");//"qwea"yi tekrar bosluk yaptim problem cikmasin diye

                if (!(ad.contains(" "))) {//eger isimde bosluk yoksa devam et (else en asagida)
                    ad = ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase();//ismin ilk harfini buyuk gerisini kucuk yap

                } else if (ad.contains(" ")) {//eger isimde bosluk varsa

                    ad = ad.substring(0, 1).toUpperCase()                        // ilk ismin ilk harfini buyuk bosluga kadar olan kismini kucuk yap ikinci ismin ilk harfini buyuk gerisini kucuk yap
                            + ad.substring(1, index + 1).toLowerCase()
                            + ad.substring(index + 1, index + 2).toUpperCase()
                            + ad.substring(index + 2).toLowerCase();
                }
                if (!(soyad.contains(" "))) {//eger soyadda bosluk yoksa (else en asagida)
                    soyad = soyad.toUpperCase();//her harfi buyuk yap

                } else if (soyad.contains(" ")) {//eger bosluk varsa
                    soyad = soyad.substring(0, 1).toUpperCase() + soyad.substring(1, index1).toLowerCase() + soyad.substring(index1 + 1, index1 + 2).toUpperCase().substring(index1 + 2).toLowerCase();
                    // ilk soyadin ilk harfini buyuk bosluga kadar olan kismini kucuk yap ikinci soyadin ilk harfini buyuk gerisini kucuk yap
                }
                System.out.print("Yasinizi giriniz: ");
                String yasString = scan.nextLine();
                yasString=yasString.trim();//yastaki bosluklari sildim
                kisaltilmisYas = yasString.replaceAll("\\D", "");//sayi disinda ki ifadeleri siliyorum
                int yas;//yasi burada tanimladim
                if (yasString.equals(kisaltilmisYas)) {//eger yasString ile kisaltilmisYas stringleri birbirine esitse  (else en asagida)

                    yas = Integer.parseInt(kisaltilmisYas);//kisaltilmisyasi integera cevirdim cunku asagida yas ile isle yapacagim

                    if (!((yas > 100) || (yas < 0))) {//eger yas yuzden buyuk ya da 0dan kucuk degilse (else en asagida)

                        System.out.print(bosluk + "\nIstediginiz arac ehliyetinin numarasini giriniz\n1. Araba\n2. Motorsiklet\n3. Ucak\n4. Gemi\nNumara: ");
                        int arac = scan.nextInt();//kullanicin sectigi numara

                        if (arac == 1 || arac == 2 || arac == 3 || arac == 4) {//1 2 3 4 sectiyse (else en asagida)

                            //gerisi kullanicinin sectigine gore degisir ama biri  hepsiyle ayni bir tanesini bilmek hepsini anlamaya yeterli sadece fiyat ve arac farki var


                            switch (arac) {
                                case 1:
                                    if (yas >= 18) {
                                        System.out.print(bosluk + """
                                                \nAraba ehliyenin fiyat alternatiflerini degerlendirebilirsiniz
                                                1. 3500TL 10 taksit
                                                2. 3000TL 5 taksit
                                                3. Nakit 2500TL
                                                Numara:\n""");
                                        int arabaOdeme = scan.nextInt();//kullanicinin sectigi odeme secenegi
                                        if (arabaOdeme == 1) {
                                            System.out.println(bosluk + "\nAdiniz: " + ad + "\nSoyadiniz: " + soyad + "\nYasiniz: " + yas +
                                                    "\nSectigniz ehliyet: Araba" + "\nOdeme: 3500TL 10 taksit" + bosluk);
                                            //ve eger tum adimlari dogru gelir arabayi secer
                                            // ve 3500tl 10 taksiti secerse perogram burada biter diger secenekler icinde aynisi gecerli
                                        } else if (arabaOdeme == 2) {
                                            System.out.println(bosluk + "\nAdiniz: " + ad + "\nSoyadiniz: " + soyad + "\nYasiniz: " + yas +
                                                    "\nSectigniz ehliyet: Araba" + "\nOdeme: 3000TL 5 taksit" + bosluk);
                                        } else if (arabaOdeme == 3) {
                                            System.out.println(bosluk + "\nAdiniz: " + ad + "\nSoyadiniz: " + soyad + "\nYasiniz: " + yas +
                                                    "\nSectigniz ehliyet: Araba" + "\nOdeme: Nakit 2500TL" + bosluk);
                                        } else {
                                            System.out.println("Lutfen gecerli bir numara giriniz");
                                        }

                                    } else {
                                        System.out.println(bosluk + "\nYasiniz Araba ehliyeti almaya uygun degil" + bosluk);
                                    }
                                    break;
                                case 2: {
                                    if (yas >= 16) {
                                        System.out.print(bosluk + """
                                                \nMotor ehliyenin fiyat alternatiflerini degerlendirebilirsiniz
                                                1. 1800TL 10 taksit
                                                2. 1500TL 2 taksit
                                                3. Nakit 1500TL
                                                Numara:\s""");
                                        int arabaOdeme = scan.nextInt();
                                        if (arabaOdeme == 1) {
                                            System.out.println(bosluk + "\nAdiniz: " + ad + "\nSoyadiniz: " + soyad + "\nYasiniz: " + yas +
                                                    "\nSectigniz ehliyet: Motorsiklet" + "\nOdeme: 1800TL 10 taksit " + bosluk);
                                        } else if (arabaOdeme == 2) {
                                            System.out.println(bosluk + "\nAdiniz: " + ad + "\nSoyadiniz: " + soyad + "\nYasiniz: " + yas +
                                                    "\nSectigniz ehliyet: Motorsiklet" + "\nOdeme: 1500TL 2 taksit" + bosluk);
                                        } else if (arabaOdeme == 3) {
                                            System.out.println(bosluk + "\nAdiniz: " + ad + "\nSoyadiniz: " + soyad + "\nYasiniz: " + yas +
                                                    "\nSectigniz ehliyet: Motorsiklet" + "\nOdeme: Nakit 1500TL" + bosluk);
                                        } else {
                                            System.out.println("Lutfen gecerli bir numara giriniz");
                                        }
                                    } else {
                                        System.out.println(bosluk + "\nYasiniz Motor ehliyeti almaya uygun degil" + bosluk);
                                    }
                                    break;

                                }
                                case 3: {
                                    if (yas >= 22) {
                                        System.out.print(bosluk + """
                                                \nUcak ehliyenin fiyat alternatiflerini degerlendirebilirsiniz
                                                1. 35.000TL 10 taksit
                                                2. 33.000 5 taksit
                                                3. Nakit 30.000TL
                                                Numara:\s""");
                                        int arabaOdeme = scan.nextInt();
                                        if (arabaOdeme == 1) {
                                            System.out.println(bosluk + "\nAdiniz: " + ad + "\nSoyadiniz: " + soyad + "\nYasiniz: " + yas +
                                                    "\nSectigniz ehliyet: Ucak" + "\nOdeme: 35.000TL 10 taksit" + bosluk);
                                        } else if (arabaOdeme == 2) {
                                            System.out.println(bosluk + "\nAdiniz: " + ad + "\nSoyadiniz: " + soyad + "\nYasiniz: " + yas +
                                                    "\nSectigniz ehliyet: Ucak" + "\nOdeme: 33.000TL 5 taksit" + bosluk);
                                        } else if (arabaOdeme == 3) {
                                            System.out.println(bosluk + "\nAdiniz: " + ad + "\nSoyadiniz: " + soyad + "\nYasiniz: " + yas +
                                                    "\nSectigniz ehliyet: Ucak" + "\nOdeme: Nakit 30.000TL" + bosluk);
                                        } else {
                                            System.out.println("Lutfen gecerli bir numara giriniz" + bosluk);
                                        }
                                    } else {
                                        System.out.println(bosluk + "\nYasiniz  Ucak almaya uygun degil" + bosluk);
                                    }
                                    break;
                                }
                                case 4:
                                    if (yas >= 20) {
                                        System.out.print(bosluk + """
                                                \nGemi ehliyenin fiyat alternatiflerini degerlendirebilirsiniz
                                                1. 1500TL 10 taksit
                                                2. 17.000 5 taksit
                                                3. Nakit 15.000TL
                                                Numara:\s""");
                                        int arabaOdeme = scan.nextInt();
                                        if (arabaOdeme == 1) {
                                            System.out.println(bosluk + "\nAdiniz: " + ad + "\nSoyadiniz: " + soyad + "\nYasiniz: " + yas +
                                                    "\nSectigniz ehliyet: Gemi" + "\nOdeme: 1500TL 10 taksit" + bosluk);
                                        } else if (arabaOdeme == 2) {
                                            System.out.println(bosluk + "\nAdiniz: " + ad + "\nSoyadiniz: " + soyad + "\nYasiniz: " + yas +
                                                    "\nSectigniz ehliyet: Gemi" + "\nOdeme: 17.000TL 5 taksit" + bosluk);
                                        } else if (arabaOdeme == 3) {
                                            System.out.println(bosluk + "\nAdiniz: " + ad + "\nSoyadiniz: " + soyad + "\nYasiniz: " + yas +
                                                    "\nSectigniz ehliyet: Gemi" + "\nOdeme: Nakit 15.000TL" + bosluk);
                                        } else {
                                            System.out.println(bosluk + "\nLutfen gecerli bir numara giriniz" + bosluk);
                                        }
                                    } else {
                                        System.out.println(bosluk + "\nYasiniz Gemi ehliyeti almaya uygun degil" + bosluk);
                                    }
                                    break;
                                default:
                                    System.out.println(bosluk + "\nLutfen gecerli bir numara giriniz" + bosluk);
                                    break;
                            }
                        } else {
                            System.out.println("Lutfen gecerli ifadeleri  kullanin");//kullanici eger 1 2 3 4 disinda bir deger girerse program buraya atar
                        }
                    } else {
                        System.out.println("Lutfen gecerli bir yas girniz");//kullanici eger 100den buyuk 0dan kucuk bir sayi girerse program buraya atar
                    }
                } else {
                    System.out.println("Yasinizi yalniz sayi ile yazabilirsiniz");//eger kullanici yas yerine harf veya ozel bir ifade kullanirsa program buraya atar

                }
            } else {
                System.out.println("Soyadinizda ve isminizde sadece harf olmalidir!");//eger kullanici soyadinda veya isminde harf disinda bir ifadegirerse program burya atar
            }
        } else {

            System.out.println("Isminizde ve soyisminizde sadece harf olmalidir!");//eger kullanici soyadinda veya isminde harf disinda bir ifadegirerse program burya atar
            /*
            aslinda bu kadar if birbirine girmezdi ama suanlik daha looplari ogrenmedigimiz icin yalniz boyle yapabildim umarim anlasilir olmustur
             */
        }
    }

}
