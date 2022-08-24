package day45_collections;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Z_DequeMethods {

    public static void main(String[] args) {
        /*
         * Double Ended Queue : Queue'larda FIFO gecerlidir
         * Deque'lerde hem FIFO hem de LIFO(Last In First Out) gecerlidir.
         * Deque bir interface dir dolayisiyla constructor i yoktur.
         * LinkedList constructor i kullanilarak deque olusturulabilir.
         * Deques do not accept Null as an element.
         * Deque de ilk ve son eleman onemli oldugu icin ilk ve son elemana ozel bircok method vardir.
         */

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        Deque<String> dq1 = new LinkedList<>(Arrays.asList("merve", "sedef", "hakan", "mehmet"));

        System.out.println("Listenin ilk Hali q1 : " + dq1);
        // Listenin ilk Hali q1 : [merve, sedef, hakan, mehmet]

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 1-peekFirst() methodu  : ilk elemani silmeden verir...
        System.out.println("1-peekFirst() methodu  : " + dq1.peekFirst());
        // 1-peekFirst() methodu  : merve
        System.out.println("1-peekFirst() methodundan sonra  : " + dq1);
        // 1-peekFirst() methodundan sonra  : [merve, sedef, hakan, mehmet]

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 2-peekLast() methodu  :  son elemani silmeden verir...
        System.out.println("2-peekLast() methodu  : " + dq1.peekLast());
        // 2-peekLast() methodu  : mehmet
        System.out.println("2-peekLast() methodundan sonra  : " + dq1);
        // 2-peekLast() methodundan sonra  : [merve, sedef, hakan, mehmet]

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 3-pollFirst() methodu  : ilk elemani silerek verir...
        System.out.println("3-pollFirst() methodu  : " + dq1.pollFirst());
        // 3-pollFirst() methodu  : merve
        System.out.println("3-pollFirst() methodundan sonra  : " + dq1);
        // 3-pollFirst() methodundan sonra  : [sedef, hakan, mehmet]

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 4-pollLast() methodu  : son elemani silerek verir...
        System.out.println("4-pollLast() methodu  : " + dq1.pollLast());
        // 4-pollLast() methodu  : mehmet
        System.out.println("4-pollLast() methodundan sonra  : " + dq1);
        // 4-pollLast() methodundan sonra  : [sedef, hakan]

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // Yeni elemanlar ekleyerek devam edelim...
        dq1.add("yunus");
        dq1.add("hasan");
        System.out.println("Yeni elemanlar eklendikten sonra  : " + dq1);
        // Yeni elemanlar eklendikten sonra  : [sedef, hakan, yunus, hasan]

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 5-getFirst() methodu  : istenen ilk elamani getirir ancak silmez
        System.out.println("5-getFirst() methodu  : " + dq1.getFirst());
        // 5-getFirst() methodu  : sedef
        System.out.println("5-getFirst() methodundan sonra  : " + dq1);
        // 5-getFirst() methodundan sonra  : [sedef, hakan, yunus, hasan]

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // 6-getLast() methodu  : istenen ilk elamani getirir ancak silmez
        System.out.println("6-getLast() methodu  : " + dq1.getLast());
        // 6-getLast() methodu  : hasan
        System.out.println("6-getLast() methodundan sonra  : " + dq1);
        // 6-getLast() methodundan sonra  : [sedef, hakan, yunus, hasan]

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // Listeyi bosaltip bu methodlari uygularsak ne olur ?

        dq1.clear();
        System.out.println("clear() methodundan sonra peekFirst(): " + dq1.peekFirst());
        // clear() methodundan sonra peekFirst(): null

        System.out.println("clear() methodundan sonra peekLast(): " + dq1.peekLast());
        // clear() methodundan sonra peekLast(): null

        System.out.println("clear() methodundan sonra pollFirst(): " + dq1.pollFirst());
        // clear() methodundan sonra pollFirst(): null

        System.out.println("clear() methodundan sonra pollLast(): " + dq1.pollLast());
        // clear() methodundan sonra pollLast(): null

        System.out.println("clear() methodundan sonra getFirst(): " + dq1.getFirst());
        // Bos Listeden getFirst() methodu ile ilk eleman cagirilirsa NoSuchElementException firlatir...

        System.out.println("clear() methodundan sonra getLasst(): " + dq1.getLast());
        // Bos Listeden getLast() methodu ile son eleman cagirilirsa NoSuchElementException firlatir...
    }
}