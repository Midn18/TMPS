package LAB1.abstractFactory;

import LAB1.abstractFactory.animalTypes.domesticAnimal.DomesticAnimalFactory;
import LAB1.abstractFactory.animalTypes.domesticAnimal.DomesticAnimalFactoryImpl;
import LAB1.abstractFactory.animalTypes.wildAnimal.WildAnimalFactory;
import LAB1.abstractFactory.animalTypes.wildAnimal.WildAnimalFactoryImpl;

import java.util.Scanner;

public class LearnAnimalsApplication {
    public static void main(String[] args) {
        DomesticAnimalFactory domesticAnimalFactory = new DomesticAnimalFactoryImpl();
        WildAnimalFactory wildAnimalFactory = new WildAnimalFactoryImpl();

        Scanner scanner = new Scanner(System.in);
        String choice;

        System.out.println("Welcome to the animal factory!");
        System.out.println("================================");
        System.out.println("Let's learn animals!");
        while (true) {
            System.out.println("Enter animal type: ");
            System.out.println("1. Domestic");
            System.out.println("2. Wild");
            System.out.println("3. Exit");
            choice = scanner.nextLine();

            if (choice.equals("1")) {
                while (!choice.equals("3")) {
                    System.out.println("Enter animal name: ");
                    System.out.println("1. Cat");
                    System.out.println("2. Dog");
                    System.out.println("3. Back to main menu");
                    choice = scanner.nextLine();
                    switch (choice) {
                        case "1":
                            Animal cat = domesticAnimalFactory.createAnimal("cat");
                            System.out.println("Cat is : " + domesticAnimalFactory.createAnimal("cat").getType());
                            System.out.println("Cat says: ");
                            cat.animalSound();
                            break;
                        case "2":
                            Animal dog = domesticAnimalFactory.createAnimal("dog");
                            System.out.println("Dog is : " + domesticAnimalFactory.createAnimal("dog").getType());
                            System.out.println("Dog says: ");
                            dog.animalSound();
                            break;
                        case "3":
                            break;
                    }
                }
            } else if (choice.equals("2")) {
                while (!choice.equals("3")) {
                    System.out.println("Enter animal name: ");
                    System.out.println("1. Lion");
                    System.out.println("2. Wolf");
                    System.out.println("3. Back to main menu");
                    choice = scanner.nextLine();
                    switch (choice) {
                        case "1":
                            Animal lion = wildAnimalFactory.createAnimal("lion");
                            System.out.println("Lion is : " + wildAnimalFactory.createAnimal("lion").getType());
                            System.out.println("Lion says: ");
                            lion.animalSound();
                            break;
                        case "2":
                            Animal wolf = wildAnimalFactory.createAnimal("wolf");
                            System.out.println("Wolf is : " + wildAnimalFactory.createAnimal("wolf").getType());
                            System.out.println("Wolf says: ");
                            wolf.animalSound();
                            break;
                        case "3":
                            break;
                    }
                }
            } else {
                System.out.println("Goodbye!");
                break;
            }
        }
    }
}
