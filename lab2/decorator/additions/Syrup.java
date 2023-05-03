package lab2.decorator.additions;

import lab2.decorator.drinkTypes.Drink;

public class Syrup extends CondimentDecorator{
    Drink drink;

    public Syrup(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Syrup";
    }

    @Override
    public double cost() {
        return drink.cost() + 3.00;
    }
}
