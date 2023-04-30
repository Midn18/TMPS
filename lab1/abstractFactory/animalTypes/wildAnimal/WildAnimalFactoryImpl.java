package lab1.abstractFactory.animalTypes.wildAnimal;

import lab1.abstractFactory.Animal;
import lab1.abstractFactory.animals.wild.Lion;
import lab1.abstractFactory.animals.wild.Wolf;

public class WildAnimalFactoryImpl implements WildAnimalFactory{
    @Override
    public Animal createAnimal(String animalName) {
        switch (animalName) {
            case "lion":
                return new Lion();
            case "wolf":
                return new Wolf();
            default:
                throw new RuntimeException("No such animal");
        }
    }
}
