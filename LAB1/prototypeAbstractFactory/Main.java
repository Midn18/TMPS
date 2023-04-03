package LAB1.prototypeAbstractFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("What do you want to convert?");
            System.out.println("1. Km to Mile");
            System.out.println("2. Mile to Km");
            System.out.println("3. Centimeter to Inch");
            int choice = scanner.nextInt();
            while (choice < 1 || choice > 3) {
                System.out.println("Wrong choice. Try again.");
                choice = scanner.nextInt();
            }
            switch (choice) {
                case 1:
                    System.out.println("Enter value to convert: ");
                    double value = scanner.nextDouble();
                    System.out.println("Result: " + ConverterFactoryPrototype.getPrototype("KmToMile").convert(value));
                    break;
                case 2:
                    System.out.println("Enter value to convert: ");
                    value = scanner.nextDouble();
                    System.out.println("Result: " + ConverterFactoryPrototype.getPrototype("MileToKm").convert(value));
                    break;
                case 3:
                    System.out.println("Enter value to convert: ");
                    value = scanner.nextDouble();
                    System.out.println("Result: " + ConverterFactoryPrototype.getPrototype("CentimeterToInch").convert(value));
                    break;
            }
        }
    }
}