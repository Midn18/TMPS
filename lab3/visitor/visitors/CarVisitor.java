package lab3.visitor.visitors;

import lab3.visitor.carTypes.Sedan;
import lab3.visitor.carTypes.SportsCar;

public interface CarVisitor {
    void visit(Sedan sedan);
    void visit(SportsCar sportsCar);
}
