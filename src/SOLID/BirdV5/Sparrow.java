package SOLID.BirdV5;

public class Sparrow extends BirdV5 implements Flyable {

    private FlyingBehaviour fh;

    Sparrow(FlyingBehaviour fh){
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