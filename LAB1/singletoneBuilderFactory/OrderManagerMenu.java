package LAB1.singletoneBuilderFactory;

import LAB1.singletoneBuilderFactory.factoryOrderProcessing.OrderProcessor;
import LAB1.singletoneBuilderFactory.factoryOrderProcessing.OrderProcessorFactory;
import LAB1.singletoneBuilderFactory.orderBuilder.OrderBuilder;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OrderManagerMenu {
    public static void main(String[] args) {
        OrderManager orderManager = OrderManager.getInstance();
        OrderProcessorFactory orderProcessorFactory = new OrderProcessorFactory();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        while (choice != 4) {
            System.out.println("1. Add order");
            System.out.println("2. Remove order");
            System.out.println("3. Show orders");
            System.out.println("4. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter customer name: ");
                    String customerName = scanner.nextLine();
                    System.out.println("Enter products separated by commas: ");
                    String productsString = scanner.nextLine();
                    List<String> productsList = Arrays.asList(productsString.split("\\s*,\\s*"));
                    System.out.println("Enter price: ");
                    double price = Double.parseDouble(scanner.nextLine());

                    OrderBuilder orderBuilder = new OrderBuilder();
                    orderBuilder.setId(id);
                    orderBuilder.setCustomerName(customerName);
                    orderBuilder.setProducts(productsList);
                    orderBuilder.setPrice(price);
                    orderManager.addOrder(orderBuilder.build());

                    OrderProcessor orderProcessor = orderProcessorFactory.orderProcessor(orderBuilder.build());
                    orderProcessor.processOrder();
                    break;
                case 2:
                    System.out.println("Enter id: ");
                    int idToRemove = scanner.nextInt();
                    orderManager.getOrderList().removeIf(order -> order.getId() == idToRemove);
                    break;
                case 3:
                    if (orderManager.getOrderList().isEmpty()) {
                        System.out.println("No orders");
                        break;
                    }
                    orderManager.getOrderList().forEach(System.out::println);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
