package lab2.decorator.additions;

import lab2.decorator.drinkTypes.Drink;

public class Cinnamon extends CondimentDecorator{
    Drink drink;

    public Cinnamon(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Cinnamon";
    }

    @Override
    public double cost() {
        return drink.cost();
    }
}
