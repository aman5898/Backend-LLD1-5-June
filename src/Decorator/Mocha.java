package Decorator;

public class Mocha extends AddOn {
    public Mocha(Beverage b) {
        super(b);
    }

    @Override
    public int getCost() {
        return this.beverage.getCost() + 20;
    }

    @Override
    public void getDesc() {
        this.beverage.getDesc();
        System.out.println("Mocha");
    }
}
