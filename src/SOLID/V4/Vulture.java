package SOLID.V4;

public class Vulture extends BirdV4 implements Flyable {

    FlyHigh fh = new FlyHigh();

    @Override
    public void fly() {
        fh.flyHigh();
    }

    @Override
    void makeSound() {

    }
}