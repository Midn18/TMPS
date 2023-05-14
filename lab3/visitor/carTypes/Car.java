package lab3.visitor.carTypes;

import lab3.visitor.visitors.CarVisitor;

public interface Car {
    void accept(CarVisitor visitor);
}
