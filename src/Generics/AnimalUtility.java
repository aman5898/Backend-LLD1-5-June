package Generics;

import inheritanceAndConstructors.A;

import java.util.List;

public class AnimalUtility {
//    public static void printAnimalNames(List<Animal> animals) {
//        for (Animal animal : animals) {
//            System.out.println(animal.name);
//        }
//    }

    // Generic Method with UpperBound on Animal Class
    public static <T extends Animal> List<T> printAnimalNames(List<T> animals) {
//        animals.add(new Animal("Elephant"));
        animals.add(null);
        animals.remove(animals.size() - 1);
        for (Animal animal : animals) {
            System.out.println(animal.name);
        }
        return animals;
    }

    public static void printAnimalNames2(List<? extends Animal> animals) {
//        animals.add(new Animal("Elephant"));
//        animals.add(null);
        animals.remove(animals.size() - 1);
        for (Animal animal : animals) {
            System.out.println(animal.name);
        }
    }
}
