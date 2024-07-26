package Decorator;

public class Milk extends AddOn {
    public Milk(Beverage b) {
        super(b);
    }

    @Override
    public int getCost() {
//        return this.beverage.getCost() + 2;
        return 2;
    }

    @Override
    public void getDesc() {
        this.beverage.getDesc();
        System.out.println("Milk");
    }
}
