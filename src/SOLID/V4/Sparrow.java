package SOLID.V4;

public class Sparrow extends BirdV4 implements Flyable {

    FlyLow fh = new FlyLow();

    @Override
    public void fly() {
        fh.flyLow();
    }

    @Override
    void makeSound() {

    }
}