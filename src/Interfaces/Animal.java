package Interfaces;

public abstract class Animal {
    private int id;
    int noOfLegs;
    String type;

    void eat(){
        System.out.println("Animal Eating");
    }

//    abstract void walk();
    public void walk(){
        System.out.println("Animal Walking");
    }
}
