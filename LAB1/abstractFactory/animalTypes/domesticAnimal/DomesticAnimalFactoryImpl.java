package LAB1.abstractFactory.animalTypes.domesticAnimal;

import LAB1.abstractFactory.Animal;
import LAB1.abstractFactory.animals.domestic.Cat;
import LAB1.abstractFactory.animals.domestic.Dog;

public class DomesticAnimalFactoryImpl implements DomesticAnimalFactory {
    @Override
    public Animal createAnimal(String animalName) {
        switch (animalName) {
            case "cat":
                return new Cat();
            case "dog":
                return new Dog();
            default:
                throw new RuntimeException("No such animal");
        }
    }
}
