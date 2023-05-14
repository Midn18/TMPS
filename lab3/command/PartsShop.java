package lab3.command;

import lab3.command.commandTypes.OrderBrakesCommand;
import lab3.command.commandTypes.OrderTiresCommand;

import java.util.Scanner;

public class PartsShop {
    public static void main(String[] args) {
        PartsStoreOptions partsStoreOptions = new PartsStoreOptions();

        OrderBrakesCommand orderBrakesCommand = new OrderBrakesCommand(partsStoreOptions);
        OrderTiresCommand orderOilFilterCommand = new OrderTiresCommand(partsStoreOptions);

        StoreManager storeManager = new StoreManager();
        storeManager.setOrderBrakesCommand(orderBrakesCommand);
        storeManager.setOrderTiresCommand(orderOilFilterCommand);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter command: (1) Order Brakes, (2) Order Tires, (3) Quit");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    storeManager.orderBrakes();
                    break;
                case "2":
                    storeManager.orderTires();
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }
    }
}
