package lab2.decorator.drinkTypes;

public class Americano extends Drink {

    public Americano() {
        description = "Americano";
    }

    @Override
    public double cost() {
        return 16.00;
    }
}
