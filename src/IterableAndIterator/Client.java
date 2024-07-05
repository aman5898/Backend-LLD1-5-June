package IterableAndIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(3);
        list.add(40);
//        for(int i:list){
//            System.out.println(i);
//        }

//        Iterable

        try {
            Numbers numbers = new Numbers(list);
        }
        finally {
            System.out.println("abc");
//            throw new RuntimeException(e);
        }

//        finally{
//
//        }

//
//        for(int i=0;i<list.size();i++){
//            if(numbers.iterator().hasNext()){
//                System.out.println(numbers.iterator().next());
//            }
//        }

//        for(int i:numbers){
//            System.out.println(i);
//        }
    }
}
