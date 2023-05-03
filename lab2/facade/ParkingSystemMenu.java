package lab2.facade;

import lab2.facade.parking.ParkingSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ParkingSystemMenu {
    private static ParkingSystem parkingSystem = new ParkingSystem();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String licensePlate;
        boolean quit = false;

        while (!quit) {
            System.out.println("Enter '1' to park a car");
            System.out.println("Enter '2' to exit parking lot");
            System.out.println("Enter '0' to quit");
            String choice = reader.readLine();
            switch (choice) {
                case "1":
                    System.out.print("Enter license plate number: ");
                    licensePlate = reader.readLine();
                    parkingSystem.park(licensePlate);
                    System.out.println("Car with license plate number " + licensePlate + " parked successfully!");
                    break;
                case "2":
                    System.out.print("Enter license plate number: ");
                    licensePlate = reader.readLine();
                    parkingSystem.exitParkingLot(licensePlate);
                    break;
                case "0":
                    quit = true;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
