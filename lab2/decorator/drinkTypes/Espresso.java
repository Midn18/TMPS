package lab2.decorator.drinkTypes;

public class Espresso extends Drink {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 14.00;
    }
}
