package lab3.visitor;

import lab3.visitor.carTypes.Car;
import lab3.visitor.carTypes.Sedan;
import lab3.visitor.carTypes.SportsCar;
import lab3.visitor.visitors.CarListingVisitor;

import java.util.Scanner;

public class CarShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarDealer inventory = new CarDealer();

        while (true) {
            System.out.println("1. Add sedan");
            System.out.println("2. Add sports car");
            System.out.println("3. View cars");
            System.out.println("0. Exit");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Insert mark:");
                    String make = scanner.nextLine();

                    System.out.println("Insert model:");
                    String model = scanner.nextLine();

                    System.out.println("Insert year:");
                    int year = Integer.parseInt(scanner.nextLine());

                    Car sedan = new Sedan(make, model, year);
                    inventory.addCar(sedan);

                    System.out.println("Sedan was added successfully!");
                    break;

                case 2:
                    System.out.println("Insert mark:");
                    make = scanner.nextLine();

                    System.out.println("Insert model:");
                    model = scanner.nextLine();

                    System.out.println("Insert year:");
                    year = Integer.parseInt(scanner.nextLine());

                    Car sportsCar = new SportsCar(make, model, year);
                    inventory.addCar(sportsCar);

                    System.out.println("Sports car was added successfully");
                    break;

                case 3:
                    CarListingVisitor visitor = new CarListingVisitor(inventory.getCars());
                    inventory.accept(visitor);

                    for (Car car : visitor.getCars()) {
                        if (car instanceof Sedan) {
                            Sedan sedanCar = (Sedan) car;
                            System.out.println("Sedan: " + sedanCar.getMark() + " " + sedanCar.getModel() + " (" + sedanCar.getYear() + ")");
                        } else if (car instanceof SportsCar) {
                            SportsCar sportsCar1 = (SportsCar) car;
                            System.out.println("Sports car: " + sportsCar1.getMark() + " " + sportsCar1.getModel() + " (" + sportsCar1.getYear() + ")");
                        }
                    }
                    break;
                case 0:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}
