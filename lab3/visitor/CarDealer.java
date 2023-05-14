package lab3.visitor;

import lab3.visitor.carTypes.Car;
import lab3.visitor.carTypes.Sedan;
import lab3.visitor.carTypes.SportsCar;
import lab3.visitor.visitors.CarVisitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarDealer {
    private final List<Car> cars = new ArrayList<>();

    public CarDealer() {
        populateCars();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getCars() {
        return cars;
    }

    public void accept(CarVisitor visitor) {
        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            car.accept(visitor);
        }
    }

    private void populateCars() {
        cars.add(new Sedan("Toyota", "Camry", 2015));
        cars.add(new Sedan("Honda", "Accord", 2020));
        cars.add(new SportsCar("Porsche", "911", 2021));
        cars.add(new Sedan("Nissan", "Altima", 2018));
        cars.add(new SportsCar("Ferrari", "488 GTB", 2019));
    }
}
