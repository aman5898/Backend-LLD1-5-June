package Interfaces;

public class Dog extends Animal implements Runner,RunnerPlus{

    @Override
    public void run() {
//        System.out.println(xr);
        System.out.println("Dog is running");
    }

//    public void walk(){
//        System.out.println("Dog Walking");
//    }
}
