package lab2.facade.parking;

import lab2.facade.Vehicle;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<Vehicle> parkedCars = new ArrayList<>();

    public void parkCar(Vehicle car) {
        parkedCars.add(car);
    }

    public BigDecimal calculateParkingFee(Vehicle car) {
        LocalDateTime entryTime = car.getEntryDate();
        LocalDateTime exitTime = LocalDateTime.now();
        Duration parkingDuration = Duration.between(entryTime, exitTime);
        long minutesParked = parkingDuration.toMinutes();
        if (minutesParked > 1) {
            long extraMinutes = minutesParked - 1;
            return new BigDecimal(extraMinutes).multiply(new BigDecimal("2"));
        } else {
            return BigDecimal.ZERO;
        }
    }

    public void removeCar(Vehicle car) {
        parkedCars.remove(car);
    }

    public List<Vehicle> getParkedCars() {
        return parkedCars;
    }
}
