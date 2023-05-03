package lab2.decorator.additions;

import lab2.decorator.drinkTypes.Drink;

public class Sugar extends CondimentDecorator{
    Drink drink;

    public Sugar(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Sugar";
    }

    @Override
    public double cost() {
        return drink.cost();
    }
}
