package lab2.facade;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Vehicle {
    private String licensePlate;
    private LocalDateTime entryDate;

    public Vehicle(String licensePlate, LocalDateTime entryDate) {
        this.licensePlate = licensePlate;
        this.entryDate = entryDate;
    }
}
