package lab3.visitor.visitors;

import lab3.visitor.carTypes.Car;
import lab3.visitor.carTypes.Sedan;
import lab3.visitor.carTypes.SportsCar;

import java.util.List;

public class CarListingVisitor implements CarVisitor {
    private List<Car> cars;

    public CarListingVisitor(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public void visit(Sedan sedan) {
        if (!cars.contains(sedan)) {
            cars.add(sedan);
        }
    }

    @Override
    public void visit(SportsCar sportsCar) {
        if (!cars.contains(sportsCar)) {
            cars.add(sportsCar);
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}
