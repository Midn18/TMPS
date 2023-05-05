package lab2.decorator;

import lab2.decorator.additions.Cinnamon;
import lab2.decorator.additions.Milk;
import lab2.decorator.additions.Sugar;
import lab2.decorator.additions.Syrup;
import lab2.decorator.drinkTypes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StefaniaCoffee {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Drink> order = new ArrayList<>();
        String choice;

        System.out.println("Welcome to Stefania's Coffee Shop!");
        System.out.println("What would you like to order?");

        while (true) {
            System.out.println("1. Espresso");
            System.out.println("2. Americano");
            System.out.println("3. Cappuccino");
            System.out.println("4. Latte");
            System.out.println("5. Show order");
            System.out.println("6. Exit");
            choice = scanner.nextLine();

            if (choice.equals("6")) {
                break;
            }
            switch (choice) {
                case "1":
                    Drink espresso = new Espresso();
                    System.out.println("Would you like to add some condiments? y/n");
                    espresso = condimentMenu(scanner.nextLine(), espresso);
                    printOrder(espresso);
                    order.add(espresso);
                    break;
                case "2":
                    Drink americano = new Americano();
                    System.out.println("Would you like to add some condiments? y/n");
                    americano = condimentMenu(scanner.nextLine(), americano);
                    printOrder(americano);
                    order.add(americano);
                    break;
                case "3":
                    Drink cappuccino = new Cappuccino();
                    System.out.println("Would you like to add some condiments? y/n");
                    cappuccino = condimentMenu(scanner.nextLine(), cappuccino);
                    printOrder(cappuccino);
                    order.add(cappuccino);
                    break;
                case "4":
                    Drink latte = new Latte();
                    System.out.println("Would you like to add some condiments? y/n");
                    latte = condimentMenu(scanner.nextLine(), latte);
                    printOrder(latte);
                    order.add(latte);
                    break;
                case "5":
                    System.out.println("Your order:");
                    for (Drink drink : order) {
                        System.out.println(drink.getDescription() + " " + drink.cost() + " lei");
                    }
                    break;
                default:
                    System.out.println("Wrong input. Try again");
                    break;
            }
        }
    }

    private static Drink condimentMenu(String choice, Drink drink) {
        if (choice.equals("y")) {
            while (true) {
                System.out.println("1. Milk");
                System.out.println("2. Sugar");
                System.out.println("3. Cinnamon");
                System.out.println("4. Syrup");
                System.out.println("5. No, thanks");

                choice = new Scanner(System.in).nextLine();
                if (choice.equals("5")) {
                    break;
                }
                switch (choice) {
                    case "1":
                        drink = new Milk(drink);
                        break;
                    case "2":
                        drink = new Sugar(drink);
                        break;
                    case "3":
                        drink = new Cinnamon(drink);
                        break;
                    case "4":
                        drink = new Syrup(drink);
                        break;
                    default:
                        System.out.println("Wrong input. Try again");
                        break;
                }
            }
        } else if (!choice.equals("n")) {
            System.out.println("Wrong input. Try again");
        } else {
            System.out.println("No condiments added");
        }
        return drink;
    }

    private static void printOrder(Drink drink) {
        System.out.println("Your order is: " + drink.getDescription());
        System.out.println("Your total is: " + drink.cost());
    }
}
