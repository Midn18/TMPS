package lab2.decorator.drinkTypes;

public class Cappuccino extends Drink {

    public Cappuccino() {
        description = "Cappuccino";
    }

    @Override
    public double cost() {
        return 24.00;
    }
}
