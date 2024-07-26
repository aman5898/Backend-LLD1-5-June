package Decorator;

public abstract class AddOn implements Beverage {
    Beverage beverage;

    public AddOn(Beverage b) {
        this.beverage = b;
    }
}
