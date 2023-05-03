package lab2.decorator.additions;

import lab2.decorator.drinkTypes.Drink;

public class Milk extends CondimentDecorator{
    Drink drink;

    public Milk(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return drink.cost() + 5.00;
    }
}
