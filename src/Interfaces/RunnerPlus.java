package Interfaces;

public interface RunnerPlus {
    public void run();

    default void walk(){
        System.out.println("Interface RunnerPlus Walking");
    }

    // Static functions are added in interfaces for utility Purpose only
    static void domeSomething(){
        System.out.println("RunnerPlus Do Something");
    }
}
