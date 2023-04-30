package lab1.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PoliceCarManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        List<PoliceCar> policeCars = new ArrayList<>();

        System.out.println("Welcome to Republic of Moldova police department!");
        System.out.println("================================");
        while (true) {
            System.out.println("Enter your choice: ");
            System.out.println("1. Add new police car");
            System.out.println("2. Clone police car");
            System.out.println("3. Show police cars");
            System.out.println("4. Exit");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Enter car id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter car mark: ");
                    String mark = scanner.nextLine();
                    System.out.println("Enter car model: ");
                    String model = scanner.nextLine();
                    System.out.println("Enter car year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter car plate number: ");
                    String plateNumber = scanner.nextLine();
                    PoliceCar policeCar = new PoliceCar(id, mark, model, year, plateNumber);
                    policeCars.add(policeCar);
                    break;
                case "2":
                    PoliceCar carToClone = null;
                    System.out.println("Enter car id to clone: ");
                    int carId = Integer.parseInt(scanner.nextLine());
                    for (PoliceCar car : policeCars) {
                        if (car.getId() == carId) {
                            try {
                                carToClone = car.clone();
                            } catch (CloneNotSupportedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    System.out.println("Enter new car number plates: ");
                    String newPlateNumber = scanner.nextLine();
                    assert carToClone != null;
                    carToClone.setPlateNumber(newPlateNumber);
                    carToClone.setId(policeCars.size() + 1);
                    policeCars.add(carToClone);
                    break;
                case "3":
                    if (policeCars.isEmpty()) {
                        System.out.println("No cars");
                        break;
                    }
                    policeCars.forEach(System.out::println);
                    break;
                case "4":
                    System.exit(0);
            }
        }

    }
}
