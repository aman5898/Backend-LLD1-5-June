package LambdaAndStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        Runnable r = new Runnable(){

            public  void Test2(){
                System.out.println("Hello Test2");
            }

            @Override
            public void run() {
                System.out.println("Hello World");
            }
        };

//        Thread t1 = new Thread(r);

//        Comparator<Integer> cmp = new Comparator<Integer>() {
//
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return 0;
//            }
//        };

        Thread t1 = new Thread(){
            @Override
            public void run() {
                System.out.println("Hello Thread");
            }
        };

//        SampleInterface s1 = new SampleInterface() {
//
//            @Override
//            public void fun() {
//
//            }
//
//            @Override
//            public void bun() {
//
//            }
//        };


        // Lambda Expressions are valid only in Functional Interfaces
        // () -> {}
        Runnable r1 = () ->{
            System.out.println("Hey");
        };

        Thread thread1 = new Thread(r1);

        Comparator<Integer> c1 = (srk,slk)->{
            return srk-slk;
        };

        Thread t3 = new Thread(()->{
            System.out.println("Hey");
        });

        Thread t4 = new Thread(()->System.out.println("Hey"));

//        Streams

        List<Integer> l2 = List.of(5 , 10 ,2 ,1 ,16 , 3 ,8 , 1 , 2 , 2);

        Stream<Integer> s1 = l2.stream();

//        Consumer c1 =
//        Streams -> Intermediate Terminal

        // forEach is a Terminal Operation
        // As soon as you use a terminal Method that stream can't be used anymore
//        s1.forEach((elem)-> System.out.print(elem+" "));
        // below is not allowed
//        s1.limit(4);


        // There is no change in the original collection because of what we are doing in Stream
        Stream<Integer> s2 = l2.stream()
                .limit(3);
//        s2.forEach((elem) -> System.out.print(elem+" "));

                Stream<Integer> s3 = l2.stream();
                s3.limit(4).forEach((elem)->{
//                    System.out.println(elem*3);
                });

        List<Student> list1 = new ArrayList<>();
        Student st1 = new Student(25 , 65.0 , "Mohit" , 10.0);
        Student st2 = new Student(21 , 78.0 , "Nishant" , 100.0);
//        st1.compareTo(st2);
        list1.add(new Student(25 , 65.0 , "Mohit" , 10.0));
        list1.add(new Student(21 , 78.0 , "Nishant" , 100.0));
        list1.add(new Student(28 , 20.0 , "Rohan" , 90.0));

        // Filter : Intermediate;
        list1.stream().filter(elem -> {
            return elem.psp>50;
        }).forEach(elem -> {
//            System.out.println(elem.name+" "+elem.psp);
//            elem =
        });

        System.out.println(list1);
        // Collect : Terminal

        List<Student>l3 = list1.stream().filter(elem -> {
            return elem.psp>50;
        }).collect(Collectors.toList());

        System.out.println(l3);

        // map : Intermediate Method

//        List<Integer> l2 = List.of(5 , 10 ,2 ,1 ,16 , 3 ,8 , 1 , 2 , 2);

//        List<Integer> l4 = l2.stream().filter(elem -> {
//            return (elem%2==0);
//        }).map( (elem) -> {
//            return elem*elem;
//        }).collect(Collectors.toList());

//        System.out.println(l4);

        List<Integer> l4 = l2.stream().
                distinct().filter(elem -> {
                    return (elem%2==0);
                }).map( (elem) -> {
                    return elem*elem;
                }).sorted((o1,o2)->o2-o1).
                collect(Collectors.toList());

        System.out.println(l4);
        System.out.println(l2);


    }




}
