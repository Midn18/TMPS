package lab2.decorator.drinkTypes;

public class Latte extends Drink {

    public Latte() {
        description = "Latte";
    }

    @Override
    public double cost() {
        return 28.00;
    }
}
