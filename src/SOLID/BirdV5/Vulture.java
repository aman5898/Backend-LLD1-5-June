package SOLID.BirdV5;

public class Vulture extends BirdV5 implements Flyable {

    private FlyingBehaviour fh;

    Vulture(FlyingBehaviour fh){
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