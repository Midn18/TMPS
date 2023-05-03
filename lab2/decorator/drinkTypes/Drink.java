package lab2.decorator.drinkTypes;

public abstract class Drink{
    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
