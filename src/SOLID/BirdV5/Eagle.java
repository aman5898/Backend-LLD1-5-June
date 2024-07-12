package SOLID.BirdV5;

public class Eagle extends BirdV5 implements Flyable {
    private FlyingBehaviour fh;

    Eagle(FlyingBehaviour fh){
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