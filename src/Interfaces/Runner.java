package Interfaces;

public interface Runner {

//    Any data member in interfaces is final static and public
//    So basically it's a constant
    int x = 5;

    void run();

    default void walk(){
        System.out.println("Interface Runner Walking");
    }

    // Static functions are added in interfaces for utility Purpose only
    static void domeSomething(){
        System.out.println("Runner Do Something");
    }
}
