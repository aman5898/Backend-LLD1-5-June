package Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Client {
    public static void main(String[] args) {
//        Pair<Integer,Integer> p1 = new Pair<>(5,4);
//        p1.setFirst(5);
//        System.out.println(p1.getFirst());
//
//        Pair<String,Integer> p2 = new Pair<>("Hello",5);
//        p2.setFirst("Hello");
////        p2.first = 500;
//        System.out.println(p2.getFirst());
//
//        List<Integer> list = new ArrayList<>();
//
//        // Raw types
//        // This is allowed because of backward compatibility
//        Pair p = new Pair();
//        p.first = "India";
//        p.second = "Winner";
//
//        p.first = 5;

//        HashMap map = new HashMap();
//        map.put("India","Winner");
//        map.put(151,"Winner");
//        HashMap<Object,Object> map = new HashMap<>();

//        Pair.doSomething(50.32);

//        Pair<Integer,String> p1 = new Pair<>();
//        p1.first = 5;
//        System.out.println(p1.doAgain(10,"Puneet",55,45));

        List<Dog> dogs = new ArrayList<>();
//        dogs.add(new Animal(""));
        dogs.add(new Dog("Tobby"));
        dogs.add(new Dog("Tommy"));
//        dogs.add(new Cat)

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Tom"));
        animals.add(new Dog("Tom1"));

//        List<Dog> cats = new ArrayList<>();
////        dogs.add(new Animal(""));
//        cats.add(new cat("Tobby"));
//        dogs.add(new cat("Tommy"));

//        AnimalUtility.printAnimalNames(dogs);
//        List<Dog>
//        AnimalUtility.printAnimalNames(animals);
//        AnimalUtility2<Dog> an= new AnimalUtility2<>();
    }
}

// Generic Types,
// Raw Types
// Generic Methods
