package Wday07_Practice;

public class Q01_MDArray {
    /*
     * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
     *  2D arrayinden min number print et //2D iki boyutlu yani multi dimansional demek
     */
    public static void main(String[] args) {

        int [][] arr=  {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};//ilk []  i yi temsil ediyor yani outer for,ikinci  [] j yi temsil ediyor yani inner for
        int min=arr[0][0];// minimum number istediği icin for dısında yeniden bir variable tanımlıyoruz
        //temp yani gecici olarak olusturuyoruz o yüzden 0 atadık. bu değisecek

        for (int i = 0; i < arr.length ; i++) {//outer for icin array in length ine kadar islem yapacak
            System.out.println( "arr ["+i+"] .length i : "+arr[i].length );
            for (int j = 0; j <arr[i].length ; j++) {//inner for yapıyoruz, iceriye gecmis olyuorz.
                if (arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        } System.out.println("min= "+min);
    }
}
