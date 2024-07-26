package Decorator;

public class Client {
    public static void main(String[] args) {
        Beverage b = new DarkRoast();
        b = new Milk(b);
        b = new Mocha(b);
        System.out.println(b.getCost());
    }
}
