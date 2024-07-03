package LambdaAndStreams;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
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

//        System.out.println(l3);

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

//        System.out.println(l4);
//        System.out.println(l2);

//        List<Integer> l2 = List.of(5 , 10 ,2 ,1 ,16 , 3 ,8 , 1 , 2 , 2);
        // Find First -> Terminal
//        Optional<Integer> op1 = l2.stream().
//                filter(elem -> {
//                    System.out.println("Filtering "+elem);
//                    return (elem%2==0);
//                }).map( (elem) -> {
//                    System.out.println("Mapping "+elem);
//                    return elem*elem;
//                }).findFirst();

//        if(op1.isPresent()){
//            System.out.println(op1.get());
//        }

        //        List<Integer> l2 = List.of(5 , 10 ,2 ,1 ,16 , 3 ,8 , 1 , 2 , 2);
//        int count =
//                (int) l2.stream().filter(e -> {
//                    System.out.println("Counting "+e);
//                    return e>2;}).count();
//
//        System.out.println(count);

        List<Integer> l5 = List.of(4,7,2,6);

        Stream<Integer> test = l5.stream().map(e -> e*e);
//         find sum of a list
//        int sum = 0;
//        for(Integer elem : l5) {

//            sum += elem;
//        }

        // reduce is a terminal Function
        // it tries to converge your whole stream into a single element based on some logic
//        Integer x9 = l5.stream().reduce(0,(cur_sum,elem)->{
//            cur_sum+=elem;
//            return cur_sum;
//        });

//        System.out.println(x9);

        // Try calculating Max

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        // nested list
        System.out.println(listOfLists);

//        List<Integer> ans = listOfLists.stream().flatMap(elem -> {
//            return elem.stream();
//        }).collect(Collectors.toList());

//        List<Integer> ans = listOfLists.stream().flatMap(elem -> {
//            return elem.stream().map(elem1 -> elem1*elem1);
//        }).collect(Collectors.toList());
//
//        System.out.println(ans);

//        Predicate


//        l2.stream().filter(elem-> elem%2==0).findFirst();
        List<Integer> l6 = List.of(4,7,2,6);
        Stream<Integer> stnew = l6.stream();
        stnew = stnew.distinct();
        stnew = stnew.filter(elem ->{
            System.out.println("Print Hello World");
            return elem%2==0;
        });

        Optional<Integer> test2 = stnew.findFirst();
        System.out.println(test2);


    }




}
