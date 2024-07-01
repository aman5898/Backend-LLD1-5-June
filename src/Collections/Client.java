package Collections;

import java.util.*;

public class Client {
    public static void main(String[] args) {
//        Collection : Container , Group of OBjects
        // List , Set, Queue
//        Collection

//        List : Ordered Collection : insertion Order
        // index : inser, search, random Access
        // duplicate elements allowed


        // array : dynamic / growable
        // random : O(1) : index
        // not thread safe
        List<String> list1 = new ArrayList<>();

//        Doubly LL is used to implement this Collection.
//        random : O(n)
        // discontagious memory
        // Not thread safe
//        List<Integer> list2 = new LinkedList<>();

        // ArrayList + Synchronized(Thread Safe)
        List<Integer> list3 = new Vector<>();

        // Stack
        // LIFO
        // Legacy Code
//        List<Integer> list4 = new Stack<>();

//        List<Intege

        // Set Interface : no duplicate elements are allowed
//        Generally not ordered
        // Fast Searching

        // no order
//        T.C. avg O(1)
//        array of List
        Set<Integer> set1 = new HashSet<>();

        // DoublyLL (insertion ORder)+ HashSet(Searching)
        // insertion Order
//        T.C. avg O(1)
        Set<Integer> set2 = new LinkedHashSet<>();

        // Natural Sorting Order
//        T.C. O(log2n)
        // BBST : Balanced Binary Search Tree -> Red Black Tree
        Set<Integer> set3 = new TreeSet<>();

//        Queue : DS to hold items before Processing
        //  Typically order of Processing is FIFO

        // Directly Implemented by PQ.
        // Implemented by another interface Dequeue

//        natural Sorted Order
        Queue<Integer> pq = new PriorityQueue<>();

        pq.add(16);
        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(1);

//        while(pq.size() > 0){
//            System.out.println(pq.peek());
//            pq.poll();
//        }

        /*
        Deque
           Pronounced as 'Deck'
        A linear collection that supports element insertion and removal at both ends. The name deque is short
        for "double ended queue" and is usually pronounced "deck".
*/
        Deque<Integer> deque = new ArrayDeque<>();

//        LinkedList/**/
//        deque.
        Queue<Integer> queue = new LinkedList<>();

//        Map

        // Map : key, value
        Map<Integer,String> map = new HashMap<>();

        // DoublyLL (insertion ORder)+ HashSet(Searching)
        // insertion Order
//        T.C. avg O(1)
        Map<Integer,String> map2 = new LinkedHashMap<>();


        // Natural Sorting Order
//        T.C. O(log2n)
        // BBST : Balanced Binary Search Tree -> Red Black Tree
        Map<Integer,String> map3 = new TreeMap<>();


        Map<Integer,String> map4 = new Hashtable<>();

        List<Student> ll = new ArrayList<>();
//        Student st = new Student(25 , 65.0 , "Mohit" , 10.0);
//        System.out.println(st);
        ll.add(new Student(25 , 65.0 , "Mohit" , 10.0));
        ll.add(new Student(21 , 78.0 , "Nishant" , 100.0));
        ll.add(new Student(28 , 20.0 , "Rohan" , 90.0));

        System.out.println(ll);
        Collections.sort(ll);
        System.out.println(ll);

        Collections.sort(ll,new StudentPSPComparator());
        System.out.println(ll);
    }
}
