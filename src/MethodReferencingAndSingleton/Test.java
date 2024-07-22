package MethodReferencingAndSingleton;

import java.util.ArrayList;
import java.util.List;

public class Test {

    private static class Helper{

        Helper(){
            System.out.println("Hello World");
        }

        Helper(int x){
            System.out.println("Constructor -> " + x);
        }

        public static void StaticMethod(int x){
            System.out.println("StaticMethod -> "+x);
        }

        public void instanceMethod(int x){
            System.out.println("InstanceMethod -> "+x);
        }
    }

    public static void Ipad(int x){
        System.out.println("Ipad -> "+x);
    }

//    function (x){
//        System.out.println(x);
//    }

    static int Rajen(int a, int b){
        return a-b;
    }

    int puneet(int a, int b){
        return a%b;
    }

    public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);

//            list.stream().forEach(x->System.out.println(x));
//        list.stream().map()

//        list.sort((a,b)->{
//            return a-b;
//        });

        list.sort(new Test()::puneet);

//        list.stream().forEach(Helper::StaticMethod);
//            list.stream().forEach(System.out::println);
//                list.stream().forEach(Test::Ipad);
//        list.stream().forEach(new Helper()::instanceMethod);
//
//        Helper hp = new Helper(5);
//
//        list.stream().forEach(hp::instanceMethod);

//        list.stream().forEach(Helper::new);

//        list.stream().forEach(Helper::instanceMethod);
    }
}