package Interfaces;


 abstract class Horse {
    public String identifyMyself() {
        return "I am a horse.";
    }
}
 interface Flyer {
    default public String identifyMyself() {
        return "I am able to fly.";
    }
}
 interface Mythical {
    default public String identifyMyself() {
        return "I am a mythical creature.";
    }
}
 class Pegasus extends Horse implements Flyer, Mythical {

}


public class Test {


    public static void main(String[] args) {
        Pegasus myApp = new Pegasus();
        System.out.println(myApp.identifyMyself());
    }



}
