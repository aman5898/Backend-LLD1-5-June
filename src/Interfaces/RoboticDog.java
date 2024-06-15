package Interfaces;

public class RoboticDog implements Runner {


    // you can never decrease visibility of a function in inheritance
    @Override
    public void run() {
        System.out.println("Robotic Dog is running");
    }
}
