package lab2.facade.parking;

import lab2.facade.Vehicle;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class ParkingSystem {
    private ParkingLot parkingLot;
    private PaymentSystem paymentSystem;

    public ParkingSystem() {
        parkingLot = new ParkingLot();
        paymentSystem = new PaymentSystem();
    }

    public void park(String licensePlate) {
        Vehicle car = new Vehicle(licensePlate, LocalDateTime.now());
        parkingLot.parkCar(car);
    }

    public void exitParkingLot(String licensePlate) {
        Vehicle car = findCarByLicensePlate(licensePlate);
        if (car != null) {
            BigDecimal parkingFee = parkingLot.calculateParkingFee(car);
            paymentSystem.makePayment(parkingFee);
            parkingLot.removeCar(car);
        } else {
            System.out.println("Car not found in parking lot!");
        }
    }

    private Vehicle findCarByLicensePlate(String licensePlate) {
        List<Vehicle> parkedCars = parkingLot.getParkedCars();
        for (Vehicle car : parkedCars) {
            if (car.getLicensePlate().equals(licensePlate)) {
                return car;
            }
        }
        return null;
    }
}
