package SOLID.BirdV5;

public class Pigeon extends BirdV5 implements Flyable {
    private FlyingBehaviour fh;

    Pigeon(FlyingBehaviour fh){
        this.fh = fh;
    }

    @Override
    public void fly() {
        fh.makeFly();
    }

    @Override
    void makeSound() {

    }
}