package lab3.visitor.carTypes;

import lab3.visitor.visitors.CarVisitor;
import lombok.Data;

@Data
public class Sedan implements Car {
    private String mark;
    private String model;
    private int year;

    public Sedan(String mark, String model, int year) {
        this.mark = mark;
        this.model = model;
        this.year = year;
    }

    @Override
    public void accept(CarVisitor visitor) {
        visitor.visit(this);
    }
}
