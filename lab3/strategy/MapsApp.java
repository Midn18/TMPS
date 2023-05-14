package lab3.strategy;

import lab3.strategy.strategies.LeuseniCustomsStrategy;
import lab3.strategy.strategies.SculeniCustomsStrategy;

import java.util.Scanner;

public class MapsApp {
    public static void main(String[] args) {
        OpenGoogleMaps openGoogleMaps;
        Scanner scanner = new Scanner(System.in);
        String choice;

        while (true) {
            System.out.println("Select perfect option for you: ");
            System.out.println("1. Sculeni customs");
            System.out.println("2. Leuseni customs");
            System.out.println("3. Exit");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    openGoogleMaps = new OpenGoogleMaps(new SculeniCustomsStrategy());
                    openGoogleMaps.openMap();
                    break;
                case "2":
                    openGoogleMaps = new OpenGoogleMaps(new LeuseniCustomsStrategy());
                    openGoogleMaps.openMap();
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
